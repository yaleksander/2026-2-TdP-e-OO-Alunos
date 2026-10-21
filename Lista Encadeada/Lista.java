import java.util.Random;

public class Lista
{
    private NoLista raiz;
    
    public Lista()
    {
        this.raiz = null;
    }
    
    public int tamanho()
    {
        if (this.raiz == null)
            return 0;
        return this.raiz.tamanho();
    }
    
    public void imprime()
    {
        System.out.print("[");
        if (this.raiz != null)
            this.raiz.imprime(10);
        System.out.println("]");
    }

    public NoLista remove(int indice)
    {
        if (this.raiz == null)
            return null;
        if (indice > 0)
            return this.raiz.remove(indice);
        NoLista r = this.raiz;
        this.raiz = this.raiz.getProx();
        r.setProx(null);
        return r;
    }
    
    public void insere(NoLista l)
    {
        if (this.raiz == null)
            this.raiz = l;
        else
            this.raiz.insere(l);
    }
    
    public void criaSequencia(int tam)
    {
        this.raiz = null;
        for (int i = 1; i <= tam; i++)
            this.insere(new NoLista(i));
    }
    
    public void embaralha()
    {
        int n = this.tamanho();
        Random r = new Random();
        NoLista l = this.remove(r.nextInt(n--));
        while (n > 0)
            l.insere(this.remove(r.nextInt(n--)));
        this.raiz = l;
    }
    
    public void bubbleSort()
    {
        if (this.raiz != null)
        {
            System.out.println("BUBBLE SORT");
            this.imprime();
            this.raiz.bubbleSort();
            this.imprime();
            Contador.imprime();
            System.out.println();
        }
    }
    
    public void selectionSort()
    {
        if (this.raiz != null)
        {
            System.out.println("SELECTION SORT");
            this.imprime();
            this.raiz.selectionSort();
            this.imprime();
            Contador.imprime();
            System.out.println();
        }
    }
    
    public void quickSort()
    {
        if (this.raiz != null)
        {
            System.out.println("QUICK SORT");
            this.imprime();
            this.raiz.quickSort();
            this.imprime();
            Contador.imprime();
            System.out.println();
        }
    }
}
