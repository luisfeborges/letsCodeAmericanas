import java.net.ContentHandler;

import javax.print.DocFlavor.STRING;

public class principal {
 
    public static void main(String[] args) {

        // Conta Poupança
        // Criando conta
        conta contaPoupanca = new conta();

        // alterando os valores da minhaConta
        contaPoupanca.titular = "Luis Felipe Borges";
        contaPoupanca.saldo = 1000;

        contaPoupanca.sacar(-20000);
        // contaPoupanca.depositar(100);

        System.out.println("Saldo atual: " + contaPoupanca.saldo);

    }
}
