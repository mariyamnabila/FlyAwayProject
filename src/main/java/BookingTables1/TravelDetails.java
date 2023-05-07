package BookingTables1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table
public class TravelDetails {
	
	@EmbeddedId
	private SourceDest sd;
	
	private int hours;
	
	@ManyToMany
	private List<Flights> f=new ArrayList();
	
	
	

	public TravelDetails() {
		super();
	}

	public TravelDetails(SourceDest sd, int hours) {
		super();
		this.sd = sd;
		this.hours = hours;
	}

	public SourceDest getSd() {
		return sd;
	}

	public int getHours() {
		return hours;
	}

	public List<Flights> getF() {
		return f;
	}

	@Override
	public String toString() {
		return "" + sd + "";
	}
	
	
	

}
