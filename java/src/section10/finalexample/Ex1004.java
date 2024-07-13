package section10.finalexample;

class NormalMethod {
    void nomalMethod() {
        System.out.println("nomalMethod!");
    }
}

class ChildNormalMethod extends NormalMethod {
    @Override
    void nomalMethod() {
        System.out.println("ChildNormalMethod.nomalMethod!");
    }
}

class FinalMethod {
    final void finalMethod() {
        System.out.println("fianlMethod!");
    }
}

class ChildFinalMethod extends FinalMethod {
    @Override
    void finalMethod() {
        System.out.println("ChildFinalMethod.finalMethod!");
    }
}

public class Ex1004 {
    public static void main(String[] args) {
        ChildNormalMethod cnm = new ChildNormalMethod();
        cnm.nomalMethod();
    }
}
