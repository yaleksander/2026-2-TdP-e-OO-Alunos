public class Contador
{
    private static long comparacoes;
    private static long substituicoes;
    private static long tempo;
    
    public static void reiniciar()
    {
        comparacoes = 0;
        substituicoes = 0;
        tempo = System.currentTimeMillis();
    }
    
    public static void addComp()
    {
        comparacoes++;
    }
    
    public static void addSub()
    {
        substituicoes++;
    }
    
    public static void imprime()
    {
        System.out.println("Nº de comparacoes: " + comparacoes);
        System.out.println("Nº de substituicoes: " + substituicoes);
        System.out.println("Tempo gasto: " + (System.currentTimeMillis() - tempo));
    }
}
