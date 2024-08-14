package Template_Method;



public class main {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.boilWater();
        myTea.brew();
        myTea.pourinCup();
        myTea.addCondiments();

        Coffee myCoffee = new Coffee();
        myCoffee.boilWater();
        myCoffee.brew();
        myCoffee.pourinCup();
        myCoffee.addCondiments();
    }
}