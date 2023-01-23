public class TesteConcessionaria {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "Mercedes";
        carro1.modelo = "Sedan";
        carro1.cor = "Prata";
        carro1.numeroDeRodas = 5;
        carro1.aroRoda = 21;
        carro1.anoDeFabricacao = 2022;
        carro1.dono = "Luis Felipe";
        carro1.estiloDeCombustivel = "gasolina";
        carro1.motor = "Mercedes Benz 204 CV";
        carro1.preco = 370.00;

        System.out.println(carro1.preco);
        carro1.ligar();


    }
}
