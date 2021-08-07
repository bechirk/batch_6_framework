package DataDriven;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public abstract class Test2 {

	
	@Test(dataProvider = "calculationData", dataProviderClass = TestDatas.class)
	public void test(int num1, int num2, int expectingTotal) {
		int actualToal = num1 + num2;
		Assert.assertEquals(actualToal, expectingTotal, "Calculation is wrong!!");

	}
	@Test(dataProvider = "personInfo", dataProviderClass = TestDatas.class )
	public void test2(HashMap<String, String> info) {
		for (String Key : info.keySet()) {
			System.out.println(Key+" : "+ info.get(Key));
		}
		System.out.println("\n\n");
		
	}
	
}

