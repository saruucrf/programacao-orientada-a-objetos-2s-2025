package sistema_radar;

public class radar {
    private String localizacao;
    private Integer limiteVelocidade;

    public radar(String localizacao, Integer limiteVelocidade){
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade; 
    }

    public String getLocalizacao(){
        return this.localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
    public Integer getLimite(){
        return this.limiteVelocidade;
    }
    public void setLimite(Integer limiteVelocidade){
        this.limiteVelocidade = limiteVelocidade;
    } 
        

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("placa: "+placa);
        System.out.println("velocidade Observada: "+velocidadeObservada);
        System.out.println("localizacao: "+this.localizacao);
        System.out.println("velocidade da via: "+this.limiteVelocidade);
    }
    public void avaliarVelocidade(carro carro){
        if(carro.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
            System.out.println("ACIMA DA VELOCIDADE");
        }
    }
}
