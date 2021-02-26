package sample;

import java.io.Serializable;
import java.util.Date;

public class Match implements Serializable {

    private Date matchDate;
    private String teamOne;
    private String teamTwo;
    private int teamOneGoals;
    private int teamTwoGoals;
    private int teamOnePoints;
    private int teamTwoPoints;

    public Match(Date matchDate, String teamOne, String teamTwo, int teamOneGoals, int teamTwoGoals, int teamOnePoints, int teamTwoPoints) {
        this.matchDate = matchDate;
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.teamOneGoals = teamOneGoals;
        this.teamTwoGoals = teamTwoGoals;
        this.teamOnePoints = teamOnePoints;
        this.teamTwoPoints = teamTwoPoints;
    }

    public Match() {

    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public int getTeamOneGoals() {
        return teamOneGoals;
    }

    public void setTeamOneGoals(int teamOneGoals) {
        this.teamOneGoals = teamOneGoals;
    }

    public int getTeamTwoGoals() {
        return teamTwoGoals;
    }

    public void setTeamTwoGoals(int teamTwoGoals) {
        this.teamTwoGoals = teamTwoGoals;
    }

    public int getTeamOnePoints() {
        return teamOnePoints;
    }

    public void setTeamOnePoints(int teamOnePoints) {
        this.teamOnePoints = teamOnePoints;
    }

    public int getTeamTwoPoints() {
        return teamTwoPoints;
    }

    public void setTeamTwoPoints(int teamTwoPoints) {
        this.teamTwoPoints = teamTwoPoints;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchDate=" + matchDate +
                ", teamOne='" + teamOne + '\'' +
                ", teamTwo='" + teamTwo + '\'' +
                ", teamOneGoals=" + teamOneGoals +
                ", teamTwoGoals=" + teamTwoGoals +
                ", teamOnePoints=" + teamOnePoints +
                ", teamTwoPoints=" + teamTwoPoints +
                '}';
    }
}