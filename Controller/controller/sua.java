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

import bean.Myphambean;
import bean.giohangbean;
import bo.Myphambo;
import bo.giohangbo;


/**
 * Servlet implementation class suaController
 */
@WebServlet("/sua")
public class sua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sua() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
	
	     Myphambo sbo=new Myphambo();
	     ArrayList<Myphambean> dsmypham = null;
		try {
			dsmypham = sbo.getmypham();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	     
	    
		HttpSession session=request.getSession();
		String Mamp=request.getParameter("Mamp"); //Lay ve ma sach
		
	
		String sl = request.getParameter("txtsoluong");
		String mssua = request.getParameter("btnsua");
		String msxoa = request.getParameter("btnxoa");
		
		
		giohangbo gh1=(giohangbo)session.getAttribute("gh");
		if(gh1!=null){
			if(mssua != null && Long.parseLong(sl) > 0) {
		    	gh1.Sua(mssua, Long.parseLong(sl));
			}
			else 
			    if(msxoa != null) {
				gh1.Xoa(msxoa);
			    }
			
			
	
		     request.setAttribute("dsmypham", dsmypham);
		     
		     session.setAttribute("gh", gh1); //Luu bien vao lai session
		     
			 ArrayList<giohangbean> dsgh =gh1.ds;			 
			 request.setAttribute("dsgh", dsgh);
			
			 long tt=0;
			 tt=gh1.TongTien();
			 request.setAttribute("tt", tt);
			 
			 RequestDispatcher rd= request.getRequestDispatcher("giohang.jsp");
			 rd.forward(request, response);
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
