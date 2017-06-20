/**
 * Created by pdr_m on 18/06/2017.
 */
public class TotalmenteAssociativo extends Mapeamento {

    @Override
    public int calcularLinhaCache(int palavra) {
        return 0;
    }

    @Override
    public boolean verificarNaCache(Cache cache, int linhaCache, int palavra) {

        boolean achou = false;

        for(Linha l : cache.getLinhas()){
            Bloco b = l.getBlocoDaMemoria();
            if(b != null) {
                for(Endereco e : b.getEnderecos()){
                    if(e.getValorEndereco() == palavra){
                        achou = true;
                    }
                }
            }
        }

        return achou;
    }
}
