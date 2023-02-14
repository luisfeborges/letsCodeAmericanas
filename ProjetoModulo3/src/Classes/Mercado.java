package ProjetoModulo3.src.Classes;

import java.util.UUID;

public class Mercado extends Produto {
    private String nomeMercado;
    private int peso;
    
    
    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Mercado(String nome, Double preco, String categoria, String marca, String nomeMercado, int peso) {
        super(UUID.randomUUID(), nome, preco, categoria, marca); 
        this.nomeMercado = nomeMercado;
        this.peso = peso;
    }
    
    @Override
    public void dadosProduto() {
        super.dadosProduto();
        System.out.println("Nome do Mercado: " + nomeMercado);
        System.out.println("Peso: " + peso);
    }
    
}
