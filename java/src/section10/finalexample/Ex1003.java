package section10.finalexample;

class NormalClass {

}

class ChildNormalClass extends NormalClass {

}

class FinalClass {

}

class ChildFinalClass extends FinalClass {

}

public class Ex1003 {
    public static void main(String[] args) {
        ChildNormalClass cnc = new ChildNormalClass();
        System.out.println(cnc);
    }
}
