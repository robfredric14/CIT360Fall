package sandboxCode.HttpUrlTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class httpurltest {


    public void run() {
        URL url;
        String content = "";

        HttpURLConnection http;


        try {
            url = new URL("http://google.com");
            URLConnection connection = url.openConnection();
            System.out.println("Type: " + connection.getContentType());

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = br.readLine()) != null)
            {
                content += line + "\n";
            }
            br.close();

            http = (HttpURLConnection) connection;
            http.setDoInput(true);
        }
        catch (MalformedURLException ex) {
            System.out.println("MalformedURLException: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Other Exception: " + ex.getMessage());
        }

        System.out.println("Contents:\n");
        System.out.println(content);
    }

    private void sendGet() throws Exception {

        String url = "https://www.facebook.com";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        String response = "";

        while ((inputLine = br.readLine()) != null) {
            response += inputLine;
        }
        br.close();

        // Print the response
        System.out.println(response);

    }


    public static void main(String[] args) {
        System.out.println(System.getProperties().toString());
        System.setProperty("http.agent", "Chrome");

        httpurltest testing = new httpurltest();
        testing.run();
        try {
            testing.sendGet();
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}

