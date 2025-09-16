package Sistema_Computacional;

public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa edge) {
        if (edge.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: espaço insuficiente no SSD para instalar o programa.");
            return false;
        }

        if (edge.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: memória RAM insuficiente para executar o programa.");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /
                (computador.getOperacoesPorSegundo() * computador.getNucleos());

        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo estimado de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}
