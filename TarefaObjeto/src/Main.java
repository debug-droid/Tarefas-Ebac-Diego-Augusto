//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Submarino sub = new Submarino();

    //Preenchendo os dados do objeto

    sub.setNome("Typhoon");
    sub.setAno("1980");
    sub.setCor("Preto");
    sub.setModelo("SSBN");

    //Método para imprimir o nome do objeto
    sub.imprimeNome();

    //Método para submergir o objeto
    sub.submergir();

    //Método para emergir o objeto
    sub.emergir();
    }
}