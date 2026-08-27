public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(7);

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(25, 2);
        Rectangle r3 = new Rectangle(8, 6);

        
        if (c1.equals(c2))
            
            System.out.println("c1 and c2 are equal.");

        if (!c1.equals(c3))
            
            System.out.println("c1 and c3 are not equal.");

        
        if (r1.equals(r2))
            
            System.out.println("r1 and r2 are equal.");

        if (!r1.equals(r3))
            
            System.out.println("r1 and r3 are not equal.");
        
    }
    
}
