import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListaNumerica {
	
	public static void main(String[] args) {
		
		List<Integer> idades = new ArrayList<Integer>();
		
		//antigamente, antes Java 5
		idades.add(new Integer(20));
		//atualmente, pos Java 5
		idades.add(23);
		idades.add(30);
		idades.add(54);
		idades.add(73);
		idades.add(23);
		idades.add(56);
		idades.add(90);
		idades.add(34);
		
		Collections.sort(idades);
		
		idades.forEach(x -> System.out.println(x));
		
		
		
	}

}
