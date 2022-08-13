package dzh;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入折扣:");
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        int Txiu=245,wqx=570,wqp=320;

        boolean bool1  = Txiu*i<100;
        System.out.println("T恤折扣价低于100吗？"+bool1);
        boolean bool2  = wqx*i<100;
        System.out.println("网球鞋折扣价低于100吗？"+bool2);
        boolean bool3  = wqp*i<100;
        System.out.println("网球拍折扣价低于100吗？"+bool3);
    }
}
