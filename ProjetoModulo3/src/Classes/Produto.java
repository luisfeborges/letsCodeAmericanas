package ProjetoModulo3.src.Classes;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected String categoria;
    protected String marca;
        
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + ", marca="
                + marca + "]";
    }
    
}
