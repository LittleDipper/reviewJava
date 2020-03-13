package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation01 {
	String studentName() default "老王";
	int age() default 21;
	int id() default -1;
	String[] schools() default {"清华大学","北京大学"};
}
