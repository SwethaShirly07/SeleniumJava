class Deshna
{
    private int age;
    private String name;

    public int setAge(int a)
{
    age = a;
    return age;

}

public  String getName()
{
    return name;
}
}
public class Encapsulation {

    public static void main(String[] args)
    {
        Deshna g = new Deshna();

        System.out.println(g.setAge(4)); // setting the value here
        System.out.println(g.getName("Navin"));
    }
}
