import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		 List<String>list = new ArrayList<>();
		 list.add("chandu");
		 list.add("Ajay");
		 list.add("vijay");
		 list.add("Anil");
		 list.add("Prabhas");
		 
		 list.forEach((s)->System.out.println(s));
		 
	}

}
