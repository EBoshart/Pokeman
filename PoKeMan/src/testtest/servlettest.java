package testtest;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testtest.highscore;

/**
 * Servlet implementation class servlettest
 */
@WebServlet("/servlettest")
public class servlettest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlettest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubreq.setCharacterEncoding("UTF-8");
		if(request.getParameter("param1")!=null &&request.getParameter("param2")!=null) {
		final String par1 =  request.getParameter("param1");
		final String par2 = request.getParameter("param2");
		response.getWriter().append(par1+par2);
		System.out.println("" + par1 + par2);
		highscore  x=RitDao.create(par1, par2);
		

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		highscore send = new highscore();
		
		
		
		doGet(request, response);
	}

}
