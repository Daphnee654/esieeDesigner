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
	
	/**
	 * Coordonnées X de l'origine
	 */
	private static final double ORIGINE_X = 2;
	
	/**
	 * Coordonnées Y de l'origine
	 */
	private static final double ORIGINE_Y = 2;

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessinerPiedsJambes();
		dessinerTorseBras();
		dessinerVisage();
		dessinerCheveux();
		
		Point origine = new Point(ORIGINE_X * UNITE_HORIZONTALE, ORIGINE_Y * UNITE_VERTICALE);
		Point origine2 = new Point(ORIGINE_X * UNITE_HORIZONTALE, (ORIGINE_Y + 1) * UNITE_VERTICALE);
		Point origine3 = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, ORIGINE_Y * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(origine)
		.ajouter(origine2)
		.ajouter(origine3);
	}
	
	/**
	 * 
	 */
	public void dessinerPiedsJambes() {

		
		Point mainGauchePointGauche = new Point(ORIGINE_X * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointCentre = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointBas = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 12) * UNITE_VERTICALE);
		Point mainGauchePointDroite = new Point((ORIGINE_X + 2) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointHaut = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 10) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(mainGauchePointGauche)
		.ajouter(mainGauchePointCentre)
		.ajouter(mainGauchePointBas)
		.ajouter(mainGauchePointDroite)
		.ajouter(mainGauchePointHaut);
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
