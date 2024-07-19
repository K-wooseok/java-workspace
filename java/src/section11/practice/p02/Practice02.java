package section11.practice.p02;

interface Printable {
    abstract void print(String document);
}

interface Scannable {
    abstract void scan(String document);
}

class MultiFuntionPrinter implements Printable, Scannable {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}

public class Practice02 {
    public static void main(String[] args) {
        MultiFuntionPrinter mfp = new MultiFuntionPrinter();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
    }
}
