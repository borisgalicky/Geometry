import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        
        
        
        ArrayList<String> firstlist = new ArrayList<String>();
        firstlist.add("A");
        firstlist.add("B");
        firstlist.add("C");
        
        ArrayList<String> secondlist = new ArrayList<String>();
        secondlist.add("D");
        secondlist.add("E");
        secondlist.add("F");
        
        ArrayList<String> thirdlist = new ArrayList<String>();
        
        for(int i=0;i<firstlist.size();i++){
            String value1 = firstlist.get(i);
            thirdlist.add(value1);
            if(i==(firstlist.size()-1)){
                for(int j=0;j<secondlist.size();j++){
                    String value2 = secondlist.get(j);
                    thirdlist.add(value2);
                }
            }
        }
        System.out.println("First arraylist: ");
        for(int i=0;i<firstlist.size();i++){
            System.out.println(firstlist.get(i));
        }
        System.out.println("\nSecond arraylist: ");
        for(int i=0;i<secondlist.size();i++){
            System.out.println(secondlist.get(i));
        }
        System.out.println("\nThird (common) arraylist: ");
        for(int i=0;i<thirdlist.size();i++){
            System.out.println(thirdlist.get(i));
        }
                
       /*Loader loader = new Loader();
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<3; i++){
            String scanned = scan.nextLine();
            loader.loadToList(scanned);
        }
        
        ArrayList<String> namelist = new ArrayList<>(); //zadefinujem si arraylist ktorý do ktorého je možno vkladať len stringy
        namelist.add("Ján");
        namelist.add("Juraj");
        namelist.add("Michal");
        namelist.add("Ferdinand");
        
        for(int i=0;i<namelist.size();i++){
            String name = namelist.get(i); //vytiahnutie si každého mena do tejto premennej v rámci cyklu
            int length = name.length(); //v premennej je dlžka každého mena (prvku v array-i)
            System.out.println(name+" "+length);
        }
        
        System.out.println(namelist.get(1));
        
        
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
        number.calculateThreePow();*/
    }
}