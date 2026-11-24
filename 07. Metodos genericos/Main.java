public class Main
{
    public static <T> void imprimeInfo(T obj)
    {
        System.out.println(obj + " -> " + obj.getClass().getName());
    }
    
    public static <T, U> void comparaTipo(T t, U u)
    {
        System.out.print("\"" + t + "\" e \"" + u + "\" ");
        if (t.getClass() != u.getClass())
            System.out.print("NAO ");
        System.out.println("sao do mesmo tipo.");
    }

    public static void exemploBasico()
    {
        imprimeInfo(1);
        imprimeInfo(1.0);
        imprimeInfo("1");
        comparaTipo(1, 1);
        comparaTipo(1, 1.0);
    }

    public static void exemploListaHeterogenea()
    {
        Lista lista = new Lista();
        lista.insere(new NoLista<Integer>(1));
        lista.insere(new NoLista<Double>(1.0));
        lista.insere(new NoLista<String>("1"));
        lista.imprime();
    }

    public static void exemploListaHomogenea()
    {
        Lista<Integer> lista = new Lista<>();
        lista.insere(new NoLista<Integer>(1));
        //lista.insere(new NoLista<Double>(1.0));
        //lista.insere(new NoLista<String>("1"));
        lista.imprime();
    }

    public static void exemploListaDeListas()
    {
        Lista<Lista<Integer>> lista = new Lista<>();
        for (int i = 0; i < 3; i++)
        {
            Lista<Integer> l = new Lista<>();
            NoLista<Lista<Integer>> n = new NoLista<>(l);
            lista.insere(n);
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                lista.get(i).insere(new NoLista<Integer>((int) Math.pow(10, i) * (j + 1)));
                
        // Impressao separada para cada elemento/Lista
        for (int i = 0; i < 3; i++)
            lista.get(i).imprime();
            
        // Impressao usando o metodo toString()
        lista.imprime();
    }
}