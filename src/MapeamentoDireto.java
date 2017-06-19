/**
 * Created by pdr_m on 18/06/2017.
 */
public class MapeamentoDireto extends Mapeamento implements Substituicao{

    private int numBloco;

    private int numLinhasCache;

    public int getNumBloco() {
        return numBloco;
    }

    public void setNumBloco(int numBloco) {
        this.numBloco = numBloco;
    }

    public int getNumLinhasCache() {
        return numLinhasCache;
    }

    public void setNumLinhasCache(int numLinhasCache) {
        this.numLinhasCache = numLinhasCache;
    }

    @Override
    public int calcularLinhaCache(int palavra) {

        int linhaCache = calcularBlocoMemoriaPrincipal(palavra) % Config.getNumeroLinhasCache();

        return linhaCache;
    }

    @Override
    public boolean verificarNaCache(Cache cache, int linhaCache, int palavra) {
        boolean achou = false;

//        for(int i = 0; i < Config.getTamanhoDoBloco(); i++){
//            if(cache.getBlocos()[linhaCache][i] == palavra)
//                achou = true;
//        }
        for(int i = 0; i < Config.getNumeroLinhasCache(); i++) {
            Bloco b = cache.getLinhas().get(i).getBlocoDaMemoria();
            if(b != null) {
                for(Endereco e: b.getEnderecos()){
                    if(e.getValorEndereco() == palavra){
                        achou = true;
                    }
                }
            }
        }

        return achou;
    }

    @Override
    public void escreverNaCache(Cache cache, MemoriaPrincipal memoriaPrincipal, int blocoMemoria, int linhaCache) {
        cache.setBloco(memoriaPrincipal.getBloco(blocoMemoria), linhaCache);
    }
}
