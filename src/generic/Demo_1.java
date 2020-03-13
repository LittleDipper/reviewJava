package generic;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sun
 *
 */
public class Demo_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//数组在定义时就已经明确了只能存放的元素类型
//		int[] arr = new int[3];
//		arr[0] = 1;
//		arr[1] = (int) 1.2;
		
//		float[] arr = new float[3];
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("5");
		
		//遍历list集合
		for (Iterator<String> it = list.iterator();it.hasNext();) {
//			Object object = (Object) it.next();
//			System.out.println(object.toString());
			
			String str = it.next();
			System.out.println(str.length());
		}
	}
}
