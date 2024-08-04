import java.io.IOException;

import javax.swing.text.html.parser.Entity;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Publisher {
   private HttpClient httpClient; 
   public Publisher(){
    this.httpClient=HttpClients.createDefault();
   }
   public void fetchData(String url) throws IOException {
    //  HttpGet request=new HttpGet(url);
    //     return httpClient.execute(request ,response -> {
    //        int statuscode=response.getStatusLine().getStatusCode();
    //        if(statuscode>=200 && statuscode<300){
    //         System.out.println("success");
    //         return EntityUtils.toString(response.getEntity());
    //        }else{
    //         System.out.println("fail");
    //          throw new IOException("response failed");
    //        }
     //});
      try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println(responseBody);
                System.out.println(response.getStatusLine().getStatusCode());
            }catch(IOException e){
                System.out.println("failed");
            }
        }

   }
}
