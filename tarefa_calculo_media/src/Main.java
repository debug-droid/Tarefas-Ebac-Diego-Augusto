//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notas nota1 = new Notas();
        Notas nota2 = new Notas();
        Notas nota3 = new Notas();
        Notas nota4 = new Notas();

        nota1.setNota1(7);
        nota2.setNota2(8);
        nota3.setNota3(9);
        nota4.setNota4(10);

        System.out.println((nota1.getNota1()) + (nota2.getNota2() + nota3.getNota3() + nota4.getNota4()) / 4);
    }
}