package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlamesCheck
 */
@WebServlet("/flames")
public class FlamesCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlamesCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/check.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1 = request.getParameter("your");
		String name2 = request.getParameter("crush");

		name1 = name1.trim();
		name2 = name2.trim();
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		String name1_split[] = name1.split(" ");
		String name2_split[] = name2.split(" ");
		name1 = "";
		name2 = "";
		for (int i = 0; i < name1_split.length; i++) {
			name1 = name1 + name1_split[i];
		}
		for (int i = 0; i < name2_split.length; i++) {
			name2 = name2 + name2_split[i];
		}
		int length = name1.length() + name2.length();
		boolean name_check[] = new boolean[name2.length()];
		for (int i = 0; i < name2.length(); i++) {
			name_check[i] = false;
		}
		for (int i = 0; i < name1.length(); i++) {
			for (int j = 0; j < name2.length(); j++) {
				if ((name_check[j] == false) && (name1.charAt(i) == name2.charAt(j))) {
					name_check[j] = true;
					length = length - 2;
					break;
				}
			}
		}
		boolean flames_check[] = new boolean[6];
		for (int i = 0; i < 6; i++) {
			flames_check[i] = true;
		}
		int count = 6;
		int k = 1, deleted_letters = 0;
		int j;
		for (j = 0; j <= count; j++) {
			if (k <= length) {
				if (j == count) {
					j = 0;
				}
				if (flames_check[j] == true) {
					k = k + 1;
				}
			}
			if ((k - 1) == length) {
				deleted_letters = deleted_letters + 1;
				flames_check[j] = false;
				k = 1;
			}
			
			if (deleted_letters == 6) {
				if (j == 0) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/friends.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/friends.jsp");
				} else if (j == 1) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/lovers.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/lovers.jsp");
				} else if (j == 2) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/affection.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/affection.jsp");
				} else if (j == 3) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/marriage.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/marriage.jsp");
				} else if (j == 4) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/enemies.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/enemies.jsp");
				} else if (j == 5) {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/siblings.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/siblings.jsp");
				}
				break;
			}
		}
	}

}
