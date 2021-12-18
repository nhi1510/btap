
package bean;

public class lichsubean {
	private long makh;
	private String hoten;
	private String tenmypham;
	private int  SoLuong;
	private int gia;
	private int ThanhTien;
	private String damua;
	
	
	public lichsubean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public lichsubean(long makh, String hoten, String tenmypham, int soLuong, int gia, int thanhTien, String damua) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		this.tenmypham = tenmypham;
		SoLuong = soLuong;
		this.gia = gia;
		ThanhTien = thanhTien;
		this.damua = damua;
	}


	public long getMakh() {
		return makh;
	}


	public void setMakh(long makh) {
		this.makh = makh;
	}


	public String getHoten() {
		return hoten;
	}


	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	public String getTenmypham() {
		return tenmypham;
	}


	public void setTenmypham(String tenmypham) {
		this.tenmypham = tenmypham;
	}


	public int getSoLuong() {
		return SoLuong;
	}


	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}


	public int getGia() {
		return gia;
	}


	public void setGia(int gia) {
		this.gia = gia;
	}


	public int getThanhTien() {
		return ThanhTien;
	}


	public void setThanhTien(int thanhTien) {
		ThanhTien = thanhTien;
	}


	public String getDamua() {
		return damua;
	}


	public void setDamua(String damua) {
		this.damua = damua;
	}


}