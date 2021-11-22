import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class contactServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String subject = req.getParameter("subject");
		String message = req.getParameter("message");
		try
		{
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement st = con.prepareStatement("insert into contact(fName, lName, email, subject, message) values(?,?,?,?,?)");
			st.setString(1, fname);
			st.setString(2, lname);
			st.setString(3, email);
			st.setString(4, subject);
			st.setString(5, message);
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = res.getWriter();
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('User or password incorrect');");
		    out.println("</script>");
			res.setContentType("text/html;charset=UTF-8");
			res.sendRedirect("./contact.html");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
