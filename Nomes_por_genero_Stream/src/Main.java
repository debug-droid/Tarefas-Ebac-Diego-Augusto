
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os nomes e sexos no formato Nome,Sexo; (ex: João,M;Maria,F): ");
		String input = sc.nextLine();

		List<String> nomesFemininos = Arrays.stream(input.split(";"))
		    .map(entrada -> entrada.split(","))
		    .filter(partes -> partes.length == 2)
		    .filter(partes -> partes[1].trim().equalsIgnoreCase("F"))
		    .map(partes -> partes[0].trim())
		    .sorted()
		    .collect(Collectors.toList());

		// Imprime os nomes femininos
		System.out.println("Nomes Femininos:");
		nomesFemininos.forEach(System.out::println);

		sc.close();

	}

}
