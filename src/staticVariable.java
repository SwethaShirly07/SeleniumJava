class Checking


{
    int a;
    int b;
    static int c;
    public void show()
    {
        System.out.println(a + ":" + b + ":" + c);
    }
}
public class staticVariable {

    public static void main(String[] args)
    {
        Checking c = new Checking();
        c.a = 7;
        c.b = 8;
        Checking.c = 9030;
        c.show();
    }
}
