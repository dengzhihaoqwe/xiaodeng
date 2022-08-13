package dzh;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        System.out.println("请输入华氏度:");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c=5/9.0*(f-32);
        System.out.println("华氏度:"+f+"°F");
        System.out.println("摄氏度:"+c+"℃");
    }
}
