import java.util.Scanner;

class Main {

    private static final Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá, seja bem vindo ao Simulador de Memória Cache!!");
        System.out.println("Antes de começarmos, digite as configurações esperadas:");
        System.out.println("Digite o Tamanho do Bloco (em número de palavras): ");
        Config.setTamanhoDoBloco(leitor.nextInt());
        System.out.println("Digite o Número de Linhas da Cache: ");
        Config.setNumeroLinhasCache(leitor.nextInt());
        System.out.println("Digite o Número de Blocos da Memória Principal: ");
        Config.setNumeroBlocosMemoriaPrincipal(leitor.nextInt());
        System.out.println("Escolha o Mapeamento: ");
        System.out.println("1 - Direto | 2 - Totalmente Associativo | 3 - Parcialmente Associativo");
        Config.setMAPEAMENTO(leitor.nextInt());
        if(Config.getMAPEAMENTO() == 3){
            System.out.println("Escolha o Número de Conjuntos: ");
            Config.setNumeroConjuntos(leitor.nextInt());
        }
        System.out.println("Escolha a Política de Substituição: ");
        System.out.println("1 - Aleatório | 2 - FIFO | 3 - LFU | 4 - LRU");
        Config.setPoliticaSubstituicao(leitor.nextInt());
        System.out.println("Escolha a Política de Escrita: ");
        System.out.println("1 - Write-back | 2 - Write-through");
        Config.setPoliticaEscrita(leitor.nextInt());

        Processador processador = new Processador(leitor);
        processador.rodar();
    }
}
