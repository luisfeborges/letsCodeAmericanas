package CalculadoraDePrecosModulo3.Classes;


    public class Produto {

        private final Double preco;
        private final Double peso;
    
        public Produto(Double preco, Double peso) {
            this.preco = preco;
            this.peso = peso;
        }
    
        public Double getPreco() {
            return preco;
        }
    
        public Double getPeso() {
            return peso;
        }
    }

