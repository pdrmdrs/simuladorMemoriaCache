/**
 * Created by pdr_m on 18/06/2017.
 */
class Linha {

    private int numLinha;

    Bloco getBlocoDaMemoria() {
        return blocoDaMemoria;
    }

    void setBlocoDaMemoria(Bloco blocoDaMemoria) {
        this.blocoDaMemoria = blocoDaMemoria;
    }

    private Bloco blocoDaMemoria;

    private int getNumLinha() {
        return numLinha;
    }

    void setNumLinha(int numLinha) {
        this.numLinha = numLinha;
    }

    public String toString() {
        String resultado = this.getNumLinha() + "-";

        if(this.getBlocoDaMemoria() == null){
            resultado = resultado + "0-0-0";
        } else {
            resultado = resultado + this.getBlocoDaMemoria().toString();
        }

        return resultado;
    }
}
