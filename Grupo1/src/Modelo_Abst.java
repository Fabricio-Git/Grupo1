public abstract class Modelo_Abst
{
    private int quantidade;
    private int id;
    private int potencia;
    private double tempo_dia;

    public void setId(int valor)
    {
        this.id = valor;
    }

    public void setPotencia(int valor)
    {
        this.potencia = valor;
    }

    public int getId()
    {
        return this.id;
    }

    public int getPotencia()
    {
        return this.potencia;
    }

    public double getConsumoMes()
    {
         return (((this.quantidade*this.tempo_dia)*30)*this.potencia)/1000 /*Em kWh*/;
    }

    public void setQuantidade(int valor)
    {
        this.quantidade= valor;
    }

    public int getQuantidade()
    {
        return this.quantidade;
    }
}