package multithreading;

class EnumDemo {
    enum Flavour {
        VANILLA, CHOCOLATE, COFFEE, ROCKYROAD
    };

    public static void main(String args[]) {
        Flavour a[] = Flavour.values();
        for (Flavour flavour : a) {
            System.out.println(flavour);
        }
    }
}