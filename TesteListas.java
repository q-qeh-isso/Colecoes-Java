import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TesteListas {
	
	public static void main(String[] args) {
		
		//List<String> nomes = new ArrayList<String>();
		//List<String> nomes = new LinkedList<String>();
		List<String> nomes = new Vector<String>();
		
		nomes.add("Joao");
		nomes.add("Maria Aparecida");
		nomes.add("Ana");
		nomes.add("Zoroastro");
		nomes.add("Vinicius");
		nomes.add("Priscila");
		nomes.add("Sheilla");
		nomes.add("Ana Ana Ana Ana ana");
		nomes.add("Ana");
		nomes.add("Ana");
		nomes.add("Ana");
		
		//size() retorna a quantidade de elementos
		System.out.println("Quantidade de elementos: " + nomes.size());
		
		mostraLista(nomes);		
		nomes.remove("Ana");		
		mostraLista(nomes);

		if(nomes.contains("Marcellus")){
			System.out.println("Marcellus se encontra na Lista");
		}
		if(nomes.contains("Ana")){
			System.out.println("Ana se encontra na Lista");
		}
		
		Iterator<String> cursor = nomes.iterator();
		System.out.println("Percorrendo com o cursor da Lista");
		while(cursor.hasNext()){
			System.out.println(cursor.next());
		}
		
		//Para coleções indexadas, pode-se usar o get(indice)
		//Recuperando o elemento contido no indice String
		String sextoNome = nomes.get(5);
		System.out.println("Sexto nome da lista é : " + sextoNome);	
		
		Collections.sort(nomes);
		System.out.println("***Lista Ordenada***");
		mostraLista(nomes);
		
		String nomeMax = Collections.max(nomes);
		System.out.println("Maior elemento da coleção: " + nomeMax);
		String nomeMin = Collections.min(nomes);
		System.out.println("Menor elemento da coleção: " + nomeMin);
		
		System.out.println("***Ordem Inversa***");
		Collections.reverse(nomes);
		mostraLista(nomes);
		
			
		
		//ordenando pela quantidade de caracteres da String
		nomes.sort((x,y) -> x.length()-y.length());
		
		System.out.println("***Lista ordenada pela quantidade de caracteres***");
		mostraLista(nomes);
		
		//removendo todas as 'anas'
		nomes.removeIf(x -> x.equals("Ana"));
		System.out.println("Lista sem Anas");
		mostraLista(nomes);
		
		/*System.out.println("***Lista com ForEach***");
		nomes.forEach(x -> System.out.println(x));*/
		
				
	}
	
	private static void mostraLista(List<String> lista){
		//Pra cada variavel nome dentro de nomes
		System.out.println("*** Elementos da Lista ***");
		for(String nome : lista){
			System.out.println(nome);
		}		
	}

}
