import java.util.ArrayList;

/**
 * Created by pdr_m on 18/06/2017.
 */
class MemoriaPrincipal {

    private int incrementador = 0;

    private int numeroBlocos;

    private ArrayList<Bloco> blocos;

    MemoriaPrincipal() {
        this.numeroBlocos = Config.getNumeroBlocosMemoriaPrincipal();

        this.blocos = new ArrayList<>();

        this.preencherMemoriaPrincipal();
    }

    private void preencherMemoriaPrincipal() {

        System.out.println("Preenchendo a memória principal...");
        for(int i = 0; i < numeroBlocos; i++) {

            Bloco b = new Bloco();
            b.setNumBloco(i);

            for(int j = 0; j < Config.getTamanhoDoBloco(); j++){
                Endereco e = new Endereco();
                e.setValorEndereco(incrementador);
                b.getEnderecos().add(e);
                incrementador++;
            }

            this.blocos.add(b);
        }
    }

    void mostrarMemoriaPrincipal() {
        for(Bloco b : blocos) {
            System.out.println(b.toString());
        }
    }

    public void setBloco(Bloco bloco, int blocoMemoriaPrincipal) {
        this.getBlocos().set(blocoMemoriaPrincipal, bloco);
    }

    Bloco getBloco(int blocoMemoriaPrincipal) {
        return this.getBlocos().get(blocoMemoriaPrincipal);
    }

    int getNumeroBlocos() {
        return numeroBlocos;
    }

    public void setNumeroBlocos(int numeroBlocos) {
        this.numeroBlocos = numeroBlocos;
    }

    private ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }
}
