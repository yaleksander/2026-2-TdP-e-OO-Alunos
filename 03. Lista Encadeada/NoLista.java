public class NoLista
{
    private int valor;
    private NoLista prox;

    public NoLista(int valor)
    {
        this.valor = valor;
        this.prox = null;
    }

    private NoLista get(int indice)
    {
        NoLista p = this;
        for (int i = 0; i < indice && p != null; i++)
            p = p.prox;
        return p;
    }
    
    private void swap(NoLista l)
    {
        int aux = this.valor;
        this.valor = l.valor;
        l.valor = aux;
    }
    
    public NoLista getProx()
    {
        return this.prox;
    }

    public void setProx(NoLista p)
    {
        this.prox = p;
    }

    public int tamanho()
    {
        int n = 0;
        for (NoLista p = this; p != null; p = p.prox)
            n++;
        return n;
    }
    
    public void imprime(int limite)
    {
        NoLista p = this;
        System.out.print(p.valor);
        for (p = p.prox; p != null && --limite > 0; p = p.prox)
            System.out.print(", " + p.valor);
    }

    public void insere(NoLista l)
    {
        NoLista p = this;
        while (p.prox != null)
            p = p.prox;
        p.prox = l;
    }
    
    public NoLista remove(int indice)
    {
        NoLista p = this.get(indice - 1);
        if (p != null && p.prox != null)
        {
            NoLista r = p.prox;
            p.prox = r.prox;
            r.prox = null;
            return r;
        }
        return null;
    }
    
    public void bubbleSort()
    {
        Contador.reiniciar();
        boolean trocou = true;
        while (trocou)
        {
            trocou = false;
            for (NoLista p = this; p != null; p = p.prox)
            {
                Contador.addComp();
                if (p.prox != null && p.valor > p.prox.valor)
                {
                    Contador.addSub();
                    trocou = true;
                    p.swap(p.prox);
                }
            }
        }
    }
    
    public void selectionSort()
    {
        Contador.reiniciar();
        for (int i = 0; i < this.tamanho(); i++)
        {
            NoLista menor = this.get(i);
            for (NoLista p = menor.prox; p != null; p = p.prox)
            {
                Contador.addComp();
                if (p.valor < menor.valor)
                    menor = p;
            }
            if (menor != this.get(i))
            {
                Contador.addSub();
                menor.swap(this.get(i));
            }
        }
    }

    public void quickSort()
    {
        Contador.reiniciar();
        quickSort(0, this.tamanho() - 1);
    }
    
    private int particiona(int inicio, int fim)
    {
        int novoPivo = inicio;
        NoLista pivo = this.get(fim);
        NoLista i = this.get(inicio);
        for (NoLista j = i; inicio++ < fim; j = j.prox)
        {
            Contador.addComp();
            if (j.valor < pivo.valor)
            {
                Contador.addSub();
                novoPivo++;
                i.swap(j);
                i = i.prox;
            }
        }
        Contador.addSub();
        i.swap(pivo);
        return novoPivo;
    }
    
    private void quickSort(int inicio, int fim)
    {
        if (inicio < fim)
        {
            int p = particiona(inicio, fim);
            quickSort(inicio, p - 1);
            quickSort(p + 1, fim);
        }
    }
}
