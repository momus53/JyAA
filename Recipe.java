import java.util.ArrayList;

public class Recipe {

    private String name;
    private ArrayList<ResourceGroup> ingredients;

    // Constructor
    public Recipe(String name, ArrayList<ResourceGroup> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    // Getters
    public String getName() {
        return name;
    }

    public ArrayList<ResourceGroup> getIngredients() {
        return new ArrayList<>(ingredients); // Return a copy to avoid modification of the original list
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
}