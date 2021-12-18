package bean;

public class giohangbean {
	
	private String mamp;
	
	private String ten;
	private Long gia;
	private Long soluong;
	
	private String img;
    private Long thanhtien;
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangbean(String mamp, String ten, Long gia, Long soluong, String img, Long thanhtien) {
		super();
		this.mamp = mamp;
		this.ten = ten;
		this.gia = gia;
		this.soluong = soluong;
		this.img = img;
		this.thanhtien = gia*soluong;
	}
	public String getMamp() {
		return mamp;
	}
	public void setMamp(String mamp) {
		this.mamp = mamp;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public Long getSoluong() {
		return soluong;
	}
	public void setSoluong(Long soluong) {
		this.soluong = soluong;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Long getThanhtien() {
		return gia*soluong;
	}
	public void setThanhtien(Long thanhtien) {
		this.thanhtien = thanhtien;
	}
	
}