import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class donateServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String fName = req.getParameter("firstname");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		int pincode = Integer.parseInt(req.getParameter("zip"));
		String cardname = req.getParameter("cardname");
		int expmonth = Integer.parseInt(req.getParameter("expmonth"));
		int expyear = Integer.parseInt(req.getParameter("expyear"));
		int cvv = Integer.parseInt(req.getParameter("cvv"));
		try
		{
			Connection con = DatabaseConnection.initializeDatabase();
			PreparedStatement st = con.prepareStatement("insert into donate(fName, email, address, city, state, pincode, cardname, expmonth, expyear, cvv) values(?,?,?,?,?,?,?,?,?,?)");
			st.setString(1, fName);
			st.setString(2, email);
			st.setString(3, address);
			st.setString(4, city);
			st.setString(5, state);
			st.setInt(6, pincode);
			st.setString(7, cardname);
			st.setInt(8, expmonth);
			st.setInt(9, expyear);
			st.setInt(10, cvv);
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = res.getWriter();
			out.println("Donated Successfully!");
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
