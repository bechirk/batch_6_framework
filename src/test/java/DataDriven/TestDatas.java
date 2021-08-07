package DataDriven;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class TestDatas {
	@DataProvider(name= "calculationData")
	public Object[][] dataSet(){
	Object[][] calculaiton= {
				{2,5,7},
				{3,11,14},
				{5,4,9}
		};
		return calculaiton;
	
	}
	@DataProvider(name="personInfo")
	public Object[] dataSet2(){
		Object[] personInfo = new Object[3];
		HashMap<String, String> info = new HashMap<>();
		info.put("firstname", "John");
		info.put("lastname", "Peter");
		info.put("Email", "JohnPeter@gmail.com");
		info.put("Phone", "2408257869");
		
		HashMap<String, String> info2 = new HashMap<>();
		info2.put("firstname", "Jonatan");
		info2.put("lastname", "Puto");
		info2.put("Email", "JohnPeter@gmail.com");
		info2.put("Phone", "240-825-7869");
		
		HashMap<String, String> info3 = new HashMap<>();
		info3.put("firstname", "Hugo");
		info3.put("middlename", "mierda");
		info3.put("lastname", "whatever");
		info3.put("Email", "JohnPeter@gmail.com");
		info3.put("Phone", "240-825-7869");
		
		
		personInfo[0]= info;
		personInfo[1]= info2;
		personInfo[2]= info3;
		
		return personInfo;
	}
}
