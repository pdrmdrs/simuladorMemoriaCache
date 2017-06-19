/**
 * Created by pdr_m on 18/06/2017.
 */
public class Endereco {
    private int conteudo;

    private int valorEndereco;

    public Endereco(){
        this.conteudo = 0;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public int getValorEndereco() {
        return valorEndereco;
    }

    public void setValorEndereco(int valorEndereco) {
        this.valorEndereco = valorEndereco;
    }

    public String toString() {
        String resultado = "";

        resultado = this.getValorEndereco() + "-" + this.getConteudo();

        return resultado;
    }
}
