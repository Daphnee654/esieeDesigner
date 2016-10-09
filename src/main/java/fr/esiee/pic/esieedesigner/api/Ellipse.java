package fr.esiee.pic.esieedesigner.api;

/**
 * Réprésente la figure géométrique 2D ellipse
 * 
 * Une ellipse se définit à partir des éléments ci-dessous :
 * 	- Une abscisse
 *  - Une ordonnée
 *  - Une largeur
 *  - une hauteur
 *  
 * Si la largeur = hauteur, l'éllipse devient un cercle.
 * 
 * @author etudiant
 *
 */
public final class Ellipse {
	
	/**
	 * L'abscisse de l'éllipse
	 */
	private final double x;
	
	/**
	 * L'ordonnée de l'éllipse
	 */
	private final double y;
	
	/**
	 * La largeur de l'éllipse
	 */
	private final double l;
	
	/**
	 * La hauteur de l'éllipse
	 */
	private final double h;

	/**
	 * Construit une éllipse à partir de :
	 * 	- ses corrdonnées x (abscisse) et y (ordonnée)
	 * 	- sa largeur
	 * 	- de sa hauteur
	 *  
	 * @param x
	 * @param y
	 * @param l
	 * @param h
	 */
	public Ellipse(double x, double y, double l, double h) {
		super();
		this.x = x;
		this.y = y;
		this.l = l;
		this.h = h;
	}

	/**
	 * Getter de l'abscisse
	 * 
	 * @return
	 */
	public double getX() {
		return x;
	}

	/**
	 * Getter de l'ordonnée
	 * 
	 * @return
	 */
	public double getY() {
		return y;
	}

	/**
	 * Getter de la largeur
	 * 
	 * @return
	 */
	public double getL() {
		return l;
	}

	/**
	 * Getter de la hauteur
	 * 
	 * @return
	 */
	public double getH() {
		return h;
	}
}
