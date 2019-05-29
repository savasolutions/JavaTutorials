package collections;

public class GenericExampl2<T> {
    T d;
    public void prints(T a, T b)
    {
        d=a;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {

        GenricExample E= new GenricExample();
        E.prints(5,6);
        E.prints("Aswathy","Saran");
        E.prints("Saya", 1);

    }
}
