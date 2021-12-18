package bean;

public class Myphambean {
	
	private String mamp;
	
	private String ten;
	private Long gia;
	private Long soluong;
	
	private String img;
	
	public Myphambean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Myphambean( String mamp, String ten, Long gia, Long soluong, String img) {
		super();
		
		this.mamp = mamp;
		this.ten = ten;
		this.gia = gia;
		this.soluong = soluong;
	
		this.img = img;
		
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
	
}	
	