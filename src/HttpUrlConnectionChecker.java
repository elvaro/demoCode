import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;


public class HttpUrlConnectionChecker {

    public static void main(String[] args) {
        try {
            HttpURLConnection conn = null;
            String p1 = "http://www.facebook.com";
            URL url = new URL(p1);
            conn = (HttpURLConnection)url.openConnection();
//            connection.connect();
            System.out.println(conn.getResponseCode());
            System.out.println(conn.getHeaderField("Location"));
            System.out.println(conn.getResponseMessage());
            Map<String, List<String>> map = conn.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println("Key : " + entry.getKey() +
                        " ,Value : " + entry.getValue());
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
