package Demo;

public class StringclassIntern {
	
	public static void main(String[] args) {
		
		StringclassIntern.intern();
		
		StringclassIntern.internmethod();
		
		
	}
		
	public static void internmethod() {
		
		String p1="Priyanka";
		String p2= new String ("Priyanka");
		String p3=p2.intern();
		String p4="Priyanka";
		System.out.println("**********************");
		System.out.println("Memory Location");
		System.out.println(p1);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1==p4);
		
		System.out.println("**********************");
		System.out.println("conten");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));

	}
		
		
		public static void intern() {
		String S1=new String ("ABC");
		String S2= S1.intern();
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		String S3="ABC";
		System.out.println(S1==S3);
		
		
	}

}
