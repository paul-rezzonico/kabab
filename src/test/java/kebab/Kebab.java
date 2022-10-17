package kebab;

import java.util.List;
import java.util.Objects;

public class Kebab {

	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}

}
