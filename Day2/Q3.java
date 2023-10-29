class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.println("Date : "+day+" /"+month+" /"+year);
		
	}
	
}
public class Q3{
	public static void main(String[] args){
		Date D1 = new Date(01,01,1999);
		Date D2 = new Date(01,02,1998);
		D1.displayDate();
		D2.displayDate();
	}
}