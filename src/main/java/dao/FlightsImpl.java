package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import BookingTables1.DayInfo;
import BookingTables1.SourceDest;
import BookingTables1.Flights;
import BookingTables1.SeatsAvailable;
import BookingTables1.TravelDetails;
import config.Configmain;

public class FlightsImpl {
public FlightsImpl(){
		
	}
public List<Flights> getAll() {
	// TODO Auto-generated method stub
	
	Session sf=getSession();
	Query a=sf.createQuery("select s from BookingTables1.Flights s");
	List<Flights> h=a.list();
	return h;
}   
    public int getseatsavailable(Flights f,int v) {
    	Session sf=getSession();
    	DayInfo d=new DayInfo(f.getFlightno(),v);
    	SeatsAvailable sa=sf.get(SeatsAvailable.class, d);
    	
    	
	return sa.getSeats();
    	
    }
    public int getprice(int f,String src,String d,int h) {
    	Session sf=getSession();
    	SourceDest sd=new SourceDest(src,d);
    	TravelDetails td=sf.get(TravelDetails.class, sd);
    	Flights ff=sf.get(Flights.class, f);
    	int j=ff.getCostperhour()*td.getHours()*h;
		return j;
    }


	public Flights add(int a,String b,int c,String d,int e) {
		// TODO Auto-generated method stub
		Session sf=getSession();
		Flights t1,t2;
		t1=sf.get(Flights.class,a);
		if(t1==null) {
			Transaction t=sf.beginTransaction();
			t2=new Flights(a,b,c,d,e);
			sf.save(t2);
			t.commit();
			return t2;
		}
		return null;
	}
	public static Session getSession() {
		SessionFactory ss=Configmain.getsessionfactory();
		Session sf=ss.openSession();
		return sf;
	}
	

}
