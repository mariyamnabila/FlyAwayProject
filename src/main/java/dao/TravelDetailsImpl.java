package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import BookingTables1.SourceDest;
import BookingTables1.TravelDetails;

import BookingTables1.Flights;
import config.Configmain;

public class TravelDetailsImpl {
	public TravelDetailsImpl(){
		
	}
	public List<TravelDetails> getAll() {
		// TODO Auto-generated method stub
		
		Session sf=getSession();
		Query a=sf.createQuery("select s from BookingTables1.TravelDetails s");
		List<TravelDetails> h=a.list();
		return h;
	}
	
	
	
	
	
	public Flights setup(String a,String b,int c) {
		Session sf=getSession();
		SourceDest sd=new SourceDest(a,b);
		System.out.println("hello1");
		TravelDetails t1,t2;
		t1=sf.get(TravelDetails.class,sd);
		Flights f=sf.get(Flights.class,c);
		System.out.println(t1);
		System.out.println(f);
		if(t1!=null && f!=null ) {
			System.out.println("hello2");
			Transaction t=sf.beginTransaction();
			t1.getF().add(f);
	    	sf.save(t1);
	    	t.commit();
	    	
			return f;
		}
		return null;
		
	}
	public TravelDetails add(String a,String b,int c) {
		// TODO Auto-generated method stub
		Session sf=getSession();
		SourceDest sd=new SourceDest(a,b);
		TravelDetails t1,t2;
		t1=sf.get(TravelDetails.class,sd);
		if(t1==null) {
			Transaction t=sf.beginTransaction();
			t2=new TravelDetails(sd,c);
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
