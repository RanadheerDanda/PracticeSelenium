
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{11,9,8},{5,8,100},{6,12,1}};
		int minimumColumn =0;
		int min=a[0][0];
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=2;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					minimumColumn =j;
				}
			}
			
		}
		System.out.println(min);
		System.out.println(minimumColumn);
		int max=a[0][minimumColumn];
		for(int k=0;k<2;k++) {
			if(max<a[k][minimumColumn]) {
				max=a[k][minimumColumn];
			}
		}
		
		System.out.println(max);
	}

}
