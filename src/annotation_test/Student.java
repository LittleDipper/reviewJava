package annotation_test;

@Table(value = "tb_student")
public class Student {
	
	@Filed(columnName = "id", length = 10, type = "int")
	private int id;
	@Filed(columnName = "sname", length = 10, type = "varchar")
	private String studentName;
	@Filed(columnName = "age", length = 3, type = "int")
	private int age;
	
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
}
