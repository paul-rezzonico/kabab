package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class Fromage implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visiteFromage(this);
		
	}

}
