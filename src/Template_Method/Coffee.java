package Template_Method;

public class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("Dripping Coffee thru the filters");
    }
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
