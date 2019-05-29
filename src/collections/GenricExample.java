package collections;

public class GenricExample {
    public <T> void prints(T a, T b)
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {

        GenricExample E= new GenricExample();
        E.prints(5,6);
        E.prints("Aswathy","Saran");
        E.prints("Saya", 1);

    }
}
