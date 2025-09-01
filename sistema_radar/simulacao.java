package sistema_radar;

public class simulacao {
    public static void main(String[] args) {
        carro uno = new carro();
        uno.ano = 2006;
        uno.modelo = "fire";
        uno.placa = "DEZ1981";
        uno.velocidade = 0;

        radar radar = new radar();
        radar.localizacao = "Pistao Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(uno);

        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();

        radar.avaliarVelocidade(uno);
    }
}
