package kebab;

import java.util.List;

public class Kebab {

	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}

}
