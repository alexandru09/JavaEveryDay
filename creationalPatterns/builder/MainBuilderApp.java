package creationalPatterns.builder;

public class MainBuilderApp {
    public static void main(String[] args) {
        NutritionFacts burger = new NutritionFacts.Builder(100, 1)
            .fat(15)
            .calories(350)
            .build();

        System.out.println("Burger has " + burger.getCalories() + 
            " kcals per serving of " + burger.getServingSize() + " grams.");
    }
}
