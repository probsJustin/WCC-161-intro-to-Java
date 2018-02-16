class RegularPolygonContainer extends Container {
	double side; 
	int numSides;
	// add appropriate data definitions
	RegularPolygonContainer(double height, double side, int numSides) {
		super(height);
		this.side = side;
		this.numSides = numSides;
		// Fill in details
	}
	// implement required abstract methods
	double getTopArea(){
		double returnObject = 0;
		returnObject = numSides * side * side / ( 4*Math.tan(Math.PI/numSides));
			return returnObject;
		}
	double getTopPerimeter(){
		double returnObject = 0;
		returnObject = numSides * side;
			return returnObject;
		}
}