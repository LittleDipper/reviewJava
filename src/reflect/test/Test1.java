package reflect.test;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import reflect.domain.Person;

public class Test1 {

	public static void main(String[] args) {
		Person person = new Person("liSi",21);
		
		Class<? extends Person> class1 = person.getClass();
		System.out.println(class1);
		System.out.println(class1.getName());
		System.out.println(class1.getCanonicalName());
		System.out.println(class1.getModifiers());
		int public1 = Modifier.PUBLIC;
		System.out.println(public1);
		System.out.println(class1.getSimpleName());
//		System.out.println(class1.getAnnotation(null));
		Class<?>[] classes = class1.getClasses();
		for (int i = 0; i < classes.length; i++) {
			Class<?> class2 = classes[i];
			System.out.println(class2);
		}
		System.out.println(class1.getClasses().toString());
		Package package1 = class1.getPackage();
		System.out.println(package1);
		Class<?> superclass = class1.getSuperclass();
		System.out.println(superclass);
		Type genericSuperclass = class1.getGenericSuperclass();
		System.out.println(genericSuperclass);
		Class in = int.class.getClass();
		System.out.println(in);
	}

}
