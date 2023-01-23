package src.Classes;

public abstract class Animal {
    
    protected int id;
    protected String nome;
    protected String dono;
    protected String raca;
    protected int idade;
    protected boolean estaDoente;

    public void printInformacoes() {
        System.out.println("Id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Dono: " + getDono());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade());

        if(getEstaDoente() == false) {
            System.out.println("Saúde: saudável");
        } else {
            System.out.println("Saúde: deonte");
        }
    }

    //Funções SET
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(String dono2) {
        dono = dono2;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEstaDoente(Boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    //Funções GET
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDono() {
        return dono;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getEstaDoente() {
        return estaDoente;
    }

}
