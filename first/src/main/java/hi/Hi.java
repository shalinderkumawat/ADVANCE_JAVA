package hi;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/form")
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Hi() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String age=request.getParameter("age");
//		String email=request.getParameter("email");
		
		if(name.equals("shailendra") && age.equals("18"))
		{
			RequestDispatcher re=request.getRequestDispatcher("Hii");
			re.forward(request, response);
		}
		else 
		{
		 out.println("This is new ");
		}
		
		
	}

	private String getParameter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
