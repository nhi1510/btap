package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.khachhangbean;

public class khachhangdao {
public khachhangbean getkh(String un,String pass) throws Exception{
		
		//B1: kết nối
				CoSo dc = new CoSo();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from khachhang where tendn=? and pass=?";
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
					
					String makh=rs.getString("makh");
		    		String hoten=rs.getString("hoten");
		    		String diachi=rs.getString("diachi");
		    		String matkhau=rs.getString("pass");
		    		khachhangbean kh=new khachhangbean(makh, hoten, diachi, matkhau);
		    		rs.close();
			    	dc.cn.close();
		    		return kh;
					}
		    	//Dong ket noi	
	}
public ArrayList<khachhangbean> gethtkh() throws Exception {
	CoSo dc=new CoSo();
	dc.KetNoi();
	ArrayList<khachhangbean> ds= new ArrayList<khachhangbean>();
	String sql="select * from khachhang";
	PreparedStatement cmd=CoSo.cn.prepareStatement(sql);
	ResultSet rs= cmd.executeQuery();
	while(rs.next())
	{
		String makh = rs.getString("makh");
		String hoten = rs.getString("hoten");
		String diachi = rs.getString("diachi");
		String matkhau = rs.getString("pass");
		khachhangbean htkh = new khachhangbean(makh, hoten, diachi, matkhau);
		ds.add(htkh);
		}
	rs.close();
	return ds;
}
	public khachhangbean ktkh(String un) throws Exception{
	
		//B1: kết nối
				CoSo dc = new CoSo();
				dc.KetNoi();
				//b2: lay du lieu ve
				String sql = "Select * from khachhang where tendn=? ";
				PreparedStatement cmd = dc.cn.prepareStatement(sql);
				//Truyền 01 tham số: un; pas vào cmd
				cmd.setString(1, un);
				ResultSet rs = cmd.executeQuery();
				//Nếu rs.next==false return null
				// else: return kh;
					// Tạo ra 1 khachhang:kh và return kh;
				while (rs.next()) 
			 {
					
					String makh=rs.getString("makh");
		    		String hoten=rs.getString("hoten");
		    		String diachi=rs.getString("diachi");
		    		String matkhau=rs.getString("pass");
		    		khachhangbean htkh = new khachhangbean(makh, hoten, diachi, matkhau);
		    		rs.close();
			    	dc.cn.close();
		    		return htkh;
				}
				return null;
		    	//Dong ket noi	
	}
	
	public void dangky(String hoten,String diachi, String sodt,String email,String un,String pass )throws Exception {
		
		
			CoSo dc = new CoSo();
			dc.KetNoi();
			
			String sql = "insert into khachhang(hoten,diachi,sodt,email,tendn,pass) values (?,?,?,?,?,?) ";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1, hoten);
			cmd.setString(2, diachi);
			cmd.setString(3, sodt);
			cmd.setString(4, email);
			cmd.setString(5, un);
			cmd.setString(6, pass);
			cmd.executeUpdate();
		
		
	}
	public void xoaKH(long makh) throws Exception{
		CoSo dc = new CoSo();
		dc.KetNoi();
		String sql = "delete from khachhang where makh=? ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setLong(1, makh);
		cmd.executeUpdate();
	}

}

