package mypack;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student("小张");
		Student s2 = new Student("小李");
		Test1.swap(s1, s2);
		System.out.println("s1:" + s1.getName());
		System.out.println("s2:" + s2.getName());
	}

	private static void swap(Student x, Student y) {
		Student temp = x;
		x = y;
		y = temp;
		System.out.println("s1:" + x.getName());
		System.out.println("s2:" + y.getName());
	}

}

class Student{
	private String name;
	
	Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



}
