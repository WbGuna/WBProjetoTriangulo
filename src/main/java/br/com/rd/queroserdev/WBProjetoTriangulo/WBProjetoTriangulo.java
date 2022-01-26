package br.com.rd.queroserdev.WBProjetoTriangulo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WBProjetoTriangulo
 */
@WebServlet("/WBProjetoTriangulo")
public class WBProjetoTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WBProjetoTriangulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int var1, var2, var3;
		var1 = Integer.parseInt(request.getParameter("val1"));		
		var2 = Integer.parseInt(request.getParameter("val2"));
		var3 = Integer.parseInt(request.getParameter("val3"));
		
			
			if (var1 <= 0 && var2 <= 0 && var3 <= 0) {
				response.getWriter().println("Por favor Inserir valores validos.");
				
			} else if(var1 > 0 && var2 == 0 && var3 == 0 || var2 > 0 && var1 == 0 && var3 == 0 || var3 > 0 && var1 == 0 && var2 == 0 ) {
				response.getWriter().println("Isso � uma Reta.");
				
			}
			
			else if (var1 == 0 && var2 > 0 && var3 > 0 || var2 == 0 && var1 > 0 && var3 > 0 || var3 == 0 && var1 > 0 && var2 > 0 ) {
				if(var2 == var3 || var1 == var3 || var1 == var2) {
					response.getWriter().println("Isso � um quadrado");
					
				}else {
					response.getWriter().println("Isso � um retangulo.");
				}
				
			}
	}


