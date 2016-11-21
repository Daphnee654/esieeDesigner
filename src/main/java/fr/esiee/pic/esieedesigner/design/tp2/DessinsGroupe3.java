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

			
		Point hautGauche = new Point(BASE_GAUCHE, BASE_HAUT);
		Point hautDroit = new Point(BASE_DROITE, BASE_HAUT);
		Point basGauche = new Point(BASE_GAUCHE, BASE_BAS);
		Point basDroite = new Point(BASE_DROITE, BASE_BAS);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(hautGauche)
		.ajouter(hautDroit)
		.ajouter(basDroite)
		.ajouter(basGauche);
		
		dessinerCorp();
        dessinerCheveux();
		dessinVisage();
	}
	
	/**
	 * Methode pour dessiner le corp et les doides
	 */
	public void dessinerCorp() {
		// Pour le corp
		Point p1 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+10*PIXEL);
		Point p2 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+10*PIXEL);
		Point p3 = new Point(BASE_GAUCHE+10*PIXEL,BASE_HAUT+8*PIXEL);
		Point p4 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+8*PIXEL);
		Point p5 = new Point(BASE_GAUCHE+13*PIXEL,BASE_HAUT+10*PIXEL);
		Point p6 = new Point(BASE_GAUCHE+13*PIXEL,BASE_HAUT+13*PIXEL);
		Point p7 = new Point(BASE_GAUCHE+12*PIXEL,BASE_HAUT+13*PIXEL);
		Point p8 = new Point(BASE_GAUCHE+12*PIXEL,BASE_HAUT+11*PIXEL);
		Point p9 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+10*PIXEL);
		Point p10 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+11*PIXEL);
		Point p11 = new Point(BASE_GAUCHE+10*PIXEL,BASE_HAUT+13*PIXEL);
		Point p12 = new Point(BASE_GAUCHE+11*PIXEL,BASE_HAUT+14*PIXEL);
		Point p13 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+14*PIXEL);
		Point p14 = new Point(BASE_GAUCHE+9*PIXEL,BASE_HAUT+13*PIXEL);
		Point p15 = new Point(BASE_GAUCHE+8*PIXEL,BASE_HAUT+12*PIXEL);
		Point p16 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+12*PIXEL);
		Point p17 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+13*PIXEL);
		Point p18 = new Point(BASE_GAUCHE+6*PIXEL,BASE_HAUT+14*PIXEL);
		Point p19 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+14*PIXEL);
		Point p20 = new Point(BASE_GAUCHE+4*PIXEL,BASE_HAUT+13*PIXEL);
		Point p21 = new Point(BASE_GAUCHE+5*PIXEL,BASE_HAUT+11*PIXEL);
		Point p22 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+10*PIXEL);
		Point p23 = new Point(BASE_GAUCHE+2*PIXEL,BASE_HAUT+11*PIXEL);
		Point p24 = new Point(BASE_GAUCHE+2*PIXEL,BASE_HAUT+13*PIXEL);
		Point p25 = new Point(BASE_GAUCHE+1*PIXEL,BASE_HAUT+13*PIXEL);
		Point p26 = new Point(BASE_GAUCHE+1*PIXEL,BASE_HAUT+10*PIXEL);
		Point p27 = new Point(BASE_GAUCHE+3*PIXEL,BASE_HAUT+8*PIXEL);
		Point p28 = new Point(BASE_GAUCHE+4*PIXEL,BASE_HAUT+8*PIXEL);
		
		// Pour les mains
		Point pA = new Point(BASE_GAUCHE+12*PIXEL,BASE_HAUT+12*PIXEL);
		Point pB = new Point(BASE_GAUCHE+13*PIXEL,BASE_HAUT+12*PIXEL);
		Point pC = new Point(BASE_GAUCHE+1*PIXEL,BASE_HAUT+12*PIXEL);
		Point pD = new Point(BASE_GAUCHE+2*PIXEL,BASE_HAUT+12*PIXEL);
		
		demarrerNouveauDessinAvecDesPoints()
		.ajouter(p1)
		.ajouter(p2)
		.ajouter(p3)
		.ajouter(p4)
		.ajouter(p5)
		.ajouter(pB)
		.ajouter(pA)
		.ajouter(p8)
		.ajouter(p9)
		.ajouter(p10)
		.ajouter(p11)
		.ajouter(p12)
		.ajouter(p13)
		.ajouter(p14)
		.ajouter(p15)
		.ajouter(p16)
		.ajouter(p17)
		.ajouter(p18)
		.ajouter(p19)
		.ajouter(p20)
		.ajouter(p21)
		.ajouter(p22)
		.ajouter(p23)
		.ajouter(pD)
		.ajouter(pC)
		.ajouter(p26)
		.ajouter(p27)
		.ajouter(p28);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pA)
		.ajouter(pB)
		.ajouter(p6)
		.ajouter(p7);

		demarrerNouveauDessinAvecDesPoints()
		.ajouter(pC)
		.ajouter(pD)
		.ajouter(p24)
		.ajouter(p25);
	}

    
    private void dessinerCheveux(){
        Point baseCheveux = new Point(BASE_GAUCHE, BASE_HAUT+PIXEL);
        Point cheveux1 = new Point(BASE_GAUCHE+PIXEL, BASE_HAUT);
        Point cheveux2 = new Point(BASE_DROITE-PIXEL, BASE_HAUT);
        Point cheveux3 = new Point(BASE_DROITE, BASE_HAUT+PIXEL);
        Point cheveux4 = new Point(BASE_DROITE, BASE_HAUT+3*PIXEL);
        Point cheveux5 = new Point(BASE_DROITE-1*PIXEL, BASE_HAUT+7*PIXEL);
        Point cheveux6 = new Point(BASE_DROITE-2*PIXEL, BASE_HAUT+7*PIXEL);
        Point cheveux7 = new Point(BASE_DROITE-3*PIXEL, BASE_HAUT+6*PIXEL);
        Point cheveux8 = new Point(BASE_DROITE-3*PIXEL, BASE_HAUT+3*PIXEL);
        Point cheveux9 = new Point(BASE_DROITE-5*PIXEL, BASE_HAUT+2*PIXEL);
        Point cheveux10 = new Point(BASE_DROITE-7*PIXEL, BASE_HAUT+3*PIXEL);
        Point cheveux11 = new Point(BASE_GAUCHE+5*PIXEL, BASE_HAUT+2*PIXEL);
        Point cheveux12 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+3*PIXEL);
        Point cheveux13 = new Point(BASE_GAUCHE+3*PIXEL, BASE_HAUT+6*PIXEL);
        Point cheveux14 = new Point(BASE_GAUCHE+2*PIXEL, BASE_HAUT+7*PIXEL);
        Point cheveux15 = new Point(BASE_GAUCHE+1*PIXEL, BASE_HAUT+7*PIXEL);
        Point cheveux16 = new Point(BASE_GAUCHE, BASE_HAUT+3*PIXEL);
        Point cheveux17 = new Point(BASE_GAUCHE, BASE_HAUT+1*PIXEL);


        demarrerNouveauDessinAvecDesPoints()
        .ajouter(baseCheveux)
        .ajouter(cheveux1)
        .ajouter(cheveux2)
        .ajouter(cheveux3)
        .ajouter(cheveux4)
        .ajouter(cheveux5)
        .ajouter(cheveux6)
        .ajouter(cheveux7)
        .ajouter(cheveux8)
        .ajouter(cheveux9)
        .ajouter(cheveux10)
        .ajouter(cheveux11)
        .ajouter(cheveux12)
        .ajouter(cheveux13)
        .ajouter(cheveux14)
        .ajouter(cheveux15)
        .ajouter(cheveux16)
        .ajouter(cheveux17);



        
    }
    
    private void dessinerCadre(){

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
    
 

}
