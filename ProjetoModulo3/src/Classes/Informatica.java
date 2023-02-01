package ProjetoModulo3.src.Classes;

public class Informatica extends Produto {
    private int voltagem;

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public Informatica(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "Informatica [voltagem=" + voltagem + "]";
    }
}
