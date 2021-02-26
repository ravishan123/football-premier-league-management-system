package sample;

import java.io.Serializable;
import java.util.Date;

public class UniversityFootballclub extends Footballclub  {




    private String university_name;


    public UniversityFootballclub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address, int wins, int drows, int defeats, int number_of_goals, int number_of_points, int number_of_matchers) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address, wins, drows, defeats, number_of_goals, number_of_points, number_of_matchers);
    }

    public UniversityFootballclub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address,  int wins, int drows, int defeats, int number_of_goals, int number_of_points, int number_of_matchers, String university_name) {
        super(nameOfTheClube, clubId, locationOfTheClube, contactNumber, address, wins, drows, defeats, number_of_goals, number_of_points, number_of_matchers);
        this.university_name = university_name;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    @Override
    public String toString() {
        return "UniversityFootballclub{" +
                "university_name='" + university_name  +
                ", wins=" + getWins() +
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
