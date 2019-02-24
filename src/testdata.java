import org.testng.annotations.DataProvider;

public class testdata {
	@DataProvider 
	public Object[][] getData(){
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="Mozilla";
		data[0][1]="User1";
		
		data[1][0]="chrome";
		data[1][1]="User2";
		
		return data;
		
		
	}

}
