public class Main {
    public static void main(String[] args) {
                
        Rectangle rec = new Rectangle();
        rec.setA(5);
        rec.setB(7); 
        rec.calculateVolume();
        rec.calculatePerimeter();
        
        Square sqr = new Square();
        sqr.setA(9);
        sqr.calculateVolume();
        sqr.calculatePerimeter();
        
        Calculate number = new Calculate();
        number.setNum(8);
        number.calculateTwoPow();
        number.calculateThreePow();
    }
}