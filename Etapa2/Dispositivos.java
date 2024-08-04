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
}
