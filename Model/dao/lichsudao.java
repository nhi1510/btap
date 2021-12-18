package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.lichsubean;

public class lichsudao {
    public ArrayList<lichsubean> getls(long makh) throws Exception{
		
	
	   	
		ArrayList<lichsubean> ds=new ArrayList<lichsubean>();
		//B1: kết nối
		CoSo dc = new CoSo();
		dc.KetNoi();
		//b2: lay du lieu ve
		String sql = "select * from lichsu where makh =?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setLong(1, makh);
		ResultSet rs = cmd.executeQuery();
		//b3: duyet qua cac du lieu lay ve de luu vao 1 mang
		while(rs.next()) {
    		long makh1=rs.getLong("makh");
    		String hoten=rs.getString("hoten");
    		String Name=rs.getString("Name");
    		int SoLuong=rs.getInt("SoLuong");
    		int gia=rs.getInt("Price");
    		int ThanhTien=rs.getInt("Thanhtien");
    		String damua=rs.getString("damua");
    		ds.add(new lichsubean(makh1, hoten, hoten, SoLuong, gia, ThanhTien, damua));
    	}
    	//Dong ket noi
    	rs.close();
    	dc.cn.close();
    	 return ds;
	}
}
