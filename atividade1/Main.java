package atividade1;

public class Main {

    public static void main(String[] args) {

        Computador maquina = new Computador(16, 500, 4, 2.5f);

        SistemaOperacional windows = new SistemaOperacional(maquina);

        Programa p1 = new Programa(8, 100, 2, 10000); 
        Programa p2 = new Programa(4, 600, 2, 5000);    
        Programa p3 = new Programa(32, 200, 4, 20000);  

        
        System.out.println("Tentando executar Programa 1:");
        windows.executarPrograma(p1);

        System.out.println("\nTentando executar Programa 2:");
        windows.executarPrograma(p2);

        System.out.println("\nTentando executar Programa 3:");
        windows.executarPrograma(p3);
    }
}

    

