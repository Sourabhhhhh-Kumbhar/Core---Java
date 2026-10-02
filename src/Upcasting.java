class Bank {

    void interestRate() {
        System.out.println("Bank gives interest");
    }
}

class HDFCBank extends Bank {

    void hdfcOffer() {
        System.out.println("HDFC special offer");
    }
}

public class Upcasting {

    public static void main(String[] args) {

        Bank b = new HDFCBank(); // Upcasting

        b.interestRate();

        // b.hdfcOffer(); ❌ Not allowed
    }
}