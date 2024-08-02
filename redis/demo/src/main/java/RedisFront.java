import java.util.*;

public class RedisFront {
    
    public static void main(String[] args) {
        
        boolean flag=true;
        RedisStringDataType string=new RedisStringDataType();
        RedisLIstDataType list=new RedisLIstDataType();
        RedisHashesDataType hash=new RedisHashesDataType();
        
        while(flag){

            System.out.println("which operation you want to perform"); 
            System.out.println("1.String  2.List  3.hash");
            Scanner scanner=new Scanner(System.in);
            String userChoice=scanner.nextLine();

            switch(userChoice){
                case "string":
                string.performOperation(performCommonThings(scanner));
                break;

                case "list":
                list.performOperation(performCommonThings(scanner));
                break;

                case "hashes":
                hash.performOperation(performCommonThings(scanner));
                break;
                
                default:
                break;

            }
            System.out.println("are u want to continue the process");
            flag=scanner.nextBoolean();
            
        }
        
        
    }
    public static String performCommonThings(Scanner scanner){
           
        System.out.println("Which Operation You want perform");
        System.out.println("1.ADD  2.UPDATE 3.DELETE  4.GET");
        String stringOperation=scanner.nextLine();
        return stringOperation;
    }
    
}
