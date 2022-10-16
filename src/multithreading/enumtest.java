package multithreading;

enum Season {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

    private int a;

    private Season(int a) {
        this.a = a;
    }

    public int getID() {
        return a;
    }

}

class enums {
    public static void main(String[] args) {

    }
}