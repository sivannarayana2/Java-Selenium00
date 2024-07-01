package Testing;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String an object it will allow to store sequence of characters
		// String literals
		String name="Siva";
		String name1="Siva";// here it wont create an object for name1 because 
							//it has same data in two objects
		
		// new
		String n=new  String("narayana");
		String n2=new String("narayana");// here it will create an object for n1 n2 because 
										// even it has same data in two objects 
										// here explicitly saying create an object with the help of "new"
		String s="Mutukuri Siva nnarayana";
		String[] p=s.split(" ");// it will split the word where there is space between words
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		
		String s1="Mutukuri Siva nnarayana";
		String[] p1=s.split("Siva");// it will split the word where there is space between words
		System.out.println(p1[0]);
		System.out.println(p1[1].trim());
		System.out.println(p1[1]);
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		for(int j=s1.length()-1;j>=0;j--) {
			System.out.println(s.charAt(j));
		}
	}

}
