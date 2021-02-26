package sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public interface LeagueManager {
    void addFootballClub();

    void deleteSportsClub();

    void searchOneClub();

    void allClubTable();

    void savefileData() throws IOException;

    void loadDate() throws IOException, ClassNotFoundException;

    void updateDetails() throws ParseException, IOException;

    void allMatchPlayedData();
    void loadMatchData();

    void OpenGUI();





}
