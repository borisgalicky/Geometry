public class Calculate implements PowOperations{
    private int num;
    
    @Override
    public void calculateTwoPow() {
        System.out.println("Number: "+num+", Second power: "+num*num);
    }

    @Override
    public void calculateThreePow() {
        System.out.println("Number: "+num+", Third power: "+num*num*num);
    }
    
    public void setNum(int num){
        this.num = num;
    }

}
