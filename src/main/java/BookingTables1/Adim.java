package BookingTables1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Adim {
	@Id
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Adim() {
		super();
	}
	@Override
	public String toString() {
		return "Adim [name=" + name + ", pass=" + pass + "]";
	}
	
	
	

}
