package kebab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static kebab.Kebabier.unKebab;
import static org.assertj.core.api.Assertions.*;

class KebabTest {
	
	private Kebab kebabAgneau;
	private Kebab kebabVegetarien;
	private Kebab kebabCrevette;
	private Kebab kebabThon;
	
	private static final Sauce SAUCE = new Sauce();
	private static final Pain PAIN = new Pain();
	private static final Agneau AGNEAU = new Agneau();
	private static final Oignon OIGNON = new Oignon();
	private static final Tomate TOMATE = new Tomate();
	private static final Salade SALADE = new Salade();
	private static final Crevette CREVETTE = new Crevette();
	private static final Thon THON = new Thon();
	private static final Fromage FROMAGE = new Fromage();
	
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
				.avec(AGNEAU)
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
	}

	@Test 
	void contient_bien_tous_les_ingredients_ajoutes_pendants_la_preparation() {		
				
		assertThat(kebabAgneau.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, AGNEAU, PAIN, SAUCE);
		
		assertThat(kebabVegetarien.listerLesIngredients()).containsExactly(
				SALADE, TOMATE, OIGNON, AGNEAU, PAIN, SAUCE);
		
		assertThat(kebabCrevette.listerLesIngredients()).containsExactly(SALADE, TOMATE, CREVETTE, PAIN, SAUCE);
		
		assertThat(kebabThon.listerLesIngredients()).containsExactly(SALADE, TOMATE, OIGNON, THON, PAIN, SAUCE, FROMAGE);
		
	}
}
