package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class Crevette implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visiteCrevette(this);
		
	}

}
