//package AbstractClass;
//
//
//public class Publication {
//    String title;
//    float price;
//    void getdata(String title, float price){
//        this.title=title;
//        this.price=price;
//    }
//    void putdata(){
//        System.out.println("Title="+title+"\n"+"Price="+price);
//    }
//}
//
//class Book extends Publication{
//    int page_count;
//
//    void getdata(int page_count) {
//        super.getdata(title, price);
//        this.page_count=page_count;
//    }
//
//    @Override
//    void putdata() {
//        super.putdata();
//        System.out.println("Page Count="+page_count);
//    }
//}
//
//class Tape extends Publication{
//    float minutes;
//    void getdata(float minutes){
//        this.minutes=minutes;
//    }
//
//    @Override
//    void putdata() {
//        super.putdata();
//        System.out.println("Playing time"+minutes);
//    }
//}
//
//class qsn6 {
//    public static void main(String[] args){
//       Publication obj1 = new Publication();
//       Publication obj2 = new Book();
//       Publication obj3 = new Tape();
//       obj1.getdata("SummerLove",650.55);
//       obj2.getdata(500);
//       obj3.getdata();
//       obj1.putdata();
//       obj2.putdata();
//       obj3.putdata();
//    }
//}
//
