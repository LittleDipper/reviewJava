package annotation;

public class Demo02 {
	@MyAnnotation01(age = 18,studentName="小红",id=1001,schools={"南京邮电大学","清华大学"})
	public void test001(){
		
	}
	
	@MyAnnotation02(value = "aaa")
	public void Test02(){
		
	}
}
