

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoToUser
 */
@WebServlet("/GoToUser")
public class GoToUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoToUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Address adr =new Address();
		adr.setState(request.getParameter("state"));
		adr.setAddress(request.getParameter("address"));
		adr.setCity(request.getParameter("city"));
		adr.setZip(request.getParameter("zip"));

		User user_obj = new User();
		user_obj.setAdr_obj(adr);
		user_obj.setEmail(request.getParameter("email"));
		user_obj.setId(Integer.parseInt(request.getParameter("id")));
		user_obj.setName(request.getParameter("email"));
		
		request.getSession().setAttribute("user", user_obj);
		response.setContentType("text/html");
		request.getRequestDispatcher("/output.jsp").forward(request, response);
		
	}

}
