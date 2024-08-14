package Template_Method;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourinCup();
        addCondiments();
    }

    public void pourinCup() {
        System.out.println("Pour into cup");
    }

    public void boilWater() {
        System.out.println("Boilling water");
    }

    abstract void brew();
    abstract void addCondiments();
}

