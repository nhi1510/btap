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
 * Servlet implementation class Admintrangchinh
 */
@WebServlet("/Admintrangchinh")
public class Admintrangchinh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admintrangchinh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			request.setCharacterEncoding("utf-8");
		
		     response.setCharacterEncoding("utf-8");
		     
			
		     Myphambo sbo=new Myphambo();
		     ArrayList<Myphambean> dssach=sbo.getmypham();
		    
		     
		   
		     String key=request.getParameter("key");
		    
		    	 if(key!=null)
		    		 dssach=sbo.Tim(key);
		      
		  
		     request.setAttribute("dssach", dssach);
		     RequestDispatcher rd= request.getRequestDispatcher("Admin_menu.jsp");
			 rd.forward(request, response);
			 }catch (Exception e) {
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
