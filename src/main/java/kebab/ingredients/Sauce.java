package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class Sauce implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visiteSauce(this);
		
	}

}
