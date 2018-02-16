class RectangularContainer extends Container {
	// add appropriate data definitions
	double width, length;
	RectangularContainer(double height, double width, double length) {
		super(height);
		this.width = width; 
		this.length = length; 
		// Fill in details
	}
	double getTopArea(){
		double returnObject = 0;
		returnObject = this.width * this.length;
			return returnObject;
		}
	double getTopPerimeter(){
		double returnObject = 0;
		returnObject = 2 * (width + length);
			return returnObject;
		}
	// implement required abstract methods
}