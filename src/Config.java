/**
 * Created by pdr_m on 18/06/2017.
 */
class Config {

    /**
     * Define o tamanho do bloco (em número de palavras)
     */
    private static int TAMANHO_DO_BLOCO;

    /**
     * Define o número de linhas da cache
     */
    private static int NUMERO_LINHAS_CACHE;

    /**
     * Define o número de blocos da memória principal
     */
    private static int NUMERO_BLOCOS_MEMORIA_PRINCIPAL;

    /**
     * Define o mapeamento
     * 1 - Direto
     * 2 - Totalmente Associativo
     * 3 - Parcialmente Associativo
     */
    private static int MAPEAMENTO;

    /**
     * Define o número de conjuntos (APENAS SE O MAPEAMENTO FOR 3 - Parcialmente Associativo)
     */
    private static int NUMERO_CONJUNTOS;

    /**
     * Define a política de substituição
     * 1 - Aleatório
     * 2 - FIFO (Primeiro a entrar, primeiro a sair)
     * 3 - LFU  (Menos frequentemente usado)
     * 4 - LRU  (Menos recentemente usado)
     */
    private static int POLITICA_SUBSTITUICAO;

    /**
     * Define a política de escrita
     * 1 - Write-back
     * 2 - Write-through
     */
    private static int POLITICA_ESCRITA;

    public static int getTamanhoDoBloco() {
        return TAMANHO_DO_BLOCO;
    }

    public static void setTamanhoDoBloco(int tamanhoDoBloco) {
        TAMANHO_DO_BLOCO = tamanhoDoBloco;
    }

    public static int getNumeroLinhasCache() {
        return NUMERO_LINHAS_CACHE;
    }

    public static void setNumeroLinhasCache(int numeroLinhasCache) {
        NUMERO_LINHAS_CACHE = numeroLinhasCache;
    }

    public static int getNumeroBlocosMemoriaPrincipal() {
        return NUMERO_BLOCOS_MEMORIA_PRINCIPAL;
    }

    public static void setNumeroBlocosMemoriaPrincipal(int numeroBlocosMemoriaPrincipal) {
        NUMERO_BLOCOS_MEMORIA_PRINCIPAL = numeroBlocosMemoriaPrincipal;
    }

    public static int getMAPEAMENTO() {
        return MAPEAMENTO;
    }

    public static void setMAPEAMENTO(int MAPEAMENTO) {
        Config.MAPEAMENTO = MAPEAMENTO;
    }

    public static int getNumeroConjuntos() {
        return NUMERO_CONJUNTOS;
    }

    public static void setNumeroConjuntos(int numeroConjuntos) {
        NUMERO_CONJUNTOS = numeroConjuntos;
    }

    public static int getPoliticaSubstituicao() {
        return POLITICA_SUBSTITUICAO;
    }

    public static void setPoliticaSubstituicao(int politicaSubstituicao) {
        POLITICA_SUBSTITUICAO = politicaSubstituicao;
    }

    public static int getPoliticaEscrita() {
        return POLITICA_ESCRITA;
    }

    public static void setPoliticaEscrita(int politicaEscrita) {
        POLITICA_ESCRITA = politicaEscrita;
    }
}
