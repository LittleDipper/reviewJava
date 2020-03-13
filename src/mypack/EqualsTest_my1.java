package mypack;

public class EqualsTest_my1 {
	public static void main(String[] args) {
		//创建两个相同内容的Person对象
		Person_1 p1 = new Person_1("haha", 14);
		Person_1 p2 = new Person_1("haha", 14);
		//使用equals比较两个相同内容的对象是否相等
		//false  比较的是对象的引用地址,p1和p2是两个不同的对象，所以其地址不同
		System.out.println("相同内容的两个person对象是否相等:"+p1.equals(p2)); 
		System.out.println(p1 == p2);
//		System.out.println(p1.hashCode() +"\t"+p2.hashCode());
	}
}

class Person_1 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public Person_1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//如果相比较的对象为null，则返回false
		if(obj == null){
			return false;
		}
		
		//如果是同一个对象，则返回true，否则返回false
		if(this == obj){
			return true;
		}
		
		//判断类型是否相同
		if(this.getClass() != obj.getClass()){
			return false;
		}
		Person_1 p = (Person_1)obj;
		return this.name.equals(p.getName()) && this.age == p.getAge();
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
