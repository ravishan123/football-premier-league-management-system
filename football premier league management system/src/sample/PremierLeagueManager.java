package sample;

import javafx.application.Application;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PremierLeagueManager implements LeagueManager{


    public static List <Footballclub> allPremierLeagueFootballclub = new ArrayList<>();
    public static List<Match> allMatchplayedDetail = new ArrayList <>();
    private static final int MAX_COUNT =100;
    Scanner sc = new Scanner(System.in);





    @Override
    public void updateDetails() throws ParseException, IOException {






        System.out.println(allMatchplayedDetail);








        System.out.println("Enter Match Date [DD/MM/YYYY] :");
        String MatchDate = sc.next();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(MatchDate);

        System.out.println("----------Team one details--------\n");
        System.out.println("Enter name of football team one : ");
        sc.nextLine();
        String temOne = sc.nextLine();

        System.out.println("Enter team one goals:");
        int teamOneGoals = sc.nextInt();

        System.out.println("Enter team one points:");
        int teamOnepoints = sc.nextInt();

        System.out.println("----------Team two details---------\n");
        System.out.println("Enter name of football team two : ");
        sc.nextLine();
        String temTwo = sc.nextLine();

        System.out.println("Enter team two goals:");
        int teamTwoGoals = sc.nextInt();

        System.out.println("Enter team one points:");
        int teamTwopoints = sc.nextInt();


        //Updating team one goals points

        boolean y = true;



    for (Footballclub footballd : allPremierLeagueFootballclub) {
        if (footballd.getNameOfTheClube().equals(temOne) && footballd.getNameOfTheClube().equals(temTwo) ) {
            y = false;
            System.out.println("Team one founded......");
            int matchClubgoalsOne = footballd.getNumber_of_goals() + teamOneGoals;
            int matchClubPointsOne = footballd.getNumber_of_points() + teamOnepoints;
            int matchClubMatchersOne = footballd.getNumber_of_matchers() + 1;

            footballd.setNumber_of_goals(matchClubgoalsOne);
            footballd.setNumber_of_matchers(matchClubMatchersOne);
            footballd.setNumber_of_points(matchClubPointsOne);

            System.out.println("Team two founded.....");

            int matchClubgoalsTwo = footballd.getNumber_of_goals() + teamTwoGoals;
            int matchClubPointsTwo = footballd.getNumber_of_points() + teamTwopoints;
            int matchClubMatchersTwo = footballd.getNumber_of_matchers() + 1;

            footballd.setNumber_of_goals(matchClubgoalsTwo);
            footballd.setNumber_of_matchers(matchClubMatchersTwo);
            footballd.setNumber_of_points(matchClubPointsTwo);


        }

    }
    if (y) {
        System.out.println("The team one club names you entered does not exist!!!");
    }




        Match matchplayed = new Match(date1,temOne,temTwo,teamOneGoals,teamTwoGoals,teamOnepoints,teamTwopoints);
        allMatchplayedDetail.add(matchplayed);



// win defeat count adding

        if (teamTwoGoals > teamOneGoals) {
            boolean q = true;
            for (Footballclub footballd : allPremierLeagueFootballclub) {
                if (footballd.getNameOfTheClube().equals(temTwo)) {
                    q = false;
                    System.out.println("Team " + temTwo + " Wins count Updated....");

                    int matchClubTwoWin = footballd.getWins() + 1;
                    footballd.setWins(matchClubTwoWin);


                }
            }

            for (Footballclub footballa : allPremierLeagueFootballclub) {
                if (footballa.getNameOfTheClube().equals(temOne)) {

                    System.out.println("Team " + temOne + " defeat count Updated.....");

                    int matchClubOneDefe = footballa.getDefeats() + 1;
                    footballa.setDefeats(matchClubOneDefe);

                }
            }
        } else if (teamOneGoals > teamTwoGoals) {
                    boolean n = true;

                    for (Footballclub footballa : allPremierLeagueFootballclub) {
                        if (footballa.getNameOfTheClube().equals(temOne)) {
                            n = false;
                            System.out.println("Team " + temOne + " Wins count Updated.....");

                            int matchClubOneWin = footballa.getWins() + 1;
                            footballa.setWins(matchClubOneWin);

                        }
                    }

            for (Footballclub footballf : allPremierLeagueFootballclub) {
                if (footballf.getNameOfTheClube().equals(temTwo)) {

                    System.out.println("Team " + temTwo + " defeat count Updated.....");

                    int matchClubTwoDefat = footballf.getDefeats() + 1;
                    footballf.setDefeats(matchClubTwoDefat);


                }
            }


        } else {
                for (Footballclub footballf : allPremierLeagueFootballclub) {
                                if (footballf.getNameOfTheClube().equals(temOne)) {

                                    System.out.println("Team " + temTwo + " draw count updated.....");

                                    int matchClubTwoDraw = footballf.getDrows() + 1;
                                    footballf.setDrows(matchClubTwoDraw);

                                }
                            }


            for (Footballclub footballn : allPremierLeagueFootballclub) {
                if (footballn.getNameOfTheClube().equals(temTwo)) {

                    System.out.println("Team " + temTwo + " draw count updated.....");

                    int matchClubTwoDraw = footballn.getDrows() + 1;
                    footballn.setDrows(matchClubTwoDraw);


                }
            }
                        }

        // sving data to file

        File file = new File("matchClassDetails.txt");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        for(int i = 0; i < allMatchplayedDetail.size(); i++){
            objout.writeObject(allMatchplayedDetail.get(i));
        }





    }




    @Override
    public  void addFootballClub(){
        Scanner input = new Scanner(System.in);
        System.out.println(allPremierLeagueFootballclub);
        System.out.println("*********************** Add a new club *****************");
        System.out.println("Enter a for school club");
        System.out.println("Enter b for university club");
        System.out.println("Enter c for normal club");
        System.out.print("\nEnter your choice :");

        String choice = input.next();



        switch (choice) {
            case "A":
            case "a":

                try {
                    System.out.println("Enter ID number : ");
                    double preClubId = sc.nextDouble();

                    System.out.println("Enter name of football club : ");
                    sc.nextLine();
                    String preClubName = sc.nextLine();

                    System.out.println("Enter School name : ");

                    sc.nextLine();
                    String preSclName = sc.nextLine();


                    System.out.println("Enter location name: ");
                    sc.nextLine();
                    String preSclLocation = sc.nextLine();

                    System.out.println("Enter location address: ");
                    sc.nextLine();
                    String preSclAddress = sc.nextLine();

                    System.out.println("Enter  contact number:");
                    int preSclNumber = sc.nextInt();

                    System.out.println("Enter Wins: ");
                    int preSclWins = sc.nextInt();

                    System.out.println("Enter drows:");
                    int preScldrows = sc.nextInt();

                    System.out.println("Enter defeats: ");
                    int preScldefeats = sc.nextInt();

                    System.out.println("Enter number Of total goals: ");
                    int preSclgoals = sc.nextInt();

                    System.out.println("Enter number of points: ");
                    int preSclpoints = sc.nextInt();

                    System.out.println("Enter number of matchers played: ");
                    int preSclmatchers = sc.nextInt();

                    SchoolFootballClub schoolfootballclub = new SchoolFootballClub(preClubName, preClubId, preSclLocation, preSclNumber, preSclAddress, preSclWins, preScldrows, preScldefeats, preSclgoals, preSclpoints, preSclmatchers, preSclName);
                    allPremierLeagueFootballclub.add(schoolfootballclub);

                    System.out.println("You have successfully added all the details.");
                }catch ( Exception e){
                    System.out.println("something is wrong with input enter again");
                    break;
                }



                break;
            case "B":
            case "b":
                try {


                    System.out.println("Enter ID number: ");
                    double unipreClubId = sc.nextDouble();

                    System.out.println("Enter name of football club:");
                    sc.nextLine();
                    String unipreClubName = sc.nextLine();

                    System.out.println("Enter university  name: ");
                    sc.nextLine();
                    String unipreName = sc.nextLine();

                    System.out.println("Enter location name: ");
                    sc.nextLine();
                    String unipreLocation = sc.nextLine();

                    System.out.println("Enter location address: ");
                    sc.nextLine();
                    String unipreAddress = sc.nextLine();

                    System.out.println("Enter  contact number: ");
                    int unipreNumber = sc.nextInt();

                    System.out.println("Enter Wins: ");
                    int unipreWins = sc.nextInt();

                    System.out.println("Enter drows: ");
                    int unipredrows = sc.nextInt();

                    System.out.println("Enter defeats: ");
                    int unipredefeats = sc.nextInt();

                    System.out.println("Enter number Of total goals: ");
                    int unipregoals = sc.nextInt();

                    System.out.println("Enter number of points: ");
                    int uniprepoints = sc.nextInt();

                    System.out.println("Enter number of matchers played: ");
                    int uniprematchers = sc.nextInt();

                    UniversityFootballclub universityfootballclub = new UniversityFootballclub(unipreClubName, unipreClubId, unipreLocation, unipreNumber, unipreAddress, unipreWins, unipredrows, unipredefeats, unipregoals, uniprepoints, uniprematchers, unipreName);

                    allPremierLeagueFootballclub.add(universityfootballclub);

                    System.out.println("You have successfully added all the details.");

                }catch (Exception e){
                    System.out.println("something is wrong with input enter again " +e);
                    break;
                }


                break;


            case "c":
            case "C":

                try {


                    System.out.println("Enter ID number :");
                    double norpreClubId = sc.nextDouble();

                    System.out.println("Enter name of football club:");
                    sc.nextLine();
                    String norpreClubName = sc.nextLine();

                    System.out.println("Enter location name: ");
                    sc.nextLine();
                    String norpreLocation = sc.nextLine();

                    System.out.println("Enter location address:");
                    sc.nextLine();
                    String norpreAddress = sc.nextLine();

                    System.out.println("Enter  contact number: ");

                    int norpreNumber = sc.nextInt();

                    System.out.println("Enter Wins:");
                    int norpreWins = sc.nextInt();

                    System.out.println("Enter drows:");
                    int norpredrows = sc.nextInt();

                    System.out.println("Enter defeats:");
                    int norpredefeats = sc.nextInt();

                    System.out.println("Enter number Of total goals: ");
                    int norpregoals = sc.nextInt();

                    System.out.println("Enter number of points: ");
                    int norprepoints = sc.nextInt();

                    System.out.println("Enter number of matchers played: ");
                    int norprematchers = sc.nextInt();

                    Footballclub pre_footballclub = new Footballclub(norpreClubName, norpreClubId, norpreLocation, norpreNumber, norpreAddress, norpreWins, norpredrows, norpredefeats, norpregoals, norprepoints, norprematchers);
                    allPremierLeagueFootballclub.add(pre_footballclub);

                    System.out.println("\n\n You have successfully added all the details.");
                }catch (Exception e){

                    System.out.println("something is wrong with input enter again");
                    break;
                }

                break;
        }

    }

    @Override
    public void deleteSportsClub (){

        System.out.print("Please enter the Id number  you want to delete :");
        String nameOFClub =sc.next();
        boolean way = true;
        for (int j = 0 ; j < allPremierLeagueFootballclub.size();j++){
            if(allPremierLeagueFootballclub.get(j).getNameOfTheClube().equals(nameOFClub)){
                allPremierLeagueFootballclub.remove(j);
                way=false;
                System.out.println(nameOFClub+" Record has been successfully deleted");
            }
        }

    }
    //    find a single club
    @Override
    public void searchOneClub(){


            System.out.println("****************************** Search a Club **********************************\n\n");
            System.out.print("Enter Club Id Number:");
            String clubSeaName = sc.next();
            System.out.println("\n");

            boolean x = true;
            for (Footballclub football : allPremierLeagueFootballclub) {
                if (football.getNameOfTheClube().equals(clubSeaName)) {
                    x = false;

                    Double idOfclub = football.getClubId();
                    String clubName = football.getNameOfTheClube();
                    int clubWins = football.getWins();
                    int cludefeat = football.getDefeats();
                    int clubgoals = football.getNumber_of_goals();
                    int clubDrows = football.getDrows();
                    int clubPoints = football.getNumber_of_points();
                    int clubMatchers = football.getNumber_of_matchers();


                    String formatTable = "\t|%1$-30s|%2$-30s|%3$-20s|%4$-20s|%5$-20s|%6$-20s|%7$-20s|%8$-20s|%n";
                    String lineAlignFormat = "\t+%1$-30s+%2$-30s+%3$-20s+%4$-20s+%5$-20s+%6$-20s+%7$-20s+%8$-20s+%n";


                    System.out.format(lineAlignFormat, "------------------------------", "------------------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");


                    System.out.format(formatTable, "ID Number", "Club Name ", "Total Wins", "Total Defeats", "Total Drows", "Total Goals", "Total Points", "Total Matchers");
                    System.out.format(lineAlignFormat, "------------------------------", "------------------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");

                    System.out.format(formatTable, idOfclub, clubName, clubWins, cludefeat, clubDrows, clubgoals, clubPoints, clubMatchers);
                    System.out.format(lineAlignFormat, "------------------------------", "------------------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");

                }
            }
            if (x) {
                System.out.println("The club name you entered does not exist!");
                
            }
            System.out.println("inside the loop");


    }
    @Override
    public void  allClubTable() {

        allPremierLeagueFootballclub.sort(Comparator.comparing(Footballclub::getNumber_of_points).reversed());
        String leftAlignFormat = "\t|%1$-30s|%2$-30s|%3$-20s|%4$-20s|%5$-20s|%6$-20s|%7$-20s|%8$-20s|%n";
        String lineAlignFormat = "\t+%1$-30s+%2$-30s+%3$-20s+%4$-20s+%5$-20s+%6$-20s+%7$-20s+%8$-20s+%n";


        System.out.format(lineAlignFormat,"------------------------------","------------------------------","--------------------","--------------------","--------------------","--------------------","--------------------","--------------------");
        System.out.format(leftAlignFormat, "ID Number", "Club Name ", "Total Wins","Total Defeats","Total Drows","Total Goals","Total Points","Total Matchers");
        System.out.format(lineAlignFormat,"------------------------------","------------------------------","--------------------","--------------------","--------------------","--------------------","--------------------","--------------------");

        for (Footballclub footballclub : allPremierLeagueFootballclub){
            System.out.format(leftAlignFormat,footballclub.getClubId() , footballclub.getNameOfTheClube(), footballclub.getWins(),footballclub.getDefeats(), footballclub.getDrows(),footballclub.getNumber_of_goals(),footballclub.getNumber_of_points(),footballclub.getNumber_of_matchers());
            System.out.format(lineAlignFormat,"------------------------------","------------------------------","--------------------","--------------------","--------------------","--------------------","--------------------","--------------------");

     }

    }


//load match data from file

    @Override
    public  void loadMatchData() {
        try{

            FileInputStream fileIn = new FileInputStream("matchClassDetails.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            while(true){
                Match matchobj = (Match) objectIn.readObject();
                allMatchplayedDetail.add(matchobj);

            }

        }catch (Exception e){
            System.out.println("_______________________");
        }
    }

    //match data table method

    @Override
    public void  allMatchPlayedData() {


        String leftAlignFormat = "\t|%1$-30s|%2$-30s|%3$-30s|%n";
        String lineAlignFormat = "\t+%1$-30s+%2$-30s+%3$-30s+%n";


        System.out.format(lineAlignFormat,"------------------------------","------------------------------","------------------------------");
        System.out.format(leftAlignFormat, "Date Played", "Team One ", "Tem Two","Total Defeats","Total Drows","Total Goals","Total Points","Total Matchers");
        System.out.format(lineAlignFormat,"------------------------------","------------------------------","------------------------------");

        for (Match MatchTeam : allMatchplayedDetail){
            System.out.format(leftAlignFormat,MatchTeam.getMatchDate(),MatchTeam.getTeamOne(),MatchTeam.getTeamTwo());
            System.out.format(lineAlignFormat,"------------------------------","------------------------------","------------------------------");

        }

    }

    @Override
    public void savefileData() throws IOException {

        File file = new File("time.txt");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        for(int i = 0; i < allPremierLeagueFootballclub.size(); i++){
            objout.writeObject(allPremierLeagueFootballclub.get(i));
        }





    }




//Load data about teams


    @Override

        public void loadDate ()throws IOException, ClassNotFoundException {

            try{

                FileInputStream fileIn = new FileInputStream("time.txt");
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                while(true){
                    Footballclub obj = (Footballclub) objectIn.readObject();
                    allPremierLeagueFootballclub.add(obj);

                }

            }catch (Exception e){
                System.out.println("Club data didn't read!");
            }

        }

        @Override
    public void OpenGUI(){
        try{
            Application.launch(GuiOpen.class);
        }catch (IllegalStateException e){

            System.out.println(e);
        }
        }



}





