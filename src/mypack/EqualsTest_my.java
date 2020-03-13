package mypack;

public class EqualsTest_my {
	public static void main(String[] args) {
		//创建两个相同内容的Person对象
		Person p1 = new Person("haha", 14);
		Person p2 = new Person("haha", 14);
		//使用equals比较两个相同内容的对象是否相等
		//false  比较的是对象的引用地址,p1和p2是两个不同的对象，所以其地址不同
		System.out.println("相同内容的两个person对象是否相等:"+p1.equals(p2)); 
	}
}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
