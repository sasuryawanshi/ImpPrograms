package ImpPrograms;

public class Overriding {

    public static void main(String[] args) {

        A a = new C();

        a.func();

        if (a instanceof B) {
            ((C) a).func2();
        }

    }
}
class A {

    public A() {
        System.out.println("A");
    }

    public void func() {
        System.out.println("A : Func");
    }


}

class B extends A {

    public B() {
        System.out.println("B");
    }

    @Override
    public void func() {
        System.out.println("B : Func");
    }

}

class C extends B {

    public C() {
        System.out.println("C");
    }
    @Override
    public void func() {
        System.out.println("C : Func");
    }

    public void func2() {
        System.out.println("Func 2");
    }
}