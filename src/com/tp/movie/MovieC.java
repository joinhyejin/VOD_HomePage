package com.tp.movie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tp.jsonTest.JsonDAO;
import com.tp.jsonTest.JsonDAO3;

@WebServlet("/MovieC")
public class MovieC extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieDAO.getMdao().JsonMovie(request);
//		MovieDAO.getMdao().GetAllMovie(request);
		MovieDAO.getMdao().paging(1, request); 
		request.setAttribute("contentPage", "Movie/searchMovie.jsp");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
