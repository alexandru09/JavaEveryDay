package creationalPatterns.builder.hierarchyBuilder;

import creationalPatterns.builder.hierarchyBuilder.NyPizza.Size;
import creationalPatterns.builder.hierarchyBuilder.Pizza.Topping;

public class MainHierarchyBuilderApp {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
            .addTopping(Topping.SAUSAGE)
            .addTopping(Topping.ONION)
            .build(); 
        Calzone calzone = new Calzone.Builder()
            .addTopping(Topping.HAM)
            .sauceInside()
            .build();
    }
}
