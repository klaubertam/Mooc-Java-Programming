import java.util.ArrayList;
public class Recipes {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipes(String name, int cookingTime, ArrayList<String> ingredients) {
        this.cookingTime = cookingTime;
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    @Override
    public String toString() {

        return this.getName() + ", cooking time: " + this.getCookingTime();

    }

}
