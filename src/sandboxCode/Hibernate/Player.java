package sandboxCode.Hibernate;

public class Player {
    private int age;
    private String team;
    private String name;
    private String league;
    private int number;

    public Player() {}
    public Player(String name, String league, String team,int number) {
        this.name = name;
        this.league = league;
        this.number = number;
        this.team = team;
    }

    public String getTeam(){
        return team;
    }
    public String setTeam(String team){
        this.team = team;
    }
    public int getAge() {
        return age;
    }
    public void setAge( int age ) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }
    public String getLeague() {
        return league;
    }
    public void setLeague( String league ) {
        this.league = league;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber( int number ) {
        this.number = number;
    }
}