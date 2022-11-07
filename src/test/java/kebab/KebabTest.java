package kebab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

import static kebab.Kebabier.unKebab;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KebabTest {
	
	private Kebab kebabAgneau;
	private Kebab kebabVegetarien;
	private Kebab kebabCrevette;
	private Kebab kebabThon;
	private Kebab GaletteKebab;
	
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();
	private static final Crevette CREVETTE = new Crevette();
	private static final Thon THON = new Thon();
	private static final Fromage FROMAGE = new Fromage();
	private static final GaletteDeSarrasin GALETTE = new GaletteDeSarrasin();
	
	@BeforeEach
	public void preparerLesKebabs() {
		this.kebabAgneau = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(AGNEAU)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		this.kebabVegetarien = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		this.kebabCrevette = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(CREVETTE)
				.avec(PAIN)
				.avec(SAUCE)
				.preparerLeKebab();
		
		this.kebabThon = unKebab()
				.avec(SALADE)
				.avec(TOMATE)
				.avec(OIGNON)
				.avec(THON)
				.avec(PAIN)
				.avec(SAUCE)
				.avec(FROMAGE)
				.preparerLeKebab();
		
		this.GaletteKebab = unKebab()
				.avec(SALADE)
				.avec(OIGNON)
				.avec(AGNEAU)
				.preparerLeKebab();
	}

	@Test 
	void contient_bien_tous_les_ingredients_ajoutes_pendants_la_preparation() {		
				
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, AGNEAU, PAIN, SAUCE);
		
		assertThat(kebabVegetarien.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, PAIN, SAUCE);
		
		assertThat(kebabCrevette.listerLesIngredients()).containsExactly(SALADE, TOMATE, CREVETTE, PAIN, SAUCE);
		
		assertThat(kebabThon.listerLesIngredients()).containsExactly(SALADE, TOMATE, OIGNON, THON, PAIN, SAUCE, FROMAGE);
		
	}
	
	@Test
	void kebab_agneau_n_est_pas_vegetarien() {
		
		assertFalse(kebabAgneau.estVegetarien());
	}
	
	@Test
	void kebab_vegetarien_est_vegetarien() {
		
		assertTrue(kebabVegetarien.estVegetarien());
	}
	
	@Test
	void kebab_crevette_n_est_pas_vegetarien() {
		
		assertFalse(kebabCrevette.estVegetarien());
	}
	
	@Test
	void kebab_thon_n_est_pas_vegetarien() {
		
		assertFalse(kebabThon.estVegetarien());
	}
	
	@Test
	void kebab_agneau_n_est_pas_pescetarien() {
		
		assertFalse(kebabAgneau.estPescetarien());
	}
	
	@Test
	void kebab_vegetarien_est_pescetarien() {
		
		assertTrue(kebabVegetarien.estPescetarien());
	}
	
	@Test
	void kebab_crevette_est_pas_pescatarien() {
		
		assertTrue(kebabCrevette.estPescetarien());
	}
	
	@Test
	void kebab_thon_est_pas_pescetarien() {
		
		assertTrue(kebabThon.estPescetarien());
	}

	
	
	@Test
	void kebab_thon_n_est_pas_sans_gluten() {
		
		assertFalse(kebabThon.estSansGluten());
	}
	
	@Test
	void kebab_crevette_n_est_pas_sans_gluten() {
		
		assertFalse(kebabCrevette.estSansGluten());
	}
	
	@Test
	void kebab_galette_est_sans_gluten() {
		
		assertTrue(GaletteKebab.estSansGluten());
	}
}
