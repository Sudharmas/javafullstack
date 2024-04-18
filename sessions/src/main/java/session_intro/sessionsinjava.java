
package session_intro;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class sessionsinjava
 */
public class sessionsinjava extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sessionsinjava() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// we can create a session for a user on a website to keep track of user experience and also generate cookies for each user
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// requesting values or parameters from login.jsp file,and storing it in variable. request..getparamater is inbuilt java function which is of type Http request performs the request operation for given file.
		// inside login.jsp,the context path is requested from this file,hence,whenever login page is submitted,it requests operation from this file and response is redirected to another file.
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("sudharma") && password.equals("12345")) {
			request.getSession().invalidate();
			// HttpSession is imported inbulit function to create sessions for a user for login and logouts.
			// request.getSession is inbulit function which  creates new session for user and that is stored in a variable of type Httpsession to create new session for user each time.
			HttpSession newSession = request.getSession();
			newSession.setMaxInactiveInterval(500);
			// response.redirect sends the response to another file,by redirecting it to another page.
			response.sendRedirect("member.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
