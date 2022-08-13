package dzh;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int  a = i%10, //个位
             b = i/10%10,//十位
             c = i/100%10, //百位
             d = i/1000;//千位
        int sum = a+b+c+d;
        System.out.println("会员卡号"+i+"各位之和:"+sum);
        boolean bool = sum>20;
        System.out.println("是幸运客户吗？"+bool);
    }
}
