import redis.clients.jedis.Jedis;
public class RedisConnector {
    


    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        String value = jedis.get("mykey");
        System.out.println(value);

        // Set a key
        jedis.set("mykey", "Hello, Redis!");

        // Get a key
         value = jedis.get("mykey");
        System.out.println(value);

        
        // Close the connection
        jedis.close();
    }
}


