import java.io.IOException;

public class Subscriber {
    private Publisher publisher;
    public Subscriber(Publisher publisher){
       this.publisher=publisher;

    }
    public void handleRequest(String url) throws IOException{
         try{
            publisher.fetchData(url);
         }catch(IOException e){
            System.out.println("error from fetching details");
            System.out.println(e.getMessage());

         }
    }
}
