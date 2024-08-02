import java.util.LinkedList;
import java.util.Scanner;

public class RedisLIstDataType {
     static LinkedList<String> books = new LinkedList<>();
     Scanner scanner = new Scanner(System.in);
  
    
    public void performOperation(String operation){
        
        switch (operation) {
            case "add":
                addOperation();
                break;
            case "update":
                updateOperation(); 
                break;
            case "delete":
                deleteOperation(); 
                break;
            case "get":
                 System.out.println(readOperation());
                break;         
        
            default:
                break;
        }

    }
    public void addOperation(){
        System.out.println("Enter a vlaue to add");
        String value=scanner.nextLine();
        books.add(value);

    }
    public void updateOperation(){
        System.out.println("Enter a updated value");
        String updatedValue=scanner.nextLine();
        System.out.println("Enter a replaced value");
        String replacedValue=scanner.nextLine();

        for(int i=0;i<books.size();i++){
            if (books.get(i).equals(updatedValue)) {
                books.set(i,replacedValue);
                break;
            }
        }
    }

    public void deleteOperation(){
        System.out.println("Enter a vlaue to delete");
        String value=scanner.nextLine();
        for(int i=0;i<books.size();i++){
            if(books.get(i).equals(value)){
               books.remove(i);
               break;
            }
        }

    }
    public LinkedList<String> readOperation(){
        return books;
    }
}
