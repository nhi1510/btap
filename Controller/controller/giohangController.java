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
import bo.Myphambo;
import bo.giohangbo;

/**
 * Servlet implementation class giohangController
 */
@WebServlet("/giohangController")
public class giohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giohangController() {
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
		      
				Myphambo sach = new Myphambo();
				ArrayList<Myphambean> dssach = null;//laasy mag dong
		  
				String key=request.getParameter("key");
				
					if (key != null)
						try {
							dssach=sach.Tim(key);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
		      
		     
				request.setAttribute("dssach", dssach);
				
				HttpSession session = request.getSession();
				String mamp=request.getParameter("Mamp");
				String ten=request.getParameter("title");
				String gia = request.getParameter("discount");
				
				
				String Img=request.getParameter("thumbnail");
				String Thanhtien=request.getParameter("ThanhTien");

				if(mamp!=null)
				{
					//Tạo cho kh 1 giohang khi dat mua quyen sach dau tien
					giohangbo gh=null;
					if(session.getAttribute("gh")==null)
					{
						gh=new giohangbo(); //Cập nhật vùng nhớ
						session.setAttribute("gh", gh); //Tạo ra 1 giỏ
					}
					//
					gh=(giohangbo)session.getAttribute("gh");
					gh.Them(mamp, ten, Img,  Long.parseLong(gia),(long)1);
				}
				
				if(ten!=null)
				{
					RequestDispatcher rd = request.getRequestDispatcher("htgioController");
					rd.forward(request, response);
				}
				
				
				if(mamp==null)
				{
					if(request.getParameter("btnTraAll")!=null)
					{
						giohangbo gh=(giohangbo)session.getAttribute("gh");
						gh.XoaALL();
						session.removeAttribute("gh");
						RequestDispatcher rd = request.getRequestDispatcher("giohang.jsp");
						rd.forward(request, response);
					}
					if(request.getParameter("btnThanhToan")!=null)
					{
						RequestDispatcher rd = request.getRequestDispatcher("thanhtoan.jsp");
						rd.forward(request, response);
					}
					if(request.getParameter("btnMuaHang")!=null)
					{
						RequestDispatcher rd1 = request.getRequestDispatcher("shop.jsp");
						rd1.forward(request, response);
					}
					if(request.getParameter("btnMua")!=null)
					{
						RequestDispatcher rd2 = request.getRequestDispatcher("shop.jsp");
						rd2.forward(request, response);
					}
					response.sendRedirect("htgioController");
				}
		      
		      
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
