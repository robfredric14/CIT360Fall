package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletExample
 */
//will pull the index.html input request to baseExample
//submit button will process through baseExample
@WebServlet("/baseExample")
public class MyServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//allows us to print anything
		PrintWriter printWriter= response.getWriter();
		printWriter.print("Hello there traveler ");
		//Take printed name from our html.index file
		//requests the parameter from name in our entered line
		//stores the name field from index to the string variable identifier
		String identifier = request.getParameter("name");
		//identifier is called to be output
		printWriter.print(identifier);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
