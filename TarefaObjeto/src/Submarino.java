/**
 * @author Diego Augusto
 */
public class Submarino {

    //Variáveis da classe
    private String nome;
    private String ano;
    private String modelo;
    private String cor;

    // Métodos getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //Métodos da classe
    public void imprimeNome() {
        System.out.println("Nome: " + getNome());
    }

    public void submergir() {
        System.out.println("Submergindo...");
    }

    public void emergir() {
        System.out.println("Emergindo...");
    }


}
