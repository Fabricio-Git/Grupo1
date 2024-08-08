public class Dispositivos {
    private String tableAparelhos;
    private int tableUnidades;
    private float tablePreço;
    private float tableEconomia;

    public Dispositivos(String aparelhos, Integer unidades, float preço, float economia) {
        this.tableAparelhos = aparelhos;
        this.tableUnidades = unidades;
        this.tablePreço = preço;
        this.tableEconomia = economia;
    }

    public String getTableAparelhos() {
        return tableAparelhos;
    }

    public int getTableUnidades() {
        return tableUnidades;
    }

    public float getTablePreço() {
        return tablePreço;
    }

    public float getTableEconomia() {
        return tableEconomia;
    }

    public void calcular(String tipo, float precoBase) {
        switch (tipo) {
            case "V":
                this.tablePreço = tableUnidades * precoBase;
                this.tableEconomia = calcularEconomia(precoBase);
                break;
            case "G":
                this.tablePreço = tableUnidades * precoBase * 1.1f; // Exemplo de cálculo com garantia
                this.tableEconomia = calcularEconomia(precoBase * 1.1f);
                break;
            default:
                break;
        }
    }

    private float calcularEconomia(float preco) {
        // Suponha que a economia seja uma porcentagem do preço
        return preco * 0.05f; // 5% de economia como exemplo
    }
}
