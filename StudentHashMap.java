package xyz;
import java.util.HashMap;
import java.util.List;

public class studentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> stu=new HashMap<>();
		stu.put(1, "anusha");
		stu.put(2, "siva");
		stu.put(3, "sireesha");
		stu.put(4, "teja");
		stu.put(5, "nani");
		System.out.println(stu);
		stu.remove(1);
		System.out.println(stu);
		stu.replace(3, "sai");
		System.out.println(stu);
			if(stu.containsKey(4)){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			for(int i=1;i<stu.size()+1;i++) {
				System.out.println(stu.get(i));
			}
		//stu.keySet();
		System.out.println(stu.keySet());
	}

}