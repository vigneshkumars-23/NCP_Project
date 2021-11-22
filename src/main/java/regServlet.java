import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;
import javax.mail.*;
import javax.mail.internet.*;
public class regServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		int eventNo = Integer.parseInt(req.getParameter("eventno"));
		String why = req.getParameter("why");
		String emailUpdate = "NO";
		emailUpdate = req.getParameter("emailUpdate");
		try
		{
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement st = con.prepareStatement("insert into register(fName, lName, email, phone, age, gender, eventNo, why) values(?,?,?,?,?,?,?,?)");
			st.setString(1, fName);
			st.setString(2, lName);
			st.setString(3, email);
			st.setString(4, phone);
			st.setInt(5, age);
			st.setString(6, gender);
			st.setInt(7, eventNo);
			st.setString(8, why);
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = res.getWriter();
			out.println("Registered Succesfully!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
