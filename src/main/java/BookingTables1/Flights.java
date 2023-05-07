package BookingTables1;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table
public class Flights {
	@Id
	private int flightno;
	private String timings;
	private int tSeats;
	private String aname;
	private int costperhour;
	
	@ManyToMany(mappedBy="f")
	private List<TravelDetails> td=new ArrayList();

	public Flights(int flightno, String timings, int tSeats, String aname, int costperhour) {
		super();
		this.flightno = flightno;
		this.timings = timings;
		this.tSeats = tSeats;
		this.aname = aname;
		this.costperhour = costperhour;
	}

	public int getFlightno() {
		return flightno;
	}

	public String getTimings() {
		return timings;
	}

	public int gettSeats() {
		return tSeats;
	}

	public String getAname() {
		return aname;
	}

	public int getCostperhour() {
		return costperhour;
	}

	public Flights() {
		super();
	}

	public List<TravelDetails> getTd() {
		return td;
	}
	

	
	
	
	

}
