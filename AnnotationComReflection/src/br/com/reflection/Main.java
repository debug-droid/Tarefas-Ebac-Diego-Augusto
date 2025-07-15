package br.com.reflection;

public class Main {
    public static void main(String[] args) {
        
        Class<Livro> clazz = Livro.class;

        
        if (clazz.isAnnotationPresent(Biblioteca.class)) {
            
            Biblioteca biblioteca = clazz.getAnnotation(Biblioteca.class);
            
            
            System.out.println("Valor da tabela: " + biblioteca.value());
            System.out.println("Nomes dos livros:");
            for (String livro : biblioteca.nomesDeLivros()) {
                System.out.println(livro);
            }
        } else {
            System.out.println("A classe Livro não possui a anotação Biblioteca.");
        }
    }
}