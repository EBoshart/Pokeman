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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stubreq.setCharacterEncoding("UTF-8");
		if (request.getParameter("param1") != null && request.getParameter("param2") != null) {
			final String par1 = request.getParameter("param1");
			final String par2 = request.getParameter("param2");
			final String par3 = request.getParameter("ToErSa");

			if (par3 != null && par3.equals("1.337")) {
				System.out.println("" + par1 + par2 + par3);

				System.out.println("test");
				response.getWriter().append(par1 + par2 + par3);

				highscore x = HighscoreDao.create(par1, par2);

			} else {
				response.getWriter().append("wrong version");
			}

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append(GetHighscore.getHighscore().get(0).toString());

	}

}
