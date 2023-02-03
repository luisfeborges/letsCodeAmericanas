package ProjetoModulo3.src.Classes;

public class Informatica extends Produto {
    private int voltagem;

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public Informatica(int id, String nome, Double preco, String categoria, String marca, int voltagem) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;       
        this.voltagem = voltagem;
    }


    @Override
    public String toString() {
        return "Informatica [voltagem=" + voltagem + "]";
    }
}
