package cafe_java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Cafe
 */
@WebServlet("/cafelogin")
public class Cafe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 
		 String name =request.getParameter("username");
		 String password=request.getParameter("password");
		 
		 if(name.equals("kajal kumawat") && password.equals("12345"))
		 {
			 RequestDispatcher re=request.getRequestDispatcher("/form");
			 re.forward(request, response);
		 }
		 else if((name.equals("shailendra") && password.equals("12345"))
		 {
			 int a=5;
			 for(int i=5; i<5; i++)
			 {
				 int b=a;
				 for(int j=1;j<=i; j++)
				 {
					 out.println("This is my last miss take ");
				 }
				 out.println("");
			 }
			RequestDispatcher re= request.getRequestDispatcher("login.html");
		 }
		 
//		 else {
//			 out.println("This is last page in java backend ");
//			 
//		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
