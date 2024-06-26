public class Custos {
    
    private static final double CUSTO_INSTALACAO_LAMPADA = 50.0;
    private static final double CUSTO_INSTALACAO_AR_CONDICIONADO = 200.0;
    private static final double CUSTO_INSTALACAO_CORTINA_AUTOMATICA = 100.0;
    private static final double CUSTO_INSTALACAO_TV = 150.0;

    // Custos de manutenção anual por dispositivo (em reais)
    private static final double CUSTO_MANUTENCAO_LAMPADA = 20.0;
    private static final double CUSTO_MANUTENCAO_AR_CONDICIONADO = 100.0;
    private static final double CUSTO_MANUTENCAO_CORTINA_AUTOMATICA = 50.0;
    private static final double CUSTO_MANUTENCAO_TV = 60.0;

    int qtdLampadas = 0;
    int qtdArCondicionados = 0;
    int qtdCortinasAutomaticas = 0;
    int qtdTVs = 0;

    public double calcularCustoInst(int qtdLampadas, int qtdArCondicionados, int qtdCortinasAutomaticas, int qtdTVs) 
    {

        return (qtdLampadas * CUSTO_INSTALACAO_LAMPADA)
        + (qtdArCondicionados * CUSTO_INSTALACAO_AR_CONDICIONADO)
        + (qtdCortinasAutomaticas * CUSTO_INSTALACAO_CORTINA_AUTOMATICA)
        + (qtdTVs * CUSTO_INSTALACAO_TV);

    }

    public double calcularCustoManu(int qtdLampadas, int qtdArCondicionados, int qtdCortinasAutomaticas, int qtdTVs) 
    {

        return (qtdLampadas * CUSTO_MANUTENCAO_LAMPADA)
        + (qtdArCondicionados * CUSTO_MANUTENCAO_AR_CONDICIONADO)
        + (qtdCortinasAutomaticas * CUSTO_MANUTENCAO_CORTINA_AUTOMATICA)
        + (qtdTVs * CUSTO_MANUTENCAO_TV);

    }

}
