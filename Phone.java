package Interface;

interface Samsung {
    public void Mobile();

    public default void htc() {
        System.out.println("Htc is the also a good phone");
    }
}

public class Phone implements Samsung {
    public void Mobile() {
        System.out.println("Samsung is the good mobile");
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        p.Mobile();
        p.htc();
    }
}
