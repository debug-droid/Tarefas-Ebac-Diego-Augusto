import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Digite a sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a sua terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a sua quarta nota: ");
        nota4 = sc.nextDouble();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if(media >= 7) {
            System.out.println("Sua média é: " + media + ", você está aprovado!");
        } else if(media >= 5) {
            System.out.println("Sua média é: "+ media +", você está de recuperação!");
        } else {
            System.out.println("Sua média é: "+ media + ", você está reprovado!");
        }

    }
}