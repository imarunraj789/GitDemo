
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello"; //String Literal - Immutable
		String b="hello";
		String c=a.concat("World"); //We can change the content/mutable but assign to new variable
		
		String s=new String("hello");
		String s1=new String("hello"); //String class creates new Object every time in Memory
		
		System.out.println("****************String Literals Outputs****************");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a.equals(b)); //True - Content of String Literals are compared and returns true or false
		System.out.println(a==b); //True - This compares References a and b are referring the same objects NOT the content
		System.out.println(a.equals(s)); //True - Compares contents and equals and returns true
		System.out.println(a==s);//False - This compares References a and s are referring the different objects NOT the content
		System.out.println(s==s1);//False - References are different as they are defined with String class

		
		//StringBuffer and StringBuilder - Mutable
		System.out.println("****************StringBuffer Outputs****************");
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);//hello
		sb.append("World");
		System.out.println(sb);//helloWorld
		System.out.println(sb.charAt(0));//h
		sb.insert(2,"She");
		System.out.println(sb);//heShelloWorld
		sb.replace(5, 7, "GG");
		System.out.println(sb);//heSheGGoWorld
		sb.deleteCharAt(12);
		System.out.println(sb);//heSheGGoWorl
		sb.reverse();
		System.out.println(sb);//lroWoGGehSeh
		
		System.out.println("****************StringBuilder Outputs****************");		
		StringBuilder sbb = new StringBuilder("hello");
		System.out.println(sbb);//hello
		sbb.append("World");
		System.out.println(sbb);//helloWorld
		System.out.println(sbb.charAt(0));//h
		sbb.insert(2,"She");
		System.out.println(sbb);//heShelloWorld
		sbb.replace(5, 7, "GG");
		System.out.println(sbb);//heSheGGoWorld
		sbb.deleteCharAt(12);
		System.out.println(sbb);//heSheGGoWorl
		sbb.reverse();
		System.out.println(sbb);//lroWoGGehSeh
		
		
		//StringBuilder
		//Same Methods given in StringBuffer are availabe in String Builder too
		//Differences
		//String Builder
		//    -Not Thread Safe - It is Non Synchronized
		//    -Bit Faster
		//String Buffer
		//    - Thread Safe - It is Synchronized
		//    - Bit Slower

	}

}
