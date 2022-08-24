import java.util.HashSet;
import java.util.Set;

public class TesteSets {
	
	public static void main(String[] args) {
		
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Joao");
		nomes.add("Maria Aparecida");
		nomes.add("Ana");
		nomes.add("Zoroastro");
		nomes.add("Vinicius");
		nomes.add("Priscila");
		nomes.add("Sheilla");
		nomes.add("Sheilla");
		nomes.add("Ana");
		nomes.add("Ana");
		nomes.add("Ana");
		
		nomes.forEach(x -> System.out.println(x));
		
		//pesquisando um nome
		if(nomes.contains(new String("Ana"))){
			System.out.println("\nColeção contém o nome Ana");
			System.out.println("\nCódigo hash : " + "Ana".hashCode());
		}
		
	}

}
