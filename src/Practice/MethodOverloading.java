package Practice;
class Method {
    int a = 2, b = 5;

    int add() {
        return a + b;
    }

        double add(double a,double b){
        return a+b;
    }
    void add(int a, int b) {
        System.out.println(a + b);
    }

    //    void add(){
//        System.out.println(a+b);
//    }
}

    public class MethodOverloading {
        public static void main(String[] args) {
            Method obj = new Method();
            System.out.println(obj.add());
            obj.add(3, 4);
            obj.add(3.4,4.4);
            System.out.println(obj.add());
        }
}
