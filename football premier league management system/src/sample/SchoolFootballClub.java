package sample;

import java.io.Serializable;
import java.util.Date;

public class SchoolFootballClub extends Footballclub  {
    String school_name;


    public SchoolFootballClub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address, int wins, int drows, int defeats, int number_of_goals, int number_of_points, int number_of_matchers) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address,  wins, drows, defeats, number_of_goals, number_of_points, number_of_matchers);
    }

    public SchoolFootballClub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address,  int wins, int drows, int defeats, int number_of_goals, int number_of_points, int number_of_matchers, String school_name) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address, wins, drows, defeats, number_of_goals, number_of_points, number_of_matchers);
        this.school_name = school_name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    @Override
    public String toString() {
        return "SchoolFootballClub{" +
                "school_name='" + school_name  +
                "wins=" + getWins() +
                ", drows=" + getDrows() +
                ", defeats=" + getDefeats() +
                ", number_of_goals=" + getNumber_of_goals() +
                ", number_of_points=" + getNumber_of_points() +
                ", number_of_matchers=" + getNumber_of_matchers() +
                ", nameOfTheClube='" + getNameOfTheClube()  +
                ", clubId=" + getClubId() +
                ", locationOfTheClube='" + getLocationOfTheClube() +
                ", contactNumber=" + getContactNumber() +
                ", address='" + getAddress() +

                '}';
    }
}
