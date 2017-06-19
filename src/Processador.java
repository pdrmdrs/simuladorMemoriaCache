import java.util.Scanner;

/**
 * Created by pdr_m on 18/06/2017.
 */
public class Processador {

    private Scanner leitor;

    private Cache cache;

    private MemoriaPrincipal memoriaPrincipal;

    private Mapeamento mapeamento;

    private Substituicao substituicao;

    /**
     * Opções do processador:
     * 1 - Read
     * 2 - Write
     * 3 - Show
     * 0 - Sair
     */
    private int opcaoMenu = 99;

    private int enderecoParaSerLido_READ;

    private int enderecoParaSerEscrito_WRITE;
    private int novoValorParaSerEscrito_WRITE;

    Processador(Scanner leitor) {
        this.leitor = leitor;

        this.iniciar();
    }

    private void iniciar() {
        System.out.println("Iniciando valores do processador...");
        this.cache = new Cache();
        System.out.println("A cache possui " + this.cache.getNumeroLinhas() + " linhas.");

        this.memoriaPrincipal = new MemoriaPrincipal();
        System.out.println("A memória principal possui " + this.memoriaPrincipal.getNumeroBlocos() + " blocos.");

        System.out.println("Cada bloco do sistema possui " + Config.getTamanhoDoBloco() + " palavras.");

        if(Config.getMAPEAMENTO() == 1) {
            this.mapeamento = new MapeamentoDireto();
        }else if(Config.getMAPEAMENTO() == 2) {
            this.mapeamento = new TotalmenteAssociativo();
        } else if(Config.getMAPEAMENTO() == 3) {
            this.mapeamento = new ParcialmenteAssociativo();
        }

        if(Config.getPoliticaSubstituicao() == 1) {
            this.substituicao = new Aleatoria();
        } else if(Config.getPoliticaSubstituicao() == 2) {
            this.substituicao = new FIFO();
        } else if(Config.getPoliticaSubstituicao() == 3) {
            this.substituicao = new LFU();
        } else if(Config.getPoliticaSubstituicao() == 4) {
            this.substituicao = new LRU();
        }

        //se o mapeamento for direto, sua politica de substituição é a mesma coisa do mapeamento
        if(Config.getMAPEAMENTO() == 1) {
            this.substituicao = new MapeamentoDireto();
        }
    }

    void rodar() {
        while(opcaoMenu != 0){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Read | 2 - Write | 3 - Show | 0 - Sair");
            this.opcaoMenu = this.leitor.nextInt();
            switch (opcaoMenu){
                case 1:
                    System.out.println("Digite o endereço desejado: ");
                    this.enderecoParaSerLido_READ = this.leitor.nextInt();
                    //fazer as coisa de ler o endereço

                    this.ler();

                    break;
                case 2:
                    System.out.println("Digite o endereço a ser escrito: ");
                    this.enderecoParaSerEscrito_WRITE = this.leitor.nextInt();
                    System.out.println("Digite o novo valor: ");
                    this.novoValorParaSerEscrito_WRITE = this.leitor.nextInt();
                    //fazer as coisa de escrever o novo valor no endereço

                    System.out.println("----ESCREVENDO NOVO VALOR " + this.novoValorParaSerEscrito_WRITE + " EM " +
                    this.enderecoParaSerEscrito_WRITE);

                    break;
                case 3:
                    //mostrar as coisas da cache

//                    System.out.println("Memória Cache: ");
//                    System.out.println("Linha-Bloco-Endereço-Conteúdo");
//                    this.cache.mostrarCache();

                    System.out.println("Memória Principal: ");
                    System.out.println("Bloco-Endereço-Conteúdo");
                    this.memoriaPrincipal.mostrarMemoriaPrincipal();

                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Comando inválido.");
                    break;
            }
        }
    }

    private void ler() {
        int linhaCache = this.mapeamento.calcularLinhaCache(this.enderecoParaSerLido_READ);

        boolean achouNaCache = this.mapeamento.verificarNaCache(this.cache, linhaCache, this.enderecoParaSerLido_READ);

        if(achouNaCache){
            System.out.println("CACHE HIT");
            System.out.println("Achou na linha: " + linhaCache);
        } else {
            System.out.println("CACHE MISS");
            System.out.println("Trazendo o bloco da palavra da memória para a cache...");
            this.substituicao.escreverNaCache(this.cache,
                    this.memoriaPrincipal,
                    this.mapeamento.calcularBlocoMemoriaPrincipal(this.enderecoParaSerLido_READ),
                    linhaCache);
        }

    }

}
