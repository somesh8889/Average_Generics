class Mygeneralclass<T ,V>{
	T obj1;
	V obj2;
	
	void assignvalue(T t,V v) {
		obj1=t;
		obj2=v;
	}
	T getobj1Type() {
		return obj1;
	}
	V getobj2Type() {
		return obj2;
	}
	void displayobjectType() {
		System.out.println("The type of an object passedto the class is"+obj1.getClass());
		System.out.println("The type of an object passedto the class is"+obj2.getClass());		
	}
}
public class GeneralDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mygeneralclass<String,Integer> str1=new Mygeneralclass<String,Integer>();
		str1.assignvalue("SDM",55);
		System.out.println("object value="+str1.getobj1Type());
		System.out.println("object value="+str1.getobj2Type());
		str1.displayobjectType();
		
	}

}
