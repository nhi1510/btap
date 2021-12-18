package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Myphambean;


public class Myphamdao {

	public ArrayList<Myphambean> getmypham() throws Exception{
		 ArrayList<Myphambean> ds= new ArrayList<Myphambean>();
		 	//b1: ket noi vao csdl
			CoSo dc= new CoSo();
			dc.KetNoi();
			//b2: Lay du lieu ve
			String sql="select * from Mypham";
PreparedStatement cmd=dc.cn.prepareStatement(sql);
			//b3: Truyen tham so vao cau lenh sql ->bo
			//b4: Thuc hien cau lieu
			ResultSet rs= cmd.executeQuery();
			//b5: Duyet qua tap ket qua: rs
			while(rs.next()) {
				   String mamp=rs.getString("Mamp");
String ten=rs.getString("Name");
				 
				   Long gia=rs.getLong("Price");
				   Long soluong=rs.getLong("Soluong");
				   String img=rs.getString("Images");
				 
				   ds.add(new Myphambean(mamp, ten, gia, soluong, img));
			}
	//b6: Dong all 
			rs.close();
			dc.cn.close();
		   return ds;
}

}

	   
	

