package kebab;

import java.util.ArrayList;
import java.util.List;

public class Kebabier {
	
	private List<Ingredient> ingredients = new ArrayList<>();

	public Kebabier avec(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		return this;
	}

	public Kebab preparerLeKebab() {
		return new Kebab(this.ingredients);
	}

}
