
/**
 * This is a utility class for representing a pair of doubles. Functionality
 * will be added to it as needed.
 * 
 * @author Ryan
 *
 */
public class Vector {
	public double x, y;

	/**
	 * Creates a new [0, 0] vector
	 */
	public Vector() {
		this(0, 0);
	}

	/**
	 * Creates a new [x, y] vector
	 * 
	 * @param x
	 *            The x coordinate of the vector
	 * @param y
	 *            The y coordinate of the vector
	 */
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Creates a new vector that is the sum of this and v
	 * 
	 * @param v
	 *            The vector to be added to this
	 * @return The new vector sum
	 */
	public Vector add(Vector v) {
		return new Vector(x + v.x, y + v.y);
	}

	/**
	 * Effectively calculates this vector's distance from 0
	 * 
	 * @return This vector's length
	 */
	public double length() {
		return this.distance(new Vector());
	}

	/**
	 * Changes this vector's components to make its length equal to l
	 * 
	 * @param l
	 *            The target length
	 * @return This vector
	 */
	public Vector setLength(double l) {
		double d = this.distance(new Vector());
		if (d == 0) {
			return this;
		}

		x *= l / d;
		y *= l / d;

		return this;
	}

	/**
	 * Returns the distance between this vector and v
	 * 
	 * @param v
	 *            The vector to be compared for distance
	 * @return The distance between this vector and v
	 */
	public double distance(Vector v) {
		return Math.sqrt(this.distance2(v));
	}

	/**
	 * Returns the square of the distance between this vector and v. Square
	 * roots are computationally slow, so when possible, using distance2
	 * improves framerate
	 * 
	 * @param v
	 *            The vector for distance calculation
	 * @return The squared distance
	 */
	public double distance2(Vector v) {
		return Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2);
	}

	/**
	 * Returns a new vector that is a scaled version of this vector
	 * 
	 * @param s
	 *            The scalar value
	 * @return The new scaled vector
	 */
	public Vector scale(double s) {
		return new Vector(x * s, y * s);
	}
	
	public String toString() {
		return "<" + x + ", " + y + ">";
	}
}