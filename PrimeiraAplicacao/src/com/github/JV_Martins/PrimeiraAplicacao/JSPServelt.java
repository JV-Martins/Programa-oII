package com.github.JV_Martins.PrimeiraAplicacao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name= "/JSPServelt",
		urlPatterns = "/users")

public class JSPServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String nome  = req.getParameter("nome");

		Users user = new Users(nome,email);
		user.escritor("C:\\Users\\Victor\\Desktop\\Importante\\Apredendo.txt");
		
		req.setAttribute("nome", nome);
		req.setAttribute("email", email);
		req.getRequestDispatcher("cadastro.jsp").forward(req, resp);
		
	}

}


