class WildcardTest<T extends Number>{
	T[] nums;
	WildcardTest(T[] o){
		nums=o;
	}
	
	double average() {
		double sum=0;
		int i;
		for(i=0;i<nums.length;i++) {
			sum=sum+nums[i].doubleValue();
		}
		double avg=(sum/nums.length);
		return avg;
	}
	Boolean sameavg(WildcardTest<?> ob) {
		if(average()==ob.average()) {
			return true;
		}
		else {
			return false;
		}
	}
}


public class GenericsWildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inums[]= {1,3,4,2,3,4,3};
		WildcardTest<Integer> iob=new WildcardTest<Integer>(inums);
		double di=iob.average();
		System.out.println("The average of Integer="+di);
		Double dnums[]= {1.3,3.3,4.6,2.7,3.2,4.6,3.0};
		WildcardTest<Double> dob=new WildcardTest<Double>(dnums);
		double dd=dob.average();
		System.out.println("The average of Double="+dd);
		Float fnums[]= {1.0F,3.0F,4.0F,2.0F,3.0F,4.0F,3.0F};
		WildcardTest<Float> fob=new WildcardTest<Float>(fnums);
		double df=fob.average();
		System.out.println("The average of Float="+df);
		
		System.out.println("The average of iob and dob");
		if(iob.sameavg(dob)) {
			System.out.println("Average Integers and Doubles are equal");
		}
		else {
			System.out.println("Average of Integers and Doubles are not equal");
		}
		System.out.println("The average of iob and fob");
		if(iob.sameavg(fob)) {
			System.out.println("Average Integers and Float are equal");
		}
		else {
			System.out.println("Average of Integers and Float are not equal");
		}
	
	}

}
