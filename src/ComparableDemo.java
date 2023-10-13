import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	Integer stdId;
	String name;
	String gender;
	Double fee;
	Double percent;

	public Student(Integer stdId, String name, String gender, Double fee, Double percent) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.gender = gender;
		this.fee = fee;
		this.percent = percent;
	}

	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", gender=" + gender + ", fee=" + fee + ", percent="
				+ percent + "]";
	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
		l.add(new Student(1, "sundeep", "Male", 5000.0, 90.0));
		l.add(new Student(2, "teja ", "Male", 4000.0, 80.0));
		l.add(new Student(3, "mahesh", "Male", 3000.0, 95.0));
		l.add(new Student(4, "sruthi", "FeMale", 2000.0, 97.0));
		System.out.println(l );
		Comparator<Student> c = (Student a, Student b) -> {
			return -a.percent.compareTo(b.percent);
			// return a.fee.compareTo(b.fee);
		};
		Collections.sort(l, c);
		System.out.println(l);
	}

}