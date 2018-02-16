class TriangularContainer extends Container {
	// add appropriate data definitions
	double side_a, side_b, side_c;
	TriangularContainer(double height, double side_a, double side_b, double side_c){
		super(height);
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
		// Fill in details
	}
	double getTopArea(){
		double returnObject = 0;
		double s = (side_a + side_b + side_c)/2.0;
		returnObject = Math.sqrt(s*(s - side_a)*(s - side_b)*(s - side_c));
			return returnObject;
		}
	double getTopPerimeter(){
		double returnObject = 0;
		returnObject = side_a + side_b + side_c; 
			return returnObject;
		}
}