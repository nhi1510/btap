package bo;

import dao.CTHDdao;

public class CTHDbo {
	CTHDdao khdao= new CTHDdao();
	public void themcthd (String mamp, long soLuongMua, int maHoaDon, String daMua )throws Exception {
		    khdao.themcthd(mamp, soLuongMua, maHoaDon, daMua);
   }
	public int maxhd() throws Exception {
		return khdao.maxhd();
		
	}

}
