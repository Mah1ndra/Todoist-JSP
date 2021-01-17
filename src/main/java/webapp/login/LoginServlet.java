package webapp.login;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Browser sends Http Request to Web Server
 * 
 * Code in Web Server => Input:HttpRequest, Output: HttpResponse
 * JEE with Servlets
 * 
 * Web Server responds with Http Response
 */

//Java Platform, Enterprise Edition (Java EE) JEE6

//Servlet is a Java programming language class 
//used to extend the capabilities of servers 
//that host applications accessed by means of 
//a request-response programming model.

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private LoginService validation = new LoginService();
	//private TodoService todoService = new TodoService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.setAttribute("username", request.getParameter("user"));
		request.setAttribute("password", request.getParameter("pass"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);


	}

	@Override
	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		String username = httpServletRequest.getParameter("username");
		String password = httpServletRequest.getParameter("password");


		if(validation.isValidUser(username,password)){
			httpServletRequest.getSession().setAttribute("username", username);
			httpServletRequest.setAttribute("password", password);

			httpServletResponse.sendRedirect("/todo.do");
		}else{
			httpServletRequest.setAttribute("errorMessage", "Invalid Credentials!");
			httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(httpServletRequest, httpServletResponse);

		}
	}
}
