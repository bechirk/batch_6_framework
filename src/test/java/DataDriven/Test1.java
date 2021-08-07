package DataDriven;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	// 2, 5 == 7
	// 3, 11 = 14
	// 5,4 = 9
	
	@Test(dataProvider = "invalidDataType")
	public void test(int num1, int num2, int expectingTotal) {
		int actualToal = num1 + num2;
		Assert.assertEquals(actualToal, expectingTotal, "Calculation is wrong!!");

	}
	
	//@DataProvider
	
	@DataProvider
	public Object[][] dataSet(){
	Object[][] calculaiton= {
				{2,5,7},
				{3,11,14},
				{5,4,9}
		};
		return calculaiton;
	
	}
	@DataProvider(name= "invalidData")
	public Object[][] dataSet2(){
	Object[][] calculaiton= {
				{2,5},
				{3,11,14},
				{5,4,9}
		};
		return calculaiton;
	
	}
	@DataProvider(name= "invalidDataType")
	public Object[][] dataSet3(){
	Object[][] calculaiton= {
				{2,5,"Bechir"},
				{3,11,14},
				{5,4,9}
		};
		return calculaiton;
	
	}
}
