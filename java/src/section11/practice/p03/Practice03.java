package section11.practice.p03;

interface Printable {
    abstract void print(String document);
}

interface Scannable {
    abstract void scan(String document);
}

interface MultiFuntionDevice extends Printable, Scannable {
    abstract void fax(String document);
}

class MultiFuntionPrinter implements MultiFuntionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }
}

public class Practice03 {
    public static void main(String[] args) {
        MultiFuntionPrinter mfp = new MultiFuntionPrinter();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
        mfp.fax("Document3.pdf");
    }
}
