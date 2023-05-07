package BookingTables1;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

@Table
public class Customer {
	@Id
	private String adhaarno;
	private String name;
	private int age;
	private String pno;
	private String city;
	private String src;
	private String dest;
	private String date;
	private int fno;
	private int seats;
	public Customer() {
		super();
	}
	public void setAdhaarno(String adhaarno) {
		this.adhaarno = adhaarno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Customer [adhaarno=" + adhaarno + ", name=" + name + ", age=" + age + ", pno=" + pno + ", city=" + city
				+ ", src=" + src + ", dest=" + dest + ", date=" + date + ", fno=" + fno + ", seats=" + seats + "]";
	}
	public String getAdhaarno() {
		return adhaarno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPno() {
		return pno;
	}
	public String getCity() {
		return city;
	}
	public String getSrc() {
		return src;
	}
	public String getDest() {
		return dest;
	}
	public String getDate() {
		return date;
	}
	public int getFno() {
		return fno;
	}
	public int getSeats() {
		return seats;
	}
	
	
	
	
	
	
	/*@ManyToMany(mappedBy="c")
	private List<SeatsAvailable> di=new ArrayList();*/
}
