package Testing;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int [5];
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		
		System.out.println(a[4]);//Printing the elements individually
		for(int j=0; j<a.length;j++)
		{
			System.out.println(a[j]);// printing the elements using iteration
		}
		
//		int a2[]= {1,2,3,4,5};
//		
//		for(int i=1;i<=a2.length;i++)// here we can find two mistakes
//									//1.we are intailizing 1 to i then it will start with a[1]
//		{							//2. the condition shouldn't be <= it should be i<length
//			System.out.println(a2[i]);
//		}
		
		String[]  companynames= {"infosis","Tcs","Cisco","IBM"};
		
		for(int k=0;k<companynames.length;k++)
		{
			System.out.println(companynames[k]);
		}

	}

}
