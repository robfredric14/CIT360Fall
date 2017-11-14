package sandboxCode.Json;


        import org.json.simple.JSONObject;


public class JSONTest {

   // TEST FILE FOR BASIC JSON OBJECT
    public static void main(String[] args) {

        JSONObject info = new JSONObject();

        info.put("name","Robert");
        info.put("number","283743");
        info.put("state","WA");
        info.put("Occupation","Police Officer");

        System.out.println(info);






    }
}