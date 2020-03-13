package annotation_test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * 在实际开发中可以有以下场景：
 * 当我们自己在代码中写一个POJO时，想直接通过程序，把这个POJO对应的表建立出来。
 * 
 * 比如：当我们写了下面一个Student类时,我们想通过程序直接在数据库中生成Student对象
 * 对应的数据表：tb_student,这个表中的列名和列类型刚好对应Student类中的成员变量名和类型。
 * 
 * 这个时候该怎么做呢？
 * 
 * 首先想到的就是，在编写Student类的时候，就指明这个类将要生成的表名称为tb_student
 * 在编写Student类中的成员变量的时候，就指明这个成员变量是对应tb_student表中的一列（即使用成员变量名作为列的名称），
 * 并指明这个列的类型和类型长度
 * 
 * 那么，应该怎么实现呢？
 * 
 * 如下：可以在Student类上写一句代码 
 * @Table(value = "tb_student")，这句代码指明了要创建了的Student
 * 类对应表tb_student.
 * 
 * 可以在Student类中的成员变量上指定如下代码：
 * 
 * @Filed(columnName = "id", length = 10, type = "int")
 * private int id;
 * 此处的@Filed(columnName = "id", length = 10, type = "int")就指明了
 * 成员变量id将对应表tb_student的一列，其列类型是int型，长度为10，列名就是成员变量名
 * 
 * 由此，就引出了注解
 *
 *
 */

/*@Table(value = "tb_student")
public class Student{
	
	@Filed(columnName = "id", length = 10, type = "int")
	private int id;
	
	private String studentName;
	
	private int age;

	public Student() {
		super();
	}

	public Student(int id, String studentName, int age) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
}*/

@SuppressWarnings(value = { "all" })
public class Demo01 {
	public static void main(String[] args){
		try {
			Class clazz = Class.forName("annotation_test.Student");
			//获得类上的所有注解
			Annotation[] annotations = clazz.getAnnotations();
			//遍历类上的所有注解
			for (Annotation annotation : annotations) {
				
				//输出注解类型
				System.out.println(annotation.annotationType()); //interface annotation_test.Table
				
				//直接输出注解 
				System.out.println(annotation); //@annotation_test.Table(value=tb_student)
				
				//把注解强转成Table，并输出其中的value值
				Table t = (Table)annotation;
				System.out.println(t.value()); //tb_student
			}
			System.out.println("------------");
			//获得类上的指定注解
			Table table = (Table) clazz.getAnnotation(Table.class);
			System.out.println(table);
			System.out.println(table.value());
			System.out.println("------------");
			
			//获得类中属性的注解
			//1.获得属性对象
			Field f = clazz.getDeclaredField("studentName");
			//2.获得属性上的注解对象
			Filed filed = f.getAnnotation(Filed.class);
			System.out.println(filed);
			//3.打印出注解信息
			System.out.println(filed.columnName()+"---"+filed.type()+"---"+filed.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
