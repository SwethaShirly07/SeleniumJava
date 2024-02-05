class Calculator
{
    public String calc(String n1, String n2)
    {
        String r = n1 + n2;
        return r;
    }
}

public class MainTerms {

    public static void main(String[] args)
    {
Calculator test = new Calculator();
        String result = test.calc("Helow ","World");
        System.out.println(result);
    }
}
