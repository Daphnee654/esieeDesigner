package fr.esiee.pic.esieedesigner.api.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.esiee.pic.esieedesigner.api.shapes.CheminDePoints;
import fr.esiee.pic.esieedesigner.api.shapes.Couleur;
import fr.esiee.pic.esieedesigner.api.shapes.Ellipse;

/**
 * Classe utilitaire principale pour la création des formes
 * 
 * @author etudiant
 *
 */
public abstract class CreateurDeForme {

	/**
	 * Liste des ellipses composant le dessin
	 */
	private final Map<Ellipse, Couleur> ellipses;
	
	/**
	 * Liste des figures faites à partir de points
	 */
	private final List<CheminDePoints> formesAvecPoints;
	
	/**
	 * Constructeur par defaut
	 */
	public CreateurDeForme() {
		super();
		ellipses = new HashMap<>();
		formesAvecPoints = new ArrayList<>();
	}
	
	/**
	 * Initialise une nouvelle phase de création d'un dessin à partir de points.
	 * 
	 * @return
	 */
	protected CheminDePoints demarrerNouveauDessinAvecDesPoints() {
		CheminDePoints nouveauChemin = new CheminDePoints();
		this.formesAvecPoints.add(nouveauChemin);
		
		return nouveauChemin;
	}
	
	/**
	 * Ajoute une nouvelle ellipse à la figure en cours de construction.
	 * 
	 * @param ellipse
	 * @return
	 */
	protected CreateurDeForme ajouterEllipse(Ellipse ellipse, Couleur couleur) {
		this.ellipses.put(ellipse, couleur);
		return this;
	}
	
	/**
	 * Ajoute une nouvelle ellipse à la figure en cours de construction.
	 * 
	 * @param ellipse
	 * @return
	 */
	protected CreateurDeForme ajouterEllipse(Ellipse ellipse) {
		ajouterEllipse(ellipse, null);
		return this;
	}
	
	/**
	 * Méthode à implémenter pour créer un dessiner.
	 */
	public abstract void dessiner();

	/**
	 * Getter de la liste des ellipses
	 * 
	 * @return
	 */
	public Map<Ellipse, Couleur> getEllipses() {
		return ellipses;
	}

	/**
	 * Getter de la liste des formes faites à partir de points
	 * @return
	 */
	public List<CheminDePoints> getFormesAvecPoints() {
		return formesAvecPoints;
	}
}
