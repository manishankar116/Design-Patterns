//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FriedRice VegFriedRice = new FriedRice.Builder()
                .withRice()
                .withVegetables()
                .build();

        FriedRice EggFriedRice = new FriedRice.Builder()
                .withRice()
                .withVegetables()
                .withEggs()
                .build();

        FriedRice ChickenFriedRice = new FriedRice.Builder()
                .withRice()
                .withVegetables()
                .withChicken()
                .build();

        System.out.println("Preparing Fried rice with ingredients: " + ChickenFriedRice);
    }
}