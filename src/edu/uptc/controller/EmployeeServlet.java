package edu.uptc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.uptc.model.Employee;
import edu.uptc.model.EmployeeManager;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeManager em = new EmployeeManager();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.valueOf(request.getParameter("emp_id"));
		String idaux = request.getParameter("emp_id");
		String name = request.getParameter("emp_name");
		String email = request.getParameter("emp_email");
		long phone = Long.valueOf(request.getParameter("emp_phone"));
		String phoneaux = request.getParameter("emp_phone");

		em.addEmployee(id, name, email, phone);
		PrintWriter out;
		out = response.getWriter();
		if (em.getEmployeeList().size() > 0) {
			response.sendRedirect(request.getContextPath() + "/infoEmployee.jsp");
			for (int i = 0; i < em.totalEmployee(); i++) {
				request.getSession().setAttribute("emp_name", name);
				request.getSession().setAttribute("emp_id", idaux);
				request.getSession().setAttribute("emp_email", email);
				request.getSession().setAttribute("emp_phone", phoneaux);

			}

		}


	}

}
