package Enum;

enum Season{Summer,Rainy,Winter,Spring}
public class Assignment1 {
    public static void main(String[] args){
        for(Season s: Season.values()){
            System.out.println(s);
        }
    }
}
