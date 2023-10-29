package Day3;
class Drivingcost{
	private int Total_miles_driven_per_day;
	private double Cost_per_gallon_of_gasoline;
	private int Average_miles_per_gallon;
	private double Parking_fees_per_day;
	private double Tolls_per_day;
	public Drivingcost(int total_miles_driven_per_day, double cost_per_gallon_of_gasoline, int average_miles_per_gallon,
			double parking_fees_per_day, double tolls_per_day) {
		super();
		Total_miles_driven_per_day = total_miles_driven_per_day;
		Cost_per_gallon_of_gasoline = cost_per_gallon_of_gasoline;
		Average_miles_per_gallon = average_miles_per_gallon;
		Parking_fees_per_day = parking_fees_per_day;
		Tolls_per_day = tolls_per_day;
	}
	public int getTotal_miles_driven_per_day() {
		return Total_miles_driven_per_day;
	}
	public void setTotal_miles_driven_per_day(int total_miles_driven_per_day) {
		Total_miles_driven_per_day = total_miles_driven_per_day;
	}
	public double getCost_per_gallon_of_gasoline() {
		return Cost_per_gallon_of_gasoline;
	}
	public void setCost_per_gallon_of_gasoline(int cost_per_gallon_of_gasoline) {
		Cost_per_gallon_of_gasoline = cost_per_gallon_of_gasoline;
	}
	public int getAverage_miles_per_gallon() {
		return Average_miles_per_gallon;
	}
	public void setAverage_miles_per_gallon(int average_miles_per_gallon) {
		Average_miles_per_gallon = average_miles_per_gallon;
	}
	public double getParking_fees_per_day() {
		return Parking_fees_per_day;
	}
	public void setParking_fees_per_day(int parking_fees_per_day) {
		Parking_fees_per_day = parking_fees_per_day;
	}
	public double getTolls_per_day() {
		return Tolls_per_day;
	}
	public void setTolls_per_day(int tolls_per_day) {
		Tolls_per_day = tolls_per_day;
	}
	void dailyExpenses() {
		double daily_gasolin_cost = ((this.Total_miles_driven_per_day/this.Average_miles_per_gallon)*this.Cost_per_gallon_of_gasoline);
		System.out.println("Daily Driving Expenses : "+(this.Parking_fees_per_day+this.Tolls_per_day+daily_gasolin_cost));
	}
}
public class Q3{
	public static void main(String[] args) {
		Drivingcost D1 = new Drivingcost(15,0.75,35,2,1.5);
		D1.dailyExpenses();
	}
}