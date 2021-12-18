package bo;

import java.util.ArrayList;

import bean.Myphambean;
import dao.Myphamdao;



public class Myphambo {
	Myphamdao mpdao= new Myphamdao();
	public ArrayList<Myphambean> getmypham()throws Exception{
		return mpdao.getmypham();
	}
	
	
	
	public ArrayList<Myphambean> Tim(String key)throws Exception{
    	ArrayList<Myphambean> tam= new ArrayList<Myphambean>();
    	ArrayList<Myphambean> ds=getmypham();
    	for(Myphambean mp: ds)
    		if(mp.getTen().toLowerCase().trim().contains(key.toLowerCase().trim()) )
    			tam.add(mp);
    	return tam;
    }

}
