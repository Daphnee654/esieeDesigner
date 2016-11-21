package fr.esiee.pic.esieedesigner.design.tp2;

import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;

/**
 * Le groupe 2 ajoutera ses dessins dans cette classe.
 * 
 * @author etudiant
 *
 */
public class DessinsGroupe2 extends CreateurDeForme {
	
	/**
	 * Offset d'origine
	 */
	private static final double ORIGINE = 700;
	
	/**
	 * Largeur d'une case
	 */
	private static final double CASE = 25;

	@Override
	public void dessiner() {
		// Ajout vos dessins ici
		// Pensez à désactiver les dessins de la démo 
		// en commentant initDemo dans le méthode init()de la classe fr.esiee.pic.esieedesigner.ui.scene.EcranPrincipal
		dessiner_visage();
	}
	
	public void dessiner_visage() {
		
		Point A = new Point(ORIGINE + 4*CASE, 5*CASE);
		Point B = new Point(ORIGINE + 4*CASE, 6*CASE);
		Point C = new Point(ORIGINE + 5*CASE, 7*CASE);
		Point D = new Point(ORIGINE + 6*CASE, 7*CASE);
		Point E = new Point(ORIGINE + 7*CASE, 6*CASE);
		Point F = new Point(ORIGINE + 8*CASE, 7*CASE);
		Point G = new Point(ORIGINE + 9*CASE, 7*CASE);
		Point H = new Point(ORIGINE + 10*CASE, 6*CASE);
		Point I = new Point(ORIGINE + 10*CASE, 5*CASE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(A)
		.ajouter(B)
		.ajouter(C)
		.ajouter(D)
		.ajouter(E)
		.ajouter(F)
		.ajouter(G)
		.ajouter(H)
		.ajouter(I);
		
		
		Point Bouche1 = new Point(ORIGINE + 5*CASE, 9*CASE);
		Point Bouche2 = new Point(ORIGINE + 6*CASE, 11*CASE);
		Point Bouche3 = new Point(ORIGINE + 8*CASE, 11*CASE);
		Point Bouche4 = new Point(ORIGINE + 9*CASE, 9*CASE);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(Bouche1)
		.ajouter(Bouche2)
		.ajouter(Bouche3)
		.ajouter(Bouche4);
	}


}
