package config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import BookingTables1.Adim;
import BookingTables1.Customer;
import BookingTables1.Flights;
import BookingTables1.TravelDetails;
import BookingTables1.SourceDest;
import BookingTables1.DayInfo;
import BookingTables1.SeatsAvailable;

public class Configmain {

	public static SessionFactory getsessionfactory(){
//	public static void main(String[] args) {
		Configuration c=new Configuration();
		Properties p=new Properties();
		p.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		p.put(Environment.URL,"jdbc:mysql://localhost:3306/flight1");
		p.put(Environment.USER, "root");
		p.put(Environment.PASS,"Vijay@123");
		p.put(Environment.SHOW_SQL,true);
		p.put(Environment.FORMAT_SQL,true );
		p.put(Environment.HBM2DDL_AUTO,"update");
		p.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
	    c.setProperties(p);
	    c.addAnnotatedClass(Customer.class);
	    c.addAnnotatedClass(DayInfo.class);
	    c.addAnnotatedClass(Flights.class);
	    c.addAnnotatedClass(SeatsAvailable.class);
	    c.addAnnotatedClass(TravelDetails.class);
	    c.addAnnotatedClass(SourceDest.class);
	    c.addAnnotatedClass(Adim.class);
	    SessionFactory sf=c.buildSessionFactory();
		return sf;
	}

}