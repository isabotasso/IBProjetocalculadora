package com.proj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//		
//		int var1, var2, result;
//		var1 = Integer.parseInt(request.getParameter("alg1"));
//		var2 = Integer.parseInt(request.getParameter("alg2"));
//		result = var1 + var2;
//		
//		//response.getWriter().println("Resultado = " + result);
//		request.setAttribute("res", result);
//		request.getRequestDispatcher("/").forward(request, response);
//	

	if ((request.getParameter("alg1") != null) && (request.getParameter("alg2") != null)) {
		
		//leitura dos parametros
		int val1 = Integer.parseInt(request.getParameter("alg1"));
		int val2 = Integer.parseInt(request.getParameter("alg2"));
		
	
		// chamada da regra de negócio
			Calcular c = new Calcular(val1 , val2);
			int resultado = 0;
				
			if (request.getParameter("somar") != null) {
				 resultado = c.somar();
			}else if (request.getParameter("subtrair") != null) {
				 resultado = c.subtrair();
			}else if (request.getParameter("multiplicar") != null) {
				 resultado = c.multiplicar();
			} else {
				 resultado = c.dividir();
			}
		
		//resultado da regra de negocio
		request.setAttribute("res", resultado);
	}
	request.getRequestDispatcher("/").forward(request, response);
	}
}

	
