
public class Test implements D,S{


    public static void main(String[] args) {
        Test t=new Test();
        t.methodOne();

        D.methodOneStatic();
        S.methodOneStatic();
    }

    @Override
    public void methodOne() {
        D.super.methodOne();
    }

    @Override
    public void methodthree() {

    }
}

interface  S
{
    void methodthree();
    default void   methodOne(){
        System.out.println("methodOne : S");
    }

    static void methodOneStatic(){
        System.out.println("methodOne static: S");
    }

}
interface  D 
{
    default void  methodOne(){
        System.out.println("methodOne : D");
    }

    static void  methodOneStatic(){
        System.out.println("methodOne static: D");
    }
    void methodthree();
}