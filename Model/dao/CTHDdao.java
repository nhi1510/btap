package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CTHDdao {
public void themcthd (String mamp, long soLuongMua, int maHoaDon, String daMua )throws Exception {
		
		
	CoSo dc = new CoSo();
		dc.KetNoi();
		String sql = "insert into ChiTietHoaDon(Mamp,SoLuong,MaHoaDon,damua) values (?,?,?,?) ";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, mamp);
		cmd.setLong(2, soLuongMua);
		cmd.setInt(3, maHoaDon);
		cmd.setString(4, daMua);
		cmd.executeUpdate();
			
}
  public int maxhd() throws Exception{
		CoSo dc = new CoSo();
		dc.KetNoi();
		
          Statement  st= dc.cn.createStatement();
		ResultSet rs = st.executeQuery("select max(MaHoaDon)from hoadon");
		int id2 = -1;
		if (rs.next()) {
		   id2 = rs.getInt(1);  
		}
		return id2;
	}
}
