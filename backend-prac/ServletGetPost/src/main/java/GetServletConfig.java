import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetServletConfig")
public class GetServletConfig extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service");
		ServletConfig sc = getServletConfig();
		String dbname = sc.getInitParameter("dbname");
		System.out.println(dbname);
		ServletContext se = getServletContext();
		String Mysql = se.getInitParameter("MySQL");
		System.out.println(Mysql);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INit");
	}

}
