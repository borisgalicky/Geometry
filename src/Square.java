public class Square implements Operations {
    private int a;
    
    public void calculateVolume(){
        System.out.println("SQUARE: A="+a+" Volume is "+2*a);
    }
    
    public void calculatePerimeter(){
        System.out.println("SQUARE: A="+a+" Perimeter is "+4*a);
    }
    
    public void setA(int a){
        this.a=a;
    }
    
}
