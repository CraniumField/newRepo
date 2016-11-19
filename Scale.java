import java.text.DecimalFormat; // used for clarity in toString()
import java.math.BigDecimal; // used for rounding decimals
import java.math.MathContext; //used for rounding decimals

//class full of accessors, mutators, and constructors that help to construct the code

public class Scale{
	
	//declaring variables
	
	private double weight;
	private String unit;
	private int ounces;
	private int workout;
	private int cups;
	private boolean result = false;
	String placeholder = "";
	DecimalFormat df = new DecimalFormat("0.00"); //used for clarity in toString()
	
	//Declaring object Scale with 0 parameters
	
	public Scale(){
		this.weight = 0;
		this.setUnit("kg");
	}
	
	//Declaring object Scale with 1 parameter
	
	public Scale(double weight){
		this.weight = weight;
		this.setUnit("kg");
	}
	
	//Declaring object Scale with 2 parameters
	
	public Scale(double weight, String unit){
		this.weight = weight;
		this.setUnit(unit);
	}
	
	//transforms from lbs to kgs
	
	public double getWeightKg(){;
		//return this.weight/2.2;
		BigDecimal bd = new BigDecimal(this.weight/2.2);
		bd = bd.round(new MathContext(3));
		double round = bd.doubleValue();
		return round;
	}
	
	//transforms from kgs to lbs
	
	public double getWeightLb(){
		BigDecimal bd = new BigDecimal(this.weight*2.2);
		bd = bd.round(new MathContext(3));
		double rounded = bd.doubleValue();
		return rounded;
	}
	
	//Returns unit of Object Scale
	
	public String getUnit() {
		return unit;
	}
	
	//Returns weight of Object Scale
	
	public double getWeight() {
		return weight;
	}

	//Changes unit of Object Scale, takes in String
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	//Changes weight of Object Scale, takes in double
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	//Changes weight and unit of Object Scale, takes in double and String
	
	public void setWeightandUnit(double weight, String unit){
		this.weight = weight;
		this.setUnit(unit);
	}
	
	//Returns the daily water in cups required for a person of a given bodyweight (converts from kgs to lbs if necessary), converts from lbs to ounces to cups
	
	public int waterInTake(){
		if (this.getUnit() == "lb"){
			
			ounces = (int) (this.weight/2);
			cups = ounces/8;
			
		}
		else if (this.getUnit() == "kg"){
			
			ounces = (int) (this.getWeightLb()/2);
			cups = ounces/8;
			
		}
		
		return cups;
		
	}
	
	//Returns the daily water in cups required for a person with a given workout time in minutes, takes parameter int minutes, (converts minutes to cups) ROUNDED UP
	
	public int waterInTake(int min){
		if (min >=30)
			workout = (min/30)*12;
		else if (min <30)
			workout = 0;
		cups = workout/8;
		if (min % 30 == 0 && min % 60 != 0)
			cups++;
		return cups;
		
	}
	
	//Converts weight and unit values of a given Scale to a String display
	
	public String toString(){
		placeholder = this.weight + " " + this.unit;
		return placeholder;
	}
	
	//Compares 2 scale objects, transfers from lbs or kgs as necessary
	
	public boolean equals(Scale Scale){
		
		//if units and weights are equal, returns true
		if (this.unit == (Scale.getUnit()) && this.weight == (Scale).getWeight())
			result = true;
		
		//units equal, weights not equal, returns false
		if (this.unit == (Scale.getUnit()) && this.weight != (Scale).getWeight())
			result = false;
		
		//if units are not equal
		if (this.unit != (Scale.getUnit())){
			
			//if the first is kilos, convert to lbs and compare
			if (this.unit == "kg"){
				
				if (this.getWeightLb() == Scale.getWeight())
					result = true;
				else 
					result = false;
				
			}
			
			//if the first is lbs, convert to kgs and compare
			if (this.unit == "lb"){
				
				if (this.getWeightKg() == Scale.getWeight())
					result = true;
				else 
					result = false;
				
			}
			
		}
			
			
		return result;
		
	}
	
	public boolean isLessThan(Scale Scale){
		
		//if units are equal and weight1 < weight2, returns true, else false
		if (this.unit == Scale.getUnit()){
			if (this.weight < Scale.weight)
				result = true;
			else 
				result =  false;
		}
		
		//if first is kilos, then convert to lbs and compare. if 1 < 2, true, else false
		else if (this.unit == "kg"){
			
			if (this.getWeightLb() < Scale.weight)
				result = true;
			else
				result = false;
	
		}
		
		//if first is pounds, then convert to kgs and compare. if 1 < 2, true, else false
		else if (this.unit == "lb"){
			
			if (this.weight < Scale.getWeightKg())
				result = true;
			else
				result = false;
	
		}
		
		return result;
		
	}
	
	
	//if units are equal and weight1 > weight2, returns true, else false
	public boolean isGreaterThan(Scale Scale){
		
		if (this.unit == Scale.getUnit()){
			if (this.weight > Scale.weight)
				result = true;
			else 
				result = false;
		}
		
		//if first is kilos, then convert to lbs and compare. if 1 > 2, true, else false
		else if (this.unit == "kg"){
			
			if (this.getWeightLb() > Scale.weight)
				result = true;
			else
				result = false;
	
		}
		
		//if first is pounds, then convert to kgs and compare. if 1 > 2, true, else false
		else if (this.unit == "lb"){
			
			if (this.weight > Scale.getWeightKg())
				result = true;
			else
				result = false;
	
		}
		
		return result;
		
	}
	
}