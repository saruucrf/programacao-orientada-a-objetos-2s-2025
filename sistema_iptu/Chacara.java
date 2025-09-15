package sistema_iptu;

public class Chacara extends Imovel {
    private boolean possuiPocoArtesiano;

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, boolean possuiPocoArtesiano) {
        super(municipio, areaM2, vagas);
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public boolean getPossuiPocoArtesiano() {
        return this.possuiPocoArtesiano;
    }
    public void setPossuiPocoArtesiano(boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

}
