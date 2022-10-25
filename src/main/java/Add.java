

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Add() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		int num3=Integer.parseInt(request.getParameter("third"));
		int num4=Integer.parseInt(request.getParameter("fourth"));
		int num5=Integer.parseInt(request.getParameter("fifth"));
		int num6=Integer.parseInt(request.getParameter("sixth"));
		
		int sum=(num1+num2+num3+num4+num5+num6);
		out.print("THE TOTAL SCORE IS = "+sum);
		out.println("<body>");
        out.println("<html>");
        out.println("<button onclick=location.href='register.html'; align=\"center\" class=\"btn btn-primary\" >Back</button>");
        out.println("</body>");
        out.println("</html>");

	}

}
