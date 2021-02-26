package sample;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Footballclub extends SportsClub  {

    private int wins;
    private int drows;
    private int defeats;
    private int number_of_goals;
    private int number_of_points;
    private int number_of_matchers;

    public Footballclub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address);
    }

//contructor


    public Footballclub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address, int wins, int drows, int defeats, int number_of_goals, int number_of_points, int number_of_matchers) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address);
        this.wins = wins;
        this.drows = drows;
        this.defeats = defeats;
        this.number_of_goals = number_of_goals;
        this.number_of_points = number_of_points;
        this.number_of_matchers = number_of_matchers;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDrows() {
        return drows;
    }

    public void setDrows(int drows) {
        this.drows = drows;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getNumber_of_goals() {
        return number_of_goals;
    }

    public void setNumber_of_goals(int number_of_goals) {
        this.number_of_goals = number_of_goals;
    }

    public int getNumber_of_points() {
        return number_of_points;
    }

    public void setNumber_of_points(int number_of_points) {
        this.number_of_points = number_of_points;
    }

    public int getNumber_of_matchers() {
        return number_of_matchers;
    }

    public void setNumber_of_matchers(int number_of_matchers) {
        this.number_of_matchers = number_of_matchers;
    }

    @Override
    public String toString() {
        return "Footballclub{" +
                "wins=" + wins +
                ", drows=" + drows +
                ", defeats=" + defeats +
                ", number_of_goals=" + number_of_goals +
                ", number_of_points=" + number_of_points +
                ", number_of_matchers=" + number_of_matchers +
                "nameOfTheClube='" + getNameOfTheClube()  +
                ", clubId=" + getClubId() +
                ", locationOfTheClube='" + getLocationOfTheClube() +
                ", contactNumber=" + getContactNumber() +
                ", address='" + getAddress() +

                '}';
    }


}