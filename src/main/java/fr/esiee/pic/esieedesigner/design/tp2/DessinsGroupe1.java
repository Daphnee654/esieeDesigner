package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 1 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe1 extends CreateurDeForme {
	/**
	 * Pas de dessin horizontale
	 */
	private static final double UNITE_HORIZONTALE = 25;
	
	/**
	 * Pas de dessin verticale
	 */
	private static final double UNITE_VERTICALE = 25;

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerPiedsJambes();
		dessinerTorseBras();
		dessinerVisage();
		dessinerCheveux();
		
		Point origine = new Point(2 * UNITE_VERTICALE, 2 * UNITE_VERTICALE);
		Point origine2 = new Point(2 * UNITE_HORIZONTALE, 3 * UNITE_VERTICALE);
		Point origine3 = new Point(3 * UNITE_HORIZONTALE, 2 * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(origine)
		.ajouter(origine2)
		.ajouter(origine3);
	}
	
	/**
	 * 
	 */
	public void dessinerPiedsJambes() {
		
	}
	
	/**
	 * 
	 */
	public void dessinerTorseBras() {
		
	}
	
	/**
	 * 
	 */
	public void dessinerVisage() {
		
	}
	
	/**
	 * 
	 */
	public void dessinerCheveux() {
		
	}

}
