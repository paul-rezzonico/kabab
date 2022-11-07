package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class Pain implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visitePain(this);
		
	}

}
