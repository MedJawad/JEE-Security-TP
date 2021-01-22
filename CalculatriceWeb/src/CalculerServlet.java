

import java.io.IOException;
import java.security.Principal;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculerServlet
 */
@WebServlet("/CalculerServlet")
public class CalculerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Calculate bean1;
	@EJB(name = "bean1")
	public void setbean(Calculate bean1)
	{
	   this.bean1 = bean1;
	}
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("operation");
		int nb1 = Integer.parseInt(request.getParameter("nb1"));
		int nb2 = Integer.parseInt(request.getParameter("nb2"));
		String message = "";
		Principal user = request.getUserPrincipal();
		if (user != null)
		{
			System.out.println(">>> USER : " + user.getName());
		}
		if (user == null)
		{
			System.out.println(">>> USER : is null !!!!!!!!!!!!!!! " );
		}
message = this.invoquerEjb(nb1, nb2, operation);
		
		
		request.setAttribute("message", message);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}
	private String invoquerEjb(int nb1, int nb2, String operation)
	{
		String message = "";
		try
		{
			double resultat = 0;
			

			if (operation.equals("plus"))
			{
				resultat = bean1.add(nb1, nb2);
				message = "<h2>sur EJB  : " + nb1 + " + " + nb2 + " = " + resultat + "</h2>";
			}
			else if (operation.equals("sous"))
			{
				resultat = bean1.sub(nb1, nb2);
				message = "<h2>sur EJB  : " + nb1 + " - " + nb2 + " = " + resultat + "</h2>";
			}
			else
				message = "<h2>ERREUR EJB : l'opération '" + operation + "' n'est pas supportée.</h2>";
		}
		catch (Exception e)
		{
			message = "<h2>EXCEPTION EJB </h2>" + e;
			System.out.println(e);
		}
		return message;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
