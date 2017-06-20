import java.util.ArrayList;

/**
 * Created by pdr_m on 18/06/2017.
 */
public class Bloco {

    private int numBloco;

    private ArrayList<Endereco> enderecos;

    public Bloco() {
        this.enderecos = new ArrayList<>();
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String toString() {

        String resultado = "";

        for(Endereco e : enderecos){
            resultado =  resultado + this.getNumBloco() + "-" + e.toString() + '\n';
        }

        return resultado;
    }

    private int getNumBloco() {
        return numBloco;
    }

    public void setNumBloco(int numBloco) {
        this.numBloco = numBloco;
    }
}
