import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class volunteerServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
//		static int uniqueID=0;
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String date = req.getParameter("birth_date");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		int pincode = Integer.parseInt(req.getParameter("pincode"));
		String message = req.getParameter("message");
		Date dob = new Date(Integer.parseInt(date.substring(0, 4)),Integer.parseInt(date.substring(5,7)),Integer.parseInt(date.substring(8,10)));
		System.out.println(dob);
		try
		{
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement st = con.prepareStatement("insert into volunteer(fName, lName, Gender, dob, email, address, state, city, pincode, message) values (?,?,?,?,?,?,?,?,?,?)");
			st.setString(1, fname);
			st.setString(2, lname);
			st.setString(3, gender);
			st.setDate(4, dob);
			st.setString(5,email);
			st.setString(6, address);
			st.setString(7, state);
			st.setString(8, city);
			st.setInt(9, pincode);
			st.setString(10, message);
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = res.getWriter();
			out.println("Successfully Registered!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
