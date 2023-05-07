package BookingTables1;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class SourceDest implements Serializable {
	
	private String source;
	private String dest;
	public SourceDest(String source, String dest) {
		super();
		this.source = source;
		this.dest = dest;
	}
	public String getSource() {
		return source;
	}
	public String getDest() {
		return dest;
	}
	@Override
	public String toString() {
		return "source=" + source + ", dest=" + dest + "";
	}
	public SourceDest() {
		super();
	}
	
	
	
	
	
	
}
