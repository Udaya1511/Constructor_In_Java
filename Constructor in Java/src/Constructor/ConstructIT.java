package Constructor;

import java.lang.reflect.Method;

public class ConstructIT {
	
	public ConstructIT() {
		
		System.out.println("This is a constructor block");
	}
	
	public void name() {
		
		System.out.println("Normal Method");
	}
	
	
	public static void main(String[] args) {
		
		ConstructIT obj = new ConstructIT();
		obj.name();
	}

}
