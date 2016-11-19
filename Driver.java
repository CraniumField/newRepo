import java.text.DecimalFormat;

//Driver class for testing code

public class Driver {

	public static void main (String [] args){
		
		//I. Declaring 3 objects
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scale scale1 = new Scale(0.0, "kg");
		Scale scale2 = new Scale(50.0, "kg");
		Scale scale3 = new Scale(110.0, "lb");
		
		// Outputting information of 3 objects
		
		System.out.println("Weight 1: "+scale1.toString());
		System.out.println("Weight 2: "+scale2.toString());
		System.out.println("Weight 3: "+scale3.toString());
		
		System.out.println();
		
		//II. testing accessor method
		
		System.out.println("Weight 2 in pounds: "+df.format(scale2.getWeightLb()));
		System.out.println("Weight 3 in kilograms: "+df.format(scale3.getWeightKg()));
		
		System.out.println();
		
		//III. testing waterInTake method with and without workout. The testcode in the sheet rounds up when 50kg 90min workout = 11 cups, I round down to = 10 cups ( it is 10.5 cups )
		
		System.out.println("Daily water intake for "+scale2.toString()+" = "+scale2.waterInTake()+" cups");
		System.out.println("Daily water intake for "+scale3.toString()+" = "+scale3.waterInTake()+" cups");
		System.out.println("Daily water intake for "+scale2.toString()+" and 90min workout = "+(scale2.waterInTake()+scale2.waterInTake(90)));
		System.out.println("Daily water intake for "+scale3.toString()+" and 60min workout = "+(scale3.waterInTake()+scale3.waterInTake(60)));
		
		System.out.println();
		
		//IV. testing equalities
		
		System.out.println("Weight 1 & Weight 2 "+scale1.toString()+" & "+scale2.toString()+" =? "+scale1.equals(scale2));
		System.out.println("Weight 2 & Weight 3 "+scale2.toString()+" & "+scale3.toString()+" =? "+scale2.equals(scale3));
		
		System.out.println();
		
		//V. modify scale1 and compare to 2 & 3
		
		scale1.setWeight(50.0);
		System.out.println("Modify weight 1: "+(scale1.getWeight())+" "+scale1.getUnit());
		System.out.println("Weight 1 50.0 kg Weight 2 50.0 kg =? "+ scale1.equals(scale2));
		System.out.println("Weight 1 50.0 kg & Weight 3 110.0 lbs =? "+ scale1.equals(scale3));
		
		System.out.println();
		
		//VI. create scale4 and compare to 2 & 3
		
		Scale scale4 = new Scale(50.0, "lb");
		System.out.println("Weight 4: "+scale4.toString());
		System.out.println("Weight 4 & Weight 2 =? 50.0 lbs =? 50.0 kg "+ scale4.equals(scale2));
		System.out.println("Weight 4 & Weight 3 =? 50.0 lbs =? 110.0 lbs "+ scale4.equals(scale3));
		
		System.out.println();
		System.out.println();
		
		//VII. compare weights with less than and greater than
		
		System.out.println("Weight 2 < Weight 4 ? 50.0 kg < 50.0 lbs "+scale2.isLessThan(scale4));
		System.out.println("Weight 3 < Weight 4 ? 110.0 lbs < 50.0 lbs "+scale3.isLessThan(scale4));
		System.out.println();
		System.out.println("Weight 2 > Weight 4 ? 50.0 kg > 50.0 lbs "+scale2.isGreaterThan(scale4));
		System.out.println("Weight 3 > Weight 4 ? 110.0 lbs > 50.0 lbs "+scale3.isGreaterThan(scale4));
		System.out.println();
		System.out.println("Weight 1 < Weight 2 ? 50.0 kg < 50.0 kg "+scale1.isLessThan(scale2));
		System.out.println("Weight 1 > Weight 3 ? 50.0 kg > 110.0 lbs "+scale1.isGreaterThan(scale3));
	
	}
	
}
