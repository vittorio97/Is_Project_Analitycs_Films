package controller.search;

	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.Collection;

	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	
	import bean.Film;
	import model.SearchManager;

	/**
	 * Servlet class SearchFilm
	 */
	@WebServlet("/SearchFilm")
	public class SearchFilm extends HttpServlet {
		private static final long serialVersionUID = 1L;
		private SearchManager manager = new SearchManager();

	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public SearchFilm() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String titolo= request.getParameter("titoloFilm");
			Collection <Film> films =null;
			try {
				films = manager.search(titolo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getSession().setAttribute("films", films);
			
			RequestDispatcher dispatcher= request.getRequestDispatcher("FilmList.jsp");
			dispatcher.forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}


