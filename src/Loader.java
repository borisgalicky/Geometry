import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    
    ArrayList<String> mylist = new ArrayList<>();
    
    void loadToList(String enteredValue){
        mylist.add(enteredValue);
        if((mylist.size())>=3){
            for(int i=0;i<mylist.size();i++){
            System.out.println("List: "+mylist.get(i));
            }
        }
    }
}
