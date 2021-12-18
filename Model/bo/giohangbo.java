package bo;

import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>();
	public void Them(String Mamp,String ten,String img ,long gia, long SoLuong)
	{
		for(giohangbean g:ds)
		{
			if(g.getMamp().equals(Mamp))
			{
				g.setSoluong(g.getSoluong()+SoLuong);
				return;
			}
		}
		ds.add(new giohangbean(Mamp, ten,(long)gia, (long)1, img, SoLuong));
	}
	public void Sua(String Mamp, long sl)
	{
		for(giohangbean g:ds)
		{
			if(g.getMamp().equals(Mamp))
			{
				g.setSoluong(sl);
				return;
			}
		}
	}
	public void Xoa(String Mamp)
	{
		for(giohangbean g:ds)
		{
			if(g.getMamp().equals(Mamp))
			{
				ds.remove(g);
				return;
			}
		}
	}
	public void XoaALL()
	{
		ds.removeAll(ds);
		return;
	}
	public Long TongTien()
	{
		long s=0;
		for(giohangbean g:ds)
			s=s+g.getThanhtien();
		return s;
	}
	public int TongSP() {
		int dem=0;
		for(giohangbean g: ds)
    		dem=ds.size();
		return dem;
	}
}
