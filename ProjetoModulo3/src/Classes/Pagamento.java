package ProjetoModulo3.src.Classes;

import java.util.UUID;

public class Pagamento {
    private UUID numeroPagamento;
    private String nome;
    private Double valorPagamento;

    public UUID getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(UUID numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Pagamento(String nome, Double valorPagamento) {
        this.numeroPagamento = UUID.randomUUID();
        this.nome = nome;
        this.valorPagamento = valorPagamento;
    }

    public void dadosPagamento() {
        System.out.println("Número do pagamento: " + this.getNumeroPagamento());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Valor: R$ " + this.getValorPagamento());
        System.out.println("---------------------------");
    }

}
