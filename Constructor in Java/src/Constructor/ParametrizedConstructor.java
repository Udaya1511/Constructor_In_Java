package Constructor;

public class ParametrizedConstructor {
	
	public ParametrizedConstructor(int empId, String name) {
		
		System.out.println("My name is : " + name + ", My Emp id is : " + empId);
		
	}
	
	public ParametrizedConstructor(String day, String month) {
		
		System.out.println(day +" "+ month);
	}
	
	public static void main(String[] args) {
		
		ParametrizedConstructor obj = new ParametrizedConstructor(100245, "UdayaKumar");
		ParametrizedConstructor obj1 = new ParametrizedConstructor("Tuesday", "December");
	}

}
