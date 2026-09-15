import java.util.Random;
import java.util.ArrayList;

public class Lista
{
    private ArrayList<Integer> lista;
    
    public Lista()
    {
        this.lista = new ArrayList<Integer>();
    }
    
    public Lista(int n, int k)
    {
        this.lista = new ArrayList<Integer>();
        this.geraLista(n, k);
    }
    
    public int get(int i)
    {
        return this.lista.get(i);
    }
    
    public int set(int i, int valor)
    {
        return this.lista.set(i, valor);
    }
    
    public void add(int valor)
    {
        this.lista.add(valor);
    }
    
    public void geraLista(int n, int k)
    {
        Random r = new Random();
        this.lista.clear();
        for (int i = 0; i < n; i++)
            this.lista.add(r.nextInt(k));
        System.out.print("Lista:");
        this.imprime();
    }
    
    public void imprime()
    {
        for (int i = 0; i < this.lista.size(); i++)
            System.out.print(" " + this.lista.get(i));
        System.out.println();
    }
}
