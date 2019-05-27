class test{
	public static void main(String[] args){
		Student s1 = new Student("nihao",23);
		
	} 
}

class Person{
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setAge(){
		this.age = age;
	}
	
	public  int getAge(){
		return age;
	}
}

class Student extends Person{
	public Student(String name, int age){
		super(name, age);
	}
	
}
