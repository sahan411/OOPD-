package Template_Method;

public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourinCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("Boilling water");
    }

    private void pourinCup() {
        System.out.println("Steeping the Tea");
    }

    private void steepTeaBag() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Adding Lemon");
    }
}
