package Structural.Decorator;

public class Demo {
    public static void main(String[] args) {
        // Basic Plan is 10 ,Pro 20 and Vip 30
        BasicPlan basicPlan = new BasicPlan();
        System.out.println(basicPlan.getPrice());

        ProPlan proPlan = new ProPlan(basicPlan);
        System.out.println(proPlan.getPrice());

        VipPlan vipPlan = new VipPlan(proPlan);
        System.out.println(vipPlan.getPrice());
    }
}
