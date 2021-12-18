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

import bo.giohangbo;



/**
 * Servlet implementation class giohangController
 */
@WebServlet("/cuahangController")
public class cuahangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cuahangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
		
		
		HttpSession session=request.getSession();
		String mamp= request.getParameter("mamp");
		String ten= request.getParameter("Name");
		
		String gia= request.getParameter("Price");
		if(mamp!=null){
		//tao 
		giohangbo gh=null;
		if(session.getAttribute("gh")==null){
			gh= new giohangbo();	
			session.setAttribute("gh", gh);	
		}
		//b1: gan session vaof bien
		gh=(giohangbo)session.getAttribute("gh");
		
		session.setAttribute("gh", gh);

		}
		
		
	     
		
	    response.sendRedirect("htgioController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
