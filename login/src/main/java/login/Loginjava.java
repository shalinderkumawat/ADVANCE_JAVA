package login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.filters.ExpiresFilter.XPrintWriter;


@WebServlet("/SimpleServlet")
public class Loginjava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginjava() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		 
	   response.setContentType("text/html");
	        String name = request.getParameter("userName");

	        // Write the response
	        PrintWriter out = response.getWriter();
	       
	        String password=request.getParameter("password");
	        
	        if(name.equals("Shailendra kumawat") && password.equals("12345"))
	        {
	        	RequestDispatcher re=request.getRequestDispatcher("Hii");
	        	re.forward(request, response);
	        }
	        else if(name.equals("kaja kumawat") && password.equals("12345"))
	        {
	        	out.print("<a href='https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=893980782576273003&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061782&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1'>print</a>");
	        }
	        
	        doGet(request, response);
	}

}
