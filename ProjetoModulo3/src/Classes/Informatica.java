package ProjetoModulo3.src.Classes;

import java.util.UUID;

public class Informatica extends Produto {
    private int voltagem;

    public int getVoltagem() {
        return voltagem;
    }


    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }


    public Informatica(String nome, Double preco, String categoria, String marca, int voltagem) {
        super(UUID.randomUUID(), nome, preco, categoria, marca); 
        this.voltagem = voltagem;
    }


    @Override
    public void dadosProduto() {
        super.dadosProduto();
        System.out.println("Voltagem: " + voltagem);
    }
}
