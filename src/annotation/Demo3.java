package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import annotation_test.Filed;
import annotation_test.Table;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * @author Sun
 *
 */
@SuppressWarnings(value = { "all" })
public class Demo3 {
	public static void main(String[] args){
		try {
			Class clazz = Class.forName("annotation_test.Student");
			//获得类上的所有注解
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println("注解类型:"+annotation.annotationType());
				System.out.println("注解:"+annotation);
			}
			
			System.out.println("---------------------------------------------");
			//获得类上的指定注解
			Table table = (Table) clazz.getAnnotation(Table.class);
			System.out.println("注解:"+table);
			System.out.println("注解的内容:"+table.value());
			System.out.println("---------------------------------------------");
			
			//获得类中属性的注解
			//1.先获得属性对象
			Field f = clazz.getDeclaredField("studentName");
			//2.获得属性上的注解对象
			Filed filed = f.getAnnotation(Filed.class);
			System.out.println("注解:"+filed);
			//3.打印出注解信息
			System.out.println("注解的内容:"+filed.columnName()+"---"+filed.type()+"---"+filed.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
