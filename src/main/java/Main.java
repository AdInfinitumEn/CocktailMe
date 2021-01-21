import core.Cocktail;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Rum");
        ingredients.add("mint");
        ingredients.add("soda");
        ingredients.add("Brown Sugar");

        Cocktail c = new Cocktail("Mojito", ingredients);
        System.out.println(c.toString());
    }
}
