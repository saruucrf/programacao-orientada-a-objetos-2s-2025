package sistema_iptu;

public class SecretariaFazenda {
    public static void main(String[] args) {
        Municipio brasilia = new Municipio("brasilia","DF", 29.50);

        Chacara chacara = new Chacara(brasilia, 3000.0, 6, false);

        Apartamento apto = new Apartamento(brasilia, 58.0, 1, true);

        System.out.println("Chacara IPTU $: " + chacara.calcularIPTU());
        System.out.println("Apto IPTU $: " + apto.calcularIPTU());
    }
    
}
