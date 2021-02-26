package sample;

import java.io.Serializable;
import java.util.Date;

public class SportsClub implements Serializable{

    private  static final long serialversionUid =1L;

    private String nameOfTheClube;
    private double clubId;
    private String locationOfTheClube;
    private int contactNumber;
    private String address;



    public SportsClub(String nameOfTheClube, double clubId, String locationOfTheClube, int contactNumber, String address) {
        this.nameOfTheClube = nameOfTheClube;
        this.clubId = clubId;
        this.locationOfTheClube = locationOfTheClube;
        this.contactNumber = contactNumber;
        this.address = address;


    }

    public String getNameOfTheClube() {
        return nameOfTheClube;
    }

    public void setNameOfTheClube(String nameOfTheClube) {
        this.nameOfTheClube = nameOfTheClube;
    }

    public double getClubId() {
        return clubId;
    }

    public void setClubId(double clubId) {
        this.clubId = clubId;
    }

    public String getLocationOfTheClube() {
        return locationOfTheClube;
    }

    public void setLocationOfTheClube(String locationOfTheClube) {
        this.locationOfTheClube = locationOfTheClube;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "SportsClub{" +
                "nameOfTheClube='" + nameOfTheClube + '\'' +
                ", clubId=" + clubId +
                ", locationOfTheClube='" + locationOfTheClube + '\'' +
                ", contactNumber=" + contactNumber +
                ", address='" + address + '\'' +

                '}';
    }


}
