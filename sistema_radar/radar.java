package sistema_radar;

public class radar {

    public String localizacao;
    public Integer limiteVelocidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("placa "+placa);
        System.out.println("velocidade Observada "+velocidadeObservada);
        System.out.println("localizacao "+this.localizacao);
        System.out.println("velocidade da via "+this.limiteVelocidade);
    }
    public void avaliarVelocidade(carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }
}
