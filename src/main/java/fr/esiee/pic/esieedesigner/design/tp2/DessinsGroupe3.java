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

	public void dessinVisage(){
		Point ptVisage1 = new Point(BASE_GAUCHE+(3*PIXEL),BASE_HAUT+(4*PIXEL));
		Point ptVisage2 = new Point(BASE_GAUCHE+(3*PIXEL),BASE_HAUT+(7*PIXEL));
		Point ptVisage3 = new Point(BASE_GAUCHE+(6*PIXEL),BASE_HAUT+(10*PIXEL));
		Point ptVisage4 = new Point(BASE_GAUCHE+(8*PIXEL),BASE_HAUT+(10*PIXEL));
		Point ptVisage5 = new Point(BASE_GAUCHE+(11*PIXEL),BASE_HAUT+(7*PIXEL));
		Point ptVisage6 = new Point(BASE_GAUCHE+(11*PIXEL),BASE_HAUT+(4*PIXEL));
		Point ptVisage7 = new Point(BASE_GAUCHE+(9*PIXEL),BASE_HAUT+(5*PIXEL));
		Point ptVisage8 = new Point(BASE_GAUCHE+(7*PIXEL),BASE_HAUT+(4*PIXEL));
		Point ptVisage9 = new Point(BASE_GAUCHE+(5*PIXEL),BASE_HAUT+(5*PIXEL));
		Point ptVisage10 = new Point(BASE_GAUCHE+(3*PIXEL),BASE_HAUT+(4*PIXEL));
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(ptVisage1)
		.ajouter(ptVisage2)
		.ajouter(ptVisage3)
		.ajouter(ptVisage4)
		.ajouter(ptVisage5)
		.ajouter(ptVisage6)
		.ajouter(ptVisage7)
		.ajouter(ptVisage8)
		.ajouter(ptVisage9)
		.ajouter(ptVisage10);
	}

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal


		dessinVisage();
	}

}
