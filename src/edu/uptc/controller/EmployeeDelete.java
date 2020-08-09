package edu.uptc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uptc.model.EmployeeManager;

/**
 * Servlet implementation class EmployeeDelete
 */
@WebServlet("/EmployeeDelete")
public class EmployeeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeManager em = new EmployeeManager();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDelete() {
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
		int id = Integer.valueOf(request.getParameter("emp_id"));
		em.deleteEmployee(id);
		PrintWriter out;
	    out = response.getWriter();
        response.setContentType("text/html");
		out.println("<html>");
		out.println("<head><title>Formulario Empleado</title></head>");
		out.println("<body>");
		out.println("<h1> EMPLOYEE ELIMINADO</h1>");
		out.println("<h2> Empleado adicionado exitosamente! </h2>");
		out.println("<h2> Total de empleados:"+em.totalEmployee()+" </h2>");
		out.println("<a href=\"index.jsp\"> Volver a la página inicial!</h2>");
		out.println("</body></html>");

	}

}
