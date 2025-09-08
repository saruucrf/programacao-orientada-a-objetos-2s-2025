package sistema_radar;

public class simulacao {
    public static void main(String[] args) {
        carro uno = new carro("DEZ1981", 0, 2006, "fire");

        radar radar = new radar("Pistao Sul", 60);

        radar.avaliarVelocidade(uno);

        uno.acelerar(); // 10
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar(); // 90
        uno.frear(); // -10 = 80
        uno.setVelocidade(70 );

        radar.avaliarVelocidade(uno);
    }
}
