package ExceptionHandling;

import java.rmi.RemoteException;

class Nullpointer{
    int[] a=null;
    void disp(){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
class ArrayIndexOutOfBound{
    int[] b = new int[4];
    void index(){
        b[4]=6;
        System.out.println(b);
    }
}
public class MultipleCatch {
    public static void main(String[] args) throws RemoteException {
        Nullpointer obj1 = new Nullpointer();
        ArrayIndexOutOfBound obj2 = new ArrayIndexOutOfBound();
        try{
            obj1.disp();
            obj2.index();
        } catch (java.lang.NullPointerException e){
            System.out.println(e);
            throw e;
        }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex);
            }

//        try{
//            obj2.index();
//        }
////        catch (Exception ex) {
////            System.out.println(ex.toString());
////        }
//            finally {
//            System.out.println("Multiple Exception");
//        }
    }
}
