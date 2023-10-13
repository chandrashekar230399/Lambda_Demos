import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Bike{
	String name;
	Double milege;
	
}
public class SortedMethodExample {

	public static void stringSorting() {

		List<String> l = Arrays.asList("Zebra", "Apple", "apple", "1apple","@h","$ggg");
		System.out.println(l);
		List<String> l1 = new ArrayList<>();
		l.stream().sorted().forEach((m) -> l1.add(m));
		System.out.println(l1);
	}

	public static void main(String[] args) {
		 //sorted()
		 //sorted(Comparator c)
		stringSorting();
		List<Integer> l = Arrays.asList(2, -1, 7, 34, 67, 89, -20);

		System.out.println(l);
		List<Integer> l2 = new ArrayList<>();
		l.stream().sorted().forEach(t -> l2.add(t));
		System.out.println(l2);

	}

}
