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

    public static void exemploComLista()
    {
        ListaHeterogenea lista = new ListaHeterogenea();
        lista.insere(new NoLista<Integer>(1));
        lista.insere(new NoLista<Double>(1.0));
        lista.insere(new NoLista<String>("1"));
        lista.imprime();
    }
}
