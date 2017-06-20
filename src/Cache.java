import java.util.ArrayList;

/**
 * Created by pdr_m on 18/06/2017.
 */
class Cache {

    private int numeroLinhas;

    private ArrayList<Linha> linhas;

    public Cache() {
        this.numeroLinhas = Config.getNumeroLinhasCache();

        this.linhas = new ArrayList<>();

        this.preencherCache();
    }

    private void preencherCache() {
        for(int i = 0; i < Config.getNumeroLinhasCache(); i++) {
            Linha l = new Linha();
            l.setNumLinha(i);
            this.linhas.add(l);
        }
    }

    void mostrarCache() {
        for(Linha l : this.getLinhas()) {
            for(int i = 0; i < Config.getTamanhoDoBloco(); i++){
                if(l != null){
                    System.out.println(l.toString());
                } else {
                    System.out.println("0-0-0-0");
                }
            }
        }
    }

    void setBloco(Bloco bloco, int linhaCache) {
        Linha l = new Linha();
        l.setNumLinha(linhaCache);
        l.setBlocoDaMemoria(bloco);
        this.getLinhas().set(linhaCache, l);
    }

    public Bloco getBloco(int linhaCache) {
        return this.getLinhas().get(linhaCache).getBlocoDaMemoria();
    }

    int getNumeroLinhas() {
        return numeroLinhas;
    }

    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }

    ArrayList<Linha> getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList<Linha> linhas) {
        this.linhas = linhas;
    }
}
