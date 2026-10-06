
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {

    private ArrayList<Recipes> recipeList = new ArrayList<>();
    private ArrayList<String> paragraph = new ArrayList<>();

    public ReadFile() {
    }

    public void readFile(String fileName) {

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (!row.isEmpty()) {
                    paragraph.add(row);
                } else {
                    addRowsToRecipeList(recipeList, paragraph);
                    paragraph.clear();
                }
            }
            if (!paragraph.isEmpty()) {
    addRowsToRecipeList(recipeList, paragraph);
    paragraph.clear();
}
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void addRowsToRecipeList(ArrayList<Recipes> recipeList, ArrayList<String> paragraph) {
        String name = paragraph.get(0);
        int cookingTime = Integer.valueOf(paragraph.get(1));
        ArrayList<String> ingredients = new ArrayList<String>();
        for (int i = 2; i < paragraph.size(); i++) {
            ingredients.add(paragraph.get(i));
        }
        Recipes recipe = new Recipes(name, cookingTime, ingredients);
        recipeList.add(recipe);
    }

    public ArrayList<Recipes> findRecipeByIngredient(String ingredient) {
        ArrayList<Recipes> thefoundRecipes = new ArrayList<Recipes>();
        for (Recipes recipe : recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                thefoundRecipes.add(recipe);
            }

        }
        return thefoundRecipes;
    }

    public ArrayList<Recipes> findRecipeByCookingTime(int time) {
        ArrayList<Recipes> thefoundRecipes = new ArrayList<Recipes>();

        for (Recipes recipe : recipeList) {
            if (recipe.getCookingTime() <= (time)) {
                thefoundRecipes.add(recipe);
            }

        }
        return thefoundRecipes;
    }

    public ArrayList<Recipes> findRecipeByName(String name) {
        ArrayList<Recipes> thefoundRecipes = new ArrayList<Recipes>();

        for (Recipes recipe : recipeList) {
           if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                thefoundRecipes.add(recipe);
            }
        }
        return thefoundRecipes;
    }

    @Override
    public String toString() {
        String text = "";
        for (Recipes recipe : recipeList) {
            text = text + recipe.getName() + ", cooking time: " + recipe.getCookingTime()+"\n";
        }
        return text;

    }

}
