package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Myphambean;
import bo.Myphambo;

/**
 * Servlet implementation class htcuahang
 */
@WebServlet("/htcuahang")
public class htcuahang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htcuahang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try {
				response.setCharacterEncoding("utf-8");
				request.setCharacterEncoding("utf-8");
				
				Myphambo pbo = new Myphambo();
				String ml = request.getParameter("ml");
				String key = request.getParameter("txtfind");
				
				ArrayList<Myphambean> dsmypham = pbo.getmypham();
				
				request.setAttribute("dsmypham", dsmypham);
				
				RequestDispatcher rd = request.getRequestDispatcher("cuahang.jsp");
				rd.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
