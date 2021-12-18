package bo;

import java.sql.Date;

import dao.hoadondao;

public class hoadonbo {
	hoadondao khdao= new hoadondao();
	public void themhd(String makh,Date ngayMua, String damua )throws Exception {
		    khdao.themhd(makh, ngayMua, damua);
   }
}
