import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class LambdaDemo1 {

	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		set.add("Karthi");
		set.add("Trisha");
		set.add("Vikram");
		set.add("Aishwaryarai");
		set.add("JayamRavi");
		set.add("prakashraj");
		set.add("Prabhu");
		set.add("VikramPrabhu");
		set.add("AishwaryaLekshmi");
		set.add("sobhita");
		set.add("Nazar");
		set.add("sarathKumar");
		set.add("parthinan");
		set.add("SaraArjun");
		
		Consumer<String>obj=(ss)->System.out.println(ss);
		set.forEach(obj);
	}

}
