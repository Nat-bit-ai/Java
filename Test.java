package main;

class A {

    static {
        System.out.print("A ");
    }

    {
        System.out.print("B ");
    }

    A() {
        System.out.print("C ");
    }
}

class Test extends A {

    static {
        System.out.print("D ");
    }

    {
        System.out.print("E ");
    }

    Test() {
        System.out.print("F ");
    }

    public static void main(String[] args) {

        new Test();
    }
}