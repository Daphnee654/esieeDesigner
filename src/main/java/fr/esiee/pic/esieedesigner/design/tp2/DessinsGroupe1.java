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

		Point PiedGauche1 = new Point(5 * UNITE_VERTICALE, 16 * UNITE_VERTICALE);
		Point PiedGauche2 = new Point(6 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point PiedGauche3 = new Point(7 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point PiedGauche4 = new Point(7 * UNITE_VERTICALE, 16 * UNITE_VERTICALE);
		
		Point PiedDroit1 = new Point(7 * UNITE_VERTICALE, 16 * UNITE_VERTICALE);
		Point PiedDroit2 = new Point(7 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point PiedDroit3 = new Point(8 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point PiedDroit4 = new Point(9 * UNITE_VERTICALE, 16 * UNITE_VERTICALE);
		
		Point Jupe1 = new Point(3 * UNITE_VERTICALE, 13 * UNITE_VERTICALE);
		Point Jupe2 = new Point(2 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point Jupe3 = new Point(12 * UNITE_VERTICALE, 15 * UNITE_VERTICALE);
		Point Jupe4 = new Point(11 * UNITE_VERTICALE, 13 * UNITE_VERTICALE);
		
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(PiedGauche1)
		.ajouter(PiedGauche2)
		.ajouter(PiedGauche3)
		.ajouter(PiedGauche4)
		.ajouter(PiedDroit1)
		.ajouter(PiedDroit2)
		.ajouter(PiedDroit3)
		.ajouter(PiedDroit4);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(Jupe1)
		.ajouter(Jupe2)
		.ajouter(Jupe3)
		.ajouter(Jupe4);
	}
	
	/**
	 * 
	 */
	public void dessinerTorseBras() {
		Point mainGauchePointGauche = new Point(ORIGINE_X * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointCentre = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointBas = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 12) * UNITE_VERTICALE);
		Point mainGauchePointDroite = new Point((ORIGINE_X + 2) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainGauchePointHaut = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 10) * UNITE_VERTICALE);
		
		Point epauleGaucheGauche = new Point((ORIGINE_X + 3) * UNITE_HORIZONTALE, (ORIGINE_Y + 8) * UNITE_VERTICALE);
		Point epauleGaucheDroit = new Point((ORIGINE_X + 4) * UNITE_HORIZONTALE, (ORIGINE_Y + 8) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(epauleGaucheGauche)
		.ajouter(epauleGaucheDroit);
		
		Point epauleDroitGauche = new Point((ORIGINE_X + 10) * UNITE_HORIZONTALE, (ORIGINE_Y + 8) * UNITE_VERTICALE);
		Point epauleDroitDroit = new Point((ORIGINE_X + 11) * UNITE_HORIZONTALE, (ORIGINE_Y + 8) * UNITE_VERTICALE);
		

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(epauleDroitGauche)
		.ajouter(epauleDroitDroit);
		
		
		

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(mainGauchePointHaut)
		.ajouter(epauleGaucheGauche);
		
		
		Point mainDroitePointGauche = new Point(ORIGINE_X * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainDroitePointCentre = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainDroitePointBas = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 12) * UNITE_VERTICALE);
		Point mainDroitePointDroite = new Point((ORIGINE_X + 2) * UNITE_HORIZONTALE, (ORIGINE_Y + 11) * UNITE_VERTICALE);
		Point mainDroitePointHaut = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 10) * UNITE_VERTICALE);
		
		
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(mainDroitePointGauche)
		.ajouter(mainDroitePointCentre)
		.ajouter(mainDroitePointBas)
		.ajouter(mainDroitePointDroite)
		.ajouter(mainDroitePointHaut);
		
		
	
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
		Point craneBasGauche = new Point((ORIGINE_X + 1) * UNITE_HORIZONTALE, (ORIGINE_Y + 3) * UNITE_VERTICALE);
		Point craneMilieuGauche = new Point((ORIGINE_X + 3) * UNITE_HORIZONTALE, (ORIGINE_Y + 1) * UNITE_VERTICALE);
		Point craneHautGauche = new Point((ORIGINE_X + 5) * UNITE_HORIZONTALE, ORIGINE_Y * UNITE_VERTICALE);
		Point craneHautDroite = new Point((ORIGINE_X + 9) * UNITE_HORIZONTALE, ORIGINE_Y * UNITE_VERTICALE);
		Point craneMilieuDroite = new Point((ORIGINE_X + 11) * UNITE_HORIZONTALE, (ORIGINE_Y + 1) * UNITE_VERTICALE);
		Point craneBasDroite = new Point((ORIGINE_X + 13) * UNITE_HORIZONTALE, (ORIGINE_Y + 3) * UNITE_VERTICALE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(craneBasGauche)
		.ajouter(craneMilieuGauche)
		.ajouter(craneHautGauche)
		.ajouter(craneHautDroite)
		.ajouter(craneMilieuDroite)
		.ajouter(craneBasDroite);
	}

}
