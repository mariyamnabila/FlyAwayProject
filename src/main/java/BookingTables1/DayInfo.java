package BookingTables1;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

@Embeddable
public class DayInfo implements Serializable {
	
	private int flightno;
	private int day;
	public DayInfo() {
		super();
	}
	public DayInfo(int flightno, int day) {
		super();
		this.flightno = flightno;
		this.day = day;
	}
	
	
	
	
	
	
}

