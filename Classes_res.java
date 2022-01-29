package inheritance;

class Classes_res {
	String x = "This is a string x in Classes_res";
	void rd(){
		System.out.println("This is string defined in a void method named rd in class named 'Class1'");
	}
}
class Class2 extends Classes_res{
	String y = "This is a string y in Class2";
	void ra(){
		System.out.println("This is string defined in a void method named ra in class named 'Class2'");
	}
}

class Class3 extends Class2{
	String z = "This is a string z in Class3";
	String met(){
		return"This is string returned by a method named 'met' in class named 'Class3'";
		
		
		
//		String x = "This is string variable defined in a String method named met in class named 'Class3'";
//		Why throwing error
//		Class3 object = new Class3();
//		System.out.println(x);
	}
	
}

