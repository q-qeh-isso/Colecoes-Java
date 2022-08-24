import java.util.*;

public class TesteDesempenhoColecoes {
	
	public static void main(String[] args) {
		
		//Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 0; i<300000; i++){
			numeros.add(i);
		}
		
		long pontoInicial = System.currentTimeMillis(); //tempo corrente, tempo de maquina, tempo de execução
		
		System.out.println("Pesquisando ... ");
		for(int i = 0; i<300000; i++){
			numeros.contains(i);
		}
		
		long pontoFinal = System.currentTimeMillis();
		
		long tempo = pontoFinal - pontoInicial;
		System.out.println("\nTempo gasto na pesquisa " + tempo);
		
		
		
	}

}
