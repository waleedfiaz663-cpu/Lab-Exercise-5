class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        
        this.radius = radius;
        
    }

    @Override
    
    public double calArea() {
        
        return 3.14 * radius * radius;
        
    }

    @Override
    
    public boolean equals(Object obj) {

        if (obj instanceof Circle) {

            Circle c = (Circle) obj;

            return this.radius == c.radius;
            
        }

        return false;
        
    }
    
}
