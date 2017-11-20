package sandboxCode.Json;


        import org.json.simple.JSONObject;


public class JSONTest {

   // TEST FILE FOR BASIC JSON OBJECT
    public static void main(String[] args) {

        JSONObject data = new JSONObject();

        data.put("name","Robert");
        data.put("number","283743");
        data.put("state","WA");
        data.put("Occupation","Police Officer");


        //Output JSON file
        System.out.println(data);






    }
}