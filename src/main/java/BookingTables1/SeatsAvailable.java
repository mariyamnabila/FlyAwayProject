package BookingTables1;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table
public class SeatsAvailable {

	@EmbeddedId
	private DayInfo d;
	private int seats;

	public SeatsAvailable() {
		super();
	}
	
	
/*	@ManyToMany
	private List<Customer> c=new ArrayList();*/

	public SeatsAvailable(DayInfo d, int seats) {
		super();
		this.d = d;
		this.seats = seats;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
	
}
