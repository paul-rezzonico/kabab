package kebab.visiteur;

import kebab.ingredients.Agneau;
import kebab.ingredients.Crevette;
import kebab.ingredients.Fromage;
import kebab.ingredients.GaletteDeSarrasin;
import kebab.ingredients.Oignon;
import kebab.ingredients.Pain;
import kebab.ingredients.Salade;
import kebab.ingredients.Sauce;
import kebab.ingredients.Thon;
import kebab.ingredients.Tomate;

public class VisiteurVegetarien implements RegimeVisiteur {
    
	private boolean vegetarien = true;
	
	@Override
	public void visiteAgneau(Agneau agneau) {
		this.vegetarien = false;

	}

	@Override
	public void visiteCrevette(Crevette crevette) {
		this.vegetarien = false;

	}

	@Override
	public void visiteFromage(Fromage fromage) {

	}

	@Override
	public void visiteOignon(Oignon oignon) {

	}

	@Override
	public void visitePain(Pain pain) {;

	}

	@Override
	public void visiteSalade(Salade salade) {;

	}

	@Override
	public void visiteSauce(Sauce sauce) {;

	}

	@Override
	public void visiteThon(Thon thon) {
		this.vegetarien = false;

	}

	@Override
	public void visiteTomate(Tomate tomate) {
		
	}

	@Override
	public boolean estRespecte() {
		return this.vegetarien;
	}

	@Override
	public void visiteGaletteDeSarrasin(GaletteDeSarrasin galette) {
		
	}

}
