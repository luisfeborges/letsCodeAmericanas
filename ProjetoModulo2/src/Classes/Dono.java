package src.Classes;

public class Dono {
    
    private int id;
    private String nome;
    private int cpf;
    private int telefone;
    private String endereco;
    private String email;

    public Dono(int id, String nome, int cpf, int telefone, String endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email; 
    }

    public void printInformacoes() {
        System.out.println("Id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("E-mail: " + getEmail());
    }

        //Funções SET
        public void setId(int id) {
            this.id = id;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setCpf(int cpf) {
            this.cpf = cpf;
        }
        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public void setEmail(String email) {
            this.email = email;
        }


        //Funções GET
        public int getId() {
        return id;
    }
        public String getNome() {
        return nome;
    }
        public int getCpf() {
        return cpf;
    }
        public int getTelefone() {
        return telefone;
    }
        public String getEndereco() {
        return endereco;
    }
        public String getEmail() {
        return email;
    }

}
