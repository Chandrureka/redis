import java.util.HashMap;
import java.util.Scanner;

public class RedisStringDataType {
   static HashMap<String,String> map=new HashMap<>();
    Scanner scanner=new Scanner(System.in);
    
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
                 System.out.println(getOperation());
                break;         
        
            default:
                break;
        }

    }
    public void addOperation(){
       System.out.println("key:");
       String key=scanner.nextLine();
       
       System.out.println("value:");
       String value=scanner.nextLine();
       map.put(key,value);
    }
    public void updateOperation(){
        System.out.println("key:");
        String key=scanner.nextLine();
     
        System.out.println("value:");
        String value=scanner.nextLine();
        map.put(key,value);
    }
    public void deleteOperation(){
        System.out.println("key:");

        String key=scanner.nextLine();
        map.remove(key);
        
    }
    public String getOperation(){
        System.out.println("key:");
        String key=scanner.nextLine();
        return map.get(key);
    }

}
