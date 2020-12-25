package testPaks;

import org.testng.Assert;
//import org.junit.Assert;
import org.testng.annotations.Test;

public class Basic1 {
	
	@Test
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	@Test
	public void m2() {
		System.out.println("This is m2 method");
		//Assert.fail();
	}


}
