package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiMundoServlet  extends HttpServlet {
	
	
	//metodo que atende o servlet, atende uma requisição
	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("oi mundo, parabens vc escreveu o primeiro servlets.");
        out.println("</body>");
        out.println("</html>");
        
        System.out.println("O servlet OiMundoServlet foi chamado");

    }
	
}
