package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 3 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */


public class DessinsGroupe3 extends CreateurDeForme {
	
	private static final int PIXEL = 25;
	
	private static final int LONGUEUR_PAGE = 77 * PIXEL;
	
	private static final int LARGEUR_PAGE = 41 * PIXEL;
	
	private static final int LARGEUR_PERSO = 14 * PIXEL;
	
	private static final int LONGUEUR_PERSO = 14 * PIXEL;

	private static final int BASE_HAUT = LARGEUR_PAGE/2-LARGEUR_PERSO/2;
	
	private static final int BASE_BAS = LARGEUR_PAGE/2 + LARGEUR_PERSO/2;
	
	private static final int BASE_DROITE = LONGUEUR_PAGE/2 + LONGUEUR_PERSO/2;
	
	private static final int BASE_GAUCHE = LONGUEUR_PAGE/2 - LONGUEUR_PERSO/2;

	
	private static final Point BASE_NEZ_HAUT = new Point(950, 750);


	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		
			
		Point hautGauche = new Point(BASE_GAUCHE, BASE_HAUT);
		Point hautDroit = new Point(BASE_DROITE, BASE_HAUT);
		Point basGauche = new Point(BASE_GAUCHE, BASE_BAS);
		Point basDroite = new Point(BASE_DROITE, BASE_BAS);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauche)
		.ajouter(hautDroit)
		.ajouter(basDroite)
		.ajouter(basGauche);

	
	}
	
	/**
	 * Methode pour dessiner le corp et les doides
	 */
	public void dessinerCorp() {
		Point p1 = new Point(1,4);/*
		Point p2 = new Point(1,4);
		Point p3 = new Point();
		Point p4 = new Point();
		Point p5 = new Point();
		Point p6 = new Point();
		Point p7 = new Point();
		Point p8 = new Point();
		Point p9 = new Point();
		Point p10 = new Point();
		Point p11 = new Point();
		Point p12 = new Point();
		Point p13 = new Point();
		Point p14 = new Point();
		Point p15 = new Point();
		Point p16 = new Point();
		Point p17 = new Point();
		Point p18 = new Point();
		Point p19 = new Point();
		Point p20 = new Point();
		Point p21 = new Point();
		Point p22 = new Point();
		Point p23 = new Point();
		Point p24 = new Point();
		Point p25 = new Point();
		Point p26 = new Point();
		Point p27 = new Point();
		Point p28 = new Point();*/
	}

}
