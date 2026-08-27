class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Rectangle) {

            Rectangle r = (Rectangle) obj;

            return this.calArea() == r.calArea();
        }

        return false;
    }
}