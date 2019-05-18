import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.TakesScreenshot;

public class collectiondemo {
	public static void main(String[] args) { // TODO Auto-generated method stub

		int a[] ={ 4,5,5,5,4,6,6,9,4}; 
		// Print unique number from the list- Amazon 
		//print the string in reverse 
		int[] b= new int[10];
		ArrayList<Integer>ab =new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			int k=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					break;
					
				}
				
			}
			System.out.println(a[i]+"="+k);
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
}
}