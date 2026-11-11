public class Cidade
{
    private String nome;
    private int habitantes;
    private double idh;
    
    public Cidade(String nome, int habitantes, double idh)
    {
        this.nome = nome;
        this.habitantes = habitantes;
        this.idh = idh;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int getHabitantes()
    {
        return this.habitantes;
    }
    
    public double getIDH()
    {
        return this.idh;
    }
}
