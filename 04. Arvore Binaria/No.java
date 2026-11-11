import java.util.ArrayList;

public class No
{
    private int valor;
    private No esq;
    private No dir;
    
    public No(int valor)
    {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
    }
    
    public int altura()
    {
        return 0;
    }
    
    public void imprime(int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print("--");
        System.out.println(this.valor);
        if (this.esq != null)
            this.esq.imprime(n + 1);
        if (this.dir != null)
            this.dir.imprime(n + 1);
    }
    
    public void insere(No novoNo)
    {
        ArrayList<No> arr = new ArrayList<No>();
        arr.add(this);
        while (!arr.isEmpty())
        {
            int n = arr.size();
            boolean flag = false;
            for (int i = 0; i < n; i++)
            {
                if (arr.get(i).esq == null)
                {
                    arr.get(i).esq = novoNo;
                    flag = true;
                    break;
                }
                if (arr.get(i).dir == null)
                {
                    arr.get(i).dir = novoNo;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
            for (int i = 0; i < n; i++)
            {
                arr.add(arr.get(i).esq);
                arr.add(arr.get(i).dir);
            }
            for (int i = 0; i < n; i++)
                arr.remove(0);
        }
    }
}
