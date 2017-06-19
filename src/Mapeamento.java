/**
 * Created by pdr_m on 18/06/2017.
 */
public abstract class Mapeamento {
    public abstract int calcularLinhaCache(int palavra);

    public abstract boolean verificarNaCache(Cache cache, int linhaCache, int palavra);

    public int calcularBlocoMemoriaPrincipal(int palavra) {
        return palavra / Config.getTamanhoDoBloco();
    }
}
