package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;


import bean.khachhangbean;
import bo.giohangbo;
import bo.khachhangbo;


/**
 * Servlet implementation class thanhtoanController
 */
@WebServlet("/thanhtoanHDController")
public class thanhtoanHDController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thanhtoanHDController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			
			HttpSession session=request.getSession(); 

			khachhangbean kh= (khachhangbean) session.getAttribute("kh");
			if(kh==null) {
				RequestDispatcher rd= request.getRequestDispatcher("dangnhap.jsp");
				rd.forward(request, response);
			}
			else {
			RequestDispatcher rd= request.getRequestDispatcher("htthanhtoan.jsp");
			rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
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

