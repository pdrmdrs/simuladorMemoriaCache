/**
 * Created by pdr_m on 18/06/2017.
 */
public class Linha {

    private int numLinha;

    public Bloco getBlocoDaMemoria() {
        return blocoDaMemoria;
    }

    public void setBlocoDaMemoria(Bloco blocoDaMemoria) {
        this.blocoDaMemoria = blocoDaMemoria;
    }

    private Bloco blocoDaMemoria;

    public int getNumLinha() {
        return numLinha;
    }

    public void setNumLinha(int numLinha) {
        this.numLinha = numLinha;
    }

    public String toString() {
        String resultado = "";

        resultado = this.getNumLinha() + "-" + this.getBlocoDaMemoria().toString();

        return resultado;
    }
}
