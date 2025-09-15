package sistema_iptu;

public class Apartamento extends Imovel {
    private boolean possuiElevador;

    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, boolean possuiElevador) {
        super(municipio, areaM2, vagas);
        this.possuiElevador = possuiElevador;
    }

    public boolean getPossuiElevador() {
        return this.possuiElevador;
    }
    public void setPossuiElevador(boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

}
