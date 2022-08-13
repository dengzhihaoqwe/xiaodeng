package dzh;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("*******`消费单`*******\n" +
                            "购买物品 \t\t 单价 \t\t 个数 \t 金额\n" +
                            "T恤 \t\t ￥245 \t\t 2 \t\t ￥490\n" +
                            "网球鞋 \t\t ￥570 \t\t 1 \t\t ￥570\n" +
                            "网球拍 \t\t ￥320 \t\t 1 \t\t ￥320");
        System.out.println(" ");
        System.out.println("折扣:\t\t  8折");

        int Txiu=245,wqx=570,wqp=320;
        double xfze = Txiu*2 + wqx+ wqp;
        int sjjf = 1500;
        double zq = sjjf-xfze*0.8;
        int jf = (int)((xfze*0.8)/100)*3;

        System.out.println("消费总金额: \t ￥"+xfze*0.8);
        System.out.println("实际交费:\t\t ￥"+sjjf);
        System.out.println("找钱:\t\t ￥"+zq);
        System.out.println("本次购物所获得的积分是:\t"+jf);
    }
}
