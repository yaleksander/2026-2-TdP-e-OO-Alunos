import java.util.Random;

public class Main
{
    public static void main()
    {
        Random r = new Random();
        Lista l = new Lista(r.nextInt(100) * 0.1);
        for (int i = 0; i < 5; i++)
        {
            l.insereNoFim(new Lista(r.nextInt(100) * 0.1));
        }
        l.imprime();
    }
}