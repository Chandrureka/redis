import java.util.HashMap;
import java.util.Scanner;

public class RedisHashesDataType {
    Scanner scanner=new Scanner(System.in);
    HashMap<String,String>bookDetails=new HashMap<>();
    static HashMap<String,HashMap<String,String>>books=new HashMap<>();
    public void performOperation(String operation){
        
        switch (operation) {
            case "add":
                addOperation(books,bookDetails);
                break;
            case "update":
                updateOperation(books); 
                break;
            case "delete":
                deleteOperation(books); 
                break;
            case "get":
                readOperation(books);
                break;         
        
            default:
                break;
        }

    }
    public void addOperation(HashMap<String,HashMap<String,String>>books,HashMap<String,String>bookDetails){
       System.out.println("enter a hashKey");
       String hashKey=scanner.nextLine();
       System.out.println("key:");
       String key=scanner.nextLine();
       System.out.println("value:");
       String value=scanner.nextLine();
       if(books.containsKey(hashKey)){
         books.get(hashKey).put(key, value);;
        
       }else{
        bookDetails=new HashMap<>();
        bookDetails.put(key,value);
        books.put(hashKey,bookDetails);
       }

    }
    public void updateOperation(HashMap<String,HashMap<String,String>>books){
        System.out.println("enter a hashKey");
        String hashKey=scanner.nextLine();
        System.out.println("Updatedkey:");
        String key=scanner.nextLine();
        System.out.println("Replacedvalue:");
        String value=scanner.nextLine();
        books.get(hashKey).put(key,value);
        


    }
    public void deleteOperation(HashMap<String,HashMap<String,String>>books){
        System.out.println("enter a hashKey");
        String hashKey=scanner.nextLine();
        System.out.println("Deletedkey:");
        String key=scanner.nextLine();
        if(books.containsKey(hashKey)){
            books.get(hashKey).remove(key);
            if(books.get(hashKey).size()==0){
                books.remove(hashKey);
            }
        }
            
    }
    public void readOperation(HashMap<String,HashMap<String,String>>books){
        for (String hashkey : books.keySet()) {
            System.out.println("HashKey: " + hashkey +"");
            for(String key :books.get(hashkey).keySet()){
                System.out.println(key +" "+books.get(hashkey).get(key));
            }
        }


    }
}