package section11.practice.p01;

abstract class Printable {
    abstract void print(String document);
}

abstract class Scannable {
    abstract void print(String document);
}

class SamsungPrinter extends Printable {
    void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class SamsungScanner extends Scannable {
    void print(String document) {
        System.out.println("Scanning: " + document);
    }
}

public class Practice01 {
    public static void main(String[] args) {
        SamsungPrinter sp = new SamsungPrinter();
        SamsungScanner ss = new SamsungScanner();

        sp.print("Document1.pdf");
        ss.print("Document2.pdf");
    }
}
