package ProjetoModulo3.src.Classes;

public class Mercado extends Produto {
    private int quantidade;
    private String nomeMercado;
    private int peso;
    
    public int getQuantidade() {
        return quantidade;
    }
    public String getNomeMercado() {
        return nomeMercado;
    }
    public int getPeso() {
        return peso;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public Mercado(int quantidade, String nomeMercado, int peso) {
        this.quantidade = quantidade;
        this.nomeMercado = nomeMercado;
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Mercado [quantidade=" + quantidade + ", nomeMercado=" + nomeMercado + ", peso=" + peso + "]";
    }
    
}
