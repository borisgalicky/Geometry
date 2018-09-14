public class Rectangle implements Operations {
    private int a;
    private int b;
    
    public void calculateVolume(){
        System.out.println("RECTANGLE: A="+a+" B="+b+" Volume is "+a*b);
    }
    
    public void calculatePerimeter(){
        System.out.println("RECTANGLE: A="+a+" B="+b+" Perimeter is "+((2*a)+(2*b)));
    }
    
    public void setA(int a){
        this.a=a;
    }
    
    public void setB(int b){
        this.b=b;
    }
        
}
