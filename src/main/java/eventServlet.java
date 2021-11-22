import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class eventServlet extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
    	System.out.println("Hi");
    	ArrayList<HashMap<String,String>> ar= new ArrayList<HashMap<String,String>>();

        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con= DatabaseConnection.initializeDatabase();
            Statement stmt=con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from events");
            while(rs.next()) {
            	HashMap<String,String> data1=new HashMap<String,String>();
            	data1.put("eventNo", rs.getString(1));
                data1.put("eventName",rs.getString(2));
                data1.put("eventDate",rs.getString(3));
                data1.put("eventDescription",rs.getString(4));
                ar.add(data1);
            }
//            System.out.println(count);
            stmt.close();
            con.close();
//            res.setContentType("text/html;charset=UTF-8");
//            res.sendRedirect("/Workshop_management/index.html");
            }
            catch(Exception e)
            { System.out.println(e);
            }  
//        else {
////        	res.setContentType("text/html;charset=UTF-8");
////            res.sendRedirect("/Workshop_managemen/workshop.jsp");
//        	 String name = "Passwords not matching";
        	 req.setAttribute("data", ar);
        	 req.getRequestDispatcher("/event.jsp").forward(req, res);
//        	 
//        	 
//        	 
//        }
    }  
}
