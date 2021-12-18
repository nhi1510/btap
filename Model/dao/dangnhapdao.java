package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.dangnhapbean;


public class dangnhapdao {
	public dangnhapbean getAd(String un, String pass) throws Exception{
		//B1: kết nối
			CoSo dc = new CoSo();
			dc.KetNoi();
			//b2: lay du lieu ve
			String sql = "select * from DangNhap where Tendangnhap=?  and Matkhau=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			//Truyền 01 tham số: un; pas vào cmd
			cmd.setString(1, un);
			cmd.setString(2, pass);
			ResultSet rs = cmd.executeQuery();
			//Nếu rs.next==false return null
			// else: return kh;
				// Tạo ra 1 khachhang:kh và return kh;
			if (rs.next()==false) return null;
			else {
				
			String tendn=rs.getString("TenDangNhap");
			String matkhau=rs.getString("MatKhau");
		
	  		dangnhapbean kh=new dangnhapbean(tendn, matkhau);
	  		rs.close();
		    	dc.cn.close();
	  		return kh;
				}
	  	//Dong ket noi	
	}
}

