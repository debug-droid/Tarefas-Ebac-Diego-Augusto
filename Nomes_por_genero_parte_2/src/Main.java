import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. Ler nomes e sexo
        System.out.println("Digite os nomes e sexos no formato Nome,Sexo; (ex: João,M;Maria,F): ");
        String input = sc.nextLine();

        // 2. Separar por grupo de gênero
        String[] entradas = input.split(";");
        Map<String, List<String>> generoMap = new HashMap<>();
        generoMap.put("Masculino", new ArrayList<>());
        generoMap.put("Feminino", new ArrayList<>());

        Arrays.stream(entradas)
        .map(entrada -> entrada.split(","))
        .filter(partes -> partes.length == 2)
        .forEach(partes -> {
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();
            
            // Agrupar por gênero
            if (sexo.equals("M")) {
                generoMap.get("Masculino").add(nome);
            } else if (sexo.equals("F")) {
                generoMap.get("Feminino").add(nome);
            }
        });

        // Ordenar e imprimir os nomes por gênero
        generoMap.keySet().forEach(genero -> {
            List<String> nomes = generoMap.get(genero);
            Collections.sort(nomes);
            System.out.println(genero + ":");
            nomes.forEach(System.out::println);
        });

        sc.close();

	}

}
