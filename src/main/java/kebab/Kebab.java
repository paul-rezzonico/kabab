package kebab;

import java.util.List;

import kebab.visiteur.VisiteurGluten;
import kebab.visiteur.VisiteurPescetarien;
import kebab.visiteur.VisiteurVegetarien;

public class Kebab {

	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}
	
	public boolean estVegetarien() {
		VisiteurVegetarien visiteur = new VisiteurVegetarien();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteur);
		}
		return visiteur.estRespecte();
	}
	
	public boolean estPescetarien() {
		VisiteurPescetarien visiteur = new VisiteurPescetarien();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteur);
		}
		return visiteur.estRespecte();
	}

	public boolean estSansGluten() {
		VisiteurGluten visiteur = new VisiteurGluten();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteur);
		}
		return visiteur.estRespecte();
	}
}
