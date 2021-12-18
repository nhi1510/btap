package bean;

public class khachhangbean {
    private String makh;
    private String hoten;
    private String diachi;
    private String matkhau;
	public khachhangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public khachhangbean(String makh, String hoten, String diachi, String matkhau) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		this.diachi = diachi;
		this.matkhau = matkhau;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	@Override
	public String toString() {
		return "khachhangbean [makh=" + makh + ", hoten=" + hoten + ", diachi=" + diachi + ", matkhau=" + matkhau + "]";
	}
    
}
