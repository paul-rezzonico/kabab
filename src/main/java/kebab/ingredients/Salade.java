package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class Salade implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visiteSalade(this);
		
	}

}
