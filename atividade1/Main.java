package atividade1;

public class Main {

    public static void main(String[] args) {

        Computador maquina = new Computador(16, 500, 4, 2.5f);

        SistemaOperacional windows = new SistemaOperacional(maquina);

        Programa p1 = new Programa(12, 300, 2, 30000); 
        Programa p2 = new Programa(8, 600, 2, 6000);    
        Programa p3 = new Programa(32, 800, 4, 10000);  

        
        System.out.println("Tentando executar Programa 1:");
        windows.executarPrograma(p1);

        System.out.println("\nTentando executar Programa 2:");
        windows.executarPrograma(p2);

        System.out.println("\nTentando executar Programa 3:");
        windows.executarPrograma(p3);
    }
}

    

