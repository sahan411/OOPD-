package Template_Method;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourinCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Boilling Water");
    }

    private void pourinCup() {
        System.out.println("Dripping Coffee thru filter");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Adding Sugar and Milk");
    }
}
