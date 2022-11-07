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

public interface RegimeVisiteur {

	void visiteAgneau(Agneau agneau);
	void visiteCrevette(Crevette crevette);
	void visiteFromage(Fromage fromage);
	void visiteOignon(Oignon oignon);
	void visitePain(Pain pain);
	void visiteSalade(Salade salade);
	void visiteSauce(Sauce sauce);
	void visiteThon(Thon thon);
	void visiteTomate(Tomate tomate);
	void visiteGaletteDeSarrasin(GaletteDeSarrasin galette);
	boolean estRespecte();
	
}
