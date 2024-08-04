import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pubsub {
    public static void main(String[] args) throws IOException {
         Queue<String> queue=new LinkedList<>();
        boolean flag=true;
        while(flag){
            Scanner scanner=new Scanner(System.in);
            System.out.println("url:");
            String url=scanner.nextLine();
            queue.add(url);
            while(queue.size()>0){
                Publisher publisher=new Publisher();
                Subscriber subscriber=new Subscriber(publisher);
                subscriber.handleRequest(queue.poll());
            }
        }
       
    }
}
