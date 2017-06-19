/**
 * Created by pdr_m on 18/06/2017.
 */
public class ParcialmenteAssociativo extends Mapeamento {

    @Override
    public int calcularLinhaCache(int palavra) {
        return 0;
    }

    @Override
    public boolean verificarNaCache(Cache cache, int linhaCache, int palavra) {
        return false;
    }
}
