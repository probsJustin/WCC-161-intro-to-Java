class CircularContainer extends Container {
	double radius = 0;
	// add appropriate data definitions
	CircularContainer(double height, double radius) {
		super(height);
		this.radius = radius;
		// Fill in details
	}
	double getTopArea(){
	double returnObject = 0;
	returnObject = Math.PI * this.radius * this.radius;
		return returnObject;
	}
	double getTopPerimeter(){
	double returnObject = 0;
	returnObject = 2 * Math.PI * this.radius;
		return returnObject;
	}
}