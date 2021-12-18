
	package bo;

	import bean.dangnhapbean;
	import dao.dangnhapdao;

	public class dangnhapbo {
		dangnhapdao dndao= new dangnhapdao();
		public dangnhapbean getAd(String un, String pass) throws Exception{
			return dndao.getAd(un, pass);
		}
	}


