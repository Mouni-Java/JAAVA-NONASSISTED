package demo;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        PrintWriter out=  resp.getWriter();
		Properties props= new Properties();
		resp.setContentType("text/html");
		String ID=req.getParameter("id");
		int id=  Integer.parseInt(ID);
		InputStream in =getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	    Connection  con=DBConfig.getConnection(props);
		if(con!=null) {
			out.println("Displaying the product details:");
			out.println("<br>");
			try {
				
				//Statement stmt = con.createStatement();
				PreparedStatement stmt=con.prepareStatement("select *from eproduct where id=?");
				stmt.setInt(1, id);
				 ResultSet rs=stmt.executeQuery();
				
				while(rs.next()) {
					out.println(rs.getInt(1)+" ,"+rs.getString(2)+", "
							+rs.getBigDecimal(3)+", "
							+rs.getTimestamp(4)+"<br>");
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		else{
			
			out.print("Error While Connecting Connections");
		}
		}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	}
