package fr.esiee.pic.esieedesigner.awt.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

/**
 * Figure géométrique java 2D construite à partir de point
 * 
 * @author etudiant
 * 
 */
public class GeneralShape extends Component {

	/**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 4979613728446384613L;

	/**
	 * Liste de points utilisée pour la construction
	 */
	private final Point2D[] points;

	/**
	 * Couleur de la forme géométrique
	 */
	private final Color color;
	
	/**
	 * Taille des traits de jointures
	 */
	private static final float WIDTH_OF_LINE_STROKE = 3.0f;
	
	/**
	 * Limit
	 */
	private static final float MITER_JOIN_LIMIT = 1.0f;
	
	/**
	 * Pattern des traits de jointure
	 */
	private static final float[] DASH_ARRAY = { 1.0f };
	
	/**
	 * Offset avant tracé des traits
	 */
	private static final float DASH_PHASE = 0.0f;
	
	/**
	 * Couleur des lignes de jointures entre les points
	 */
	private static final Color LINE_COLOR = new Color(0f,0f,0f,.9f);

	/**
	 * Construit une figure à partir d'une liste de point et d'une couleur.
	 * 
	 * @param points
	 * @param color
	 */
	public GeneralShape(Point2D[] points, Color color) {
		this.points = points.clone();
		this.color = color;
	}

	/**
	 * Paint method
	 */
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		GeneralPath rec = new GeneralPath();

		// Coordonnée du premier point
		double x0 = points[0].getX();
		double y0 = points[0].getY();

		// Deplacement vers le premier point
		rec.moveTo(x0, y0);

		// liaison des points
		for (int j = 1; j < this.points.length; j++) {
			double x = this.points[j].getX();
			double y = this.points[j].getY();
			rec.lineTo(x, y);
		}

		rec.closePath();
		
		// taille des traits (de liaison entre les points)
		float width = WIDTH_OF_LINE_STROKE;
		
		// Décoration de la fin des traits
		int cap = BasicStroke.CAP_SQUARE;
		
		// Décoration des points de croisement des points
		int join = BasicStroke.JOIN_MITER;
		
		// Supérieur ou égal à 1.0f
		float miterlimit = MITER_JOIN_LIMIT;
		
		// the array representing the dashing pattern
		float[] dash = DASH_ARRAY;
		
		// the offset to start the dashing pattern
		float dashPhase = DASH_PHASE;
		
		// Définition de la forme des traits de jointure entre les points
		BasicStroke dashed7 = new BasicStroke(width, cap, join, miterlimit,
				dash, dashPhase);
		g2d.setStroke(dashed7);
		
		// Remplissage
		if (this.color != null) {
			// Application de la couleur
			g2d.setPaint(this.color);
			g2d.fill(rec);
		}

		g2d.setPaint(LINE_COLOR);
		g2d.draw(rec);
	}
}