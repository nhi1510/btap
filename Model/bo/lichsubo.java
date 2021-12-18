package bo;

import java.util.ArrayList;

import bean.lichsubean;
import dao.lichsudao;

public class lichsubo {
	lichsudao sdao = new lichsudao();
	public ArrayList<lichsubean> getLSMH(long makh) throws Exception{
		return sdao.getls(makh);
	}
}
