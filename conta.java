public class conta {
    
    int numero;
    public String titular;
    public double saldo;
    public double limite = 1300; //indica o limite do cheque especial

    public void depositar(double quantidade) {
        try{
            if(quantidade > 0) {
                saldo = saldo + quantidade;
            } else {
                System.out.println("Insira um valor maior que 0.");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public boolean sacar(double quantidade) {
        try {
            if(quantidade > saldo) {
                if(quantidade > 0) {
                    if(quantidade > saldo + limite) {
                        System.out.println("Saque indisponível! Seu saldo é R$ " + saldo + ", e seu limite é R$ " + (saldo+limite));
                        return false;
                    } else {
                        saldo = saldo - quantidade;
                        return true;
                    }
                } else {
                    saldo = saldo - quantidade;
                    return true;
                }
            } else {
                System.out.println("Insira um valor maior que 0.");
                return false;
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
