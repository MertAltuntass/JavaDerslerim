package Pack1;

public class NewPlayer extends Footballer implements IFootballClub, IPosition {

    String preferredFoot;

    public NewPlayer(String name, String surname, int age,String preferredFoot) {
        super(name, surname, age);
        this.preferredFoot=preferredFoot;
    }

    @Override
    void show() {
        System.out.println(this.name);
        System.out.println(this.surname);
        System.out.println(this.age);
        System.out.println(this.position);
        System.out.println(this.clubName);
        System.out.println(this.preferredFoot);


    }

    @Override
    public void setFootballClub(String FootballClub) {
        this.clubName=FootballClub;


    }

    @Override
    public void getFootballClub() {
        System.out.println(this.clubName);
    }

    @Override
    public void setIPosition(String Position) {
        this.position=Position;
    }

    @Override
    public void getIPosition() {
        System.out.println(this.position);
    }
}
