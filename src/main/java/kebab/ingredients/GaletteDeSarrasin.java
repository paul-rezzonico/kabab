package kebab.ingredients;

import kebab.Ingredient;
import kebab.visiteur.RegimeVisiteur;

public class GaletteDeSarrasin implements Ingredient {

	@Override
	public void accepter(RegimeVisiteur visiteur) {
		visiteur.visiteGaletteDeSarrasin(this);

	}

}
