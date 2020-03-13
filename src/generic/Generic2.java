package generic;

public class Generic2 {

	public static void main(String[] args) {
//		Tool tool = new Tool();
		
		Tool_1<Integer> tool = new Tool_1<Integer>();
		
		tool.setObject(4);
		
		int s = tool.getObject();
		System.out.println(s);
	}
}

