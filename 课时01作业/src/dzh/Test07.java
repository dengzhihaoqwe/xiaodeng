package dzh;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入你要存入的本金数目:");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double bx1 = i+i*1*0.0225;//存一年的本息
        double bx2 = i+i*2*0.027;//存两年的本息
        double bx3 = i+i*3*0.0324;//存三年的本息
        double bx5 = i+i*5*0.036;//存五年的本息
        System.out.println("存一年的本息="+bx1);
        System.out.println("存两年的本息="+bx2);
        System.out.println("存三年的本息="+bx3);
        System.out.println("存五年的本息="+bx5);

    }
}
