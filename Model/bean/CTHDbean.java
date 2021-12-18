package bean;

public class CTHDbean {

	private int MaChiTietHD;
	private String Mamp;
	private long SoLuongMua;
	private int MaHoaDon;
	private String DaMua;
	public CTHDbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CTHDbean(int maChiTietHD, String mamp, long soLuongMua, int maHoaDon, String daMua) {
		super();
		this.MaChiTietHD = maChiTietHD;
		this.Mamp = mamp;
		this.SoLuongMua = soLuongMua;
		this.MaHoaDon = maHoaDon;
		this.DaMua = daMua;
	}
	public int getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(int maChiTietHD) {
		MaChiTietHD = maChiTietHD;
	}
	public String getMaSach() {
		return Mamp;
	}
	public void setMaSach(String mamp) {
		Mamp = mamp;
	}
	public long getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(long soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public int getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public String getDaMua() {
		return DaMua;
	}
	public void setDaMua(String daMua) {
		DaMua = daMua;
	}
	

}

