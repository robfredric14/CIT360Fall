package sandboxCode.Json;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class jsonBasic {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //userPreference Variable for switch case
        String userPreference = "";

        Scanner input = new Scanner(System.in);

        //User Preference options
        while (true) {

            //while(!true or false) makes below statements unreachable

            System.out.print("\nNewFile? ReadFile?");
            System.out.print("\nWhat would you like to do?: " );

            //FAILSAFE convert user's input to uppercase to match case scenario
            try {
                userPreference = input.next().toUpperCase();

            } catch (Exception e) {

            }

            //switch case all caps to satisfy previous uppercase statement to userPreference
            switch (userPreference) {

                case "NEWFILE":
                    newFile();
                    break;

                case "READFILE":
                    readFile();
                    break;

                default:
                    System.out.print("\nPlease type newfile or readfile with no spaces\n");
                    break;
            }
        }

    }

    private static void newFile() throws IOException {


        Scanner input = new Scanner(System.in);

        System.out.print("\nFavorite Sports Team: ");
        String sportsTeam = input.next();

        System.out.print("Favorite Player on Team: ");
        String favoritePlayer = input.next();

        System.out.print("Favorite Sport: ");
        String favoriteSport = input.next();

        System.out.print("How Many Years You have Been A Fan: ");
        int yearsFan = input.nextInt();

        System.out.print("What would you like to name your file: ");
        String file = input.next();

        //JSON OBJECT and apply info into said Object
        JSONObject sports = new JSONObject();

        sports.put("sportsTeam", sportsTeam);
        sports.put("favoritePlayer", favoritePlayer);
        sports.put("favoriteSport", favoriteSport);
        sports.put("yearsFan", yearsFan);

        //Write File
        try (FileWriter fileMaker = new FileWriter("/Users/robfredric/" + file + ".json"))
        {
            fileMaker.write(sports.toJSONString());

        }
    }

    private static void readFile() throws IOException, ClassNotFoundException {


        Scanner input = new Scanner(System.in);

        // Get the filename
        System.out.print("Please enter a filename: ");
        String filename = input.next();

        //Parser
        JSONParser parser = new JSONParser();

        try { Object sports = parser.parse(new FileReader(
                    "/Users/robfredric/" + filename + ".json"));

            JSONObject sportsObj = (JSONObject) sports;

            //getting datatypes from jsonobject
            String sportsTeamType = (String) sportsObj.get("sportsTeam");
            String favoritePlayerType = (String) sportsObj.get("favoritePlayer");
            String favoriteSportType = (String) sportsObj.get("favoriteSport");
            long yearsFanType = (long) sportsObj.get("yearsFan");

            // Prints out data
            System.out.println("\n" + sportsTeamType + "\n" + favoritePlayerType
                    + "\n" + favoriteSportType + "\n" + yearsFanType);

        } catch (IOException   e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}