package dzh;

public class Test05 {
    public static void main(String[] args) {
        int a=10 , b  , c=8 ;
        //将a赋值存于b中
        b=a;
        //将c的值赋值于a
        a=c;
        //将b中赋予的a值赋予给c
        c=b;
        System.out.println("a="+a+"\nc="+c);
    }
}
