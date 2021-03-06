package fr.esiee.pic.esieedesigner.ui.tools;

import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import java.util.Map;

import fr.esiee.pic.esieedesigner.api.shapes.CheminDePoints;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;
import fr.esiee.pic.esieedesigner.api.shapes.Point;
import fr.esiee.pic.esieedesigner.api.tools.CreateurDeForme;
import fr.esiee.pic.esieedesigner.awt.engine.ExecutionEngine;
import fr.esiee.pic.esieedesigner.awt.factory.ShapesFactory;
import fr.esiee.pic.esieedesigner.awt.factory.impl.ShapesFactoryImpl;

/**
 * Effectue l'aggregation des composants à afficher
 * Appel la couche graphique
 * 
 * Implémente le pattern Visitor
 * 
 * @author etudiant
 *
 */
public final class AfficheurDeFormes {
	
	/**
	 * Factory de creation des formes graphiques
	 */
	private ShapesFactory shapesFactory;
	
	/**
	 * Moteur d'exécution
	 */
	private ExecutionEngine engine;
	
	/**
	 * unique instance de la classe
	 */
	private static AfficheurDeFormes instance;
	
	/**
	 * Longueur de l'affichage 
	 */
	private final double longueurAffichage;
	
	/**
	 * Largeur de l'affichage
	 */
	private final double largeurAffichage;
	
	/**
	 * Construteur par défaut caché
	 */
	private AfficheurDeFormes() {
		super();
		shapesFactory = ShapesFactoryImpl.getInstance();
		engine = ExecutionEngine.getInstance();
		engine.afficher();
		
		// Dimension de l'écran
		Dimension dimEcran = engine.getSize();
		this.longueurAffichage = dimEcran.getWidth();
		this.largeurAffichage = dimEcran.getHeight();
	}
	
	/**
	 * Retourne l'unique instance
	 * 
	 * @return
	 */
	public static AfficheurDeFormes getInstance() {
		if (instance == null) {
			instance = new AfficheurDeFormes();
		}
		
		return instance;
	}
	
	/**
	 * Gère l'affichage passer en paramètre
	 * 
	 * @param forme
	 */
	public void afficher(CreateurDeForme forme) {
		// Dessin des éléments de la forme
		forme.dessiner();
		
		// Recupération de la liste des ellipses
		Map<Ellipse, Couleur> ellipses = forme.getEllipses();
		
		// Récupération de la liste des formes de points
		List<CheminDePoints> cheminsDePoints = forme.getFormesAvecPoints();
		
		// Affichage des ellipses
		for (Map.Entry<Ellipse, Couleur> e : ellipses.entrySet()) {
			Ellipse currentEllipse = e.getKey();
			Couleur currentCouleur = e.getValue();
			
			// Appel de la factory
			Component ellipseComp = shapesFactory.produceEllipse(currentEllipse, currentCouleur);
			engine.ajouterFigure(ellipseComp);
		}
		
		// Affichage des chemins de points
		for (CheminDePoints c : cheminsDePoints) {
			Point[] points = c.toArray();
			Couleur couleur = c.getCouleurDeFond();
			Couleur couleurDesTraits = c.getCouleurTraits();
			boolean traitFin = c.aDesTraitsFin();
			boolean relierLesPointsExtreme = c.relierLesPointsExtremes();
			
			// Appel de la factory
			Component shapeComp = shapesFactory.produceShapeFromPoints(points, couleur, couleurDesTraits, traitFin, relierLesPointsExtreme);
			engine.ajouterFigure(shapeComp);
		}
	}

	/**
	 * Retourne la longueur de l'écran d'affichage
	 * 
	 * @return
	 */
	public double getLongueurAffichage() {
		return longueurAffichage;
	}

	/**
	 * Retourne la largeur de l'écran d'affichage
	 * 
	 * @return
	 */
	public double getLargeurAffichage() {
		return largeurAffichage;
	}
}
