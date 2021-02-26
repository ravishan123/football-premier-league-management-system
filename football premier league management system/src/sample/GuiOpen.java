package sample;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.crypto.Data;

import static javafx.application.Application.launch;
import static sample.PremierLeagueManager.allMatchplayedDetail;
import static sample.PremierLeagueManager.allPremierLeagueFootballclub;


public class GuiOpen extends Application{


    public static final String Column1MapKey = "x";
    public static final String Column2MapKey = "y";
    public static final String Column3MapKey = "z";
    public static final String Column4MapKey = "q";
    public static final String Column5MapKey = "p";

    public static final String Column6MapKey = "c";

    public static final String Column7MapKey = "d";
    public static final String Column8MapKey = "e";


    public static final String ColumnAMapKey = "A";
    public static final String ColumnBMapKey = "B";
    public static final String ColumnCMapKey = "C";
    public static final String ColumnDMapKey = "D";
    public static final String ColumnEMapKey = "E";
    public static final String ColumnFMapKey = "F";
    public static final String ColumnGMapKey = "G";

    int count;

    public Button ftSearchBtn = new Button("Search matchers by date");
    public Button ftPointBtn = new Button("Descending order of points");
    public Button ftGoalsBtn = new Button("Descending order of goals");
    public Button ftWinBtn = new Button("Descending order of wins");








    TableView tableView = new TableView<>(generateDataInMap());

    public static void main(String[] args) {
        launch(args);
    }


@Override
    public void start(Stage stage) {
    TableColumn <Map, String> DataofColumn_1 = new TableColumn <>("ID Number");
    TableColumn <Map, String> DataofColumn_2 = new TableColumn <>("Club Name");
    TableColumn <Map, String> DataofColumn_3 = new TableColumn <>("Total Wins");
    TableColumn <Map, String> DataofColumn_4 = new TableColumn <>("Total Defeats");
    TableColumn <Map, String> DataofColumn_5 = new TableColumn <>("Total Draws");
    TableColumn <Map, String> DataofColumn_6 = new TableColumn <>("Total Goals");

    TableColumn <Map, String> DataofColumn_7 = new TableColumn <>("Random Match Genarator");
    TableColumn <Map, String> DataofColumn_8 = new TableColumn <>("Total Matchers");


    final Label labelTItal = new Label("Premier League Club Details");
    labelTItal.setFont(new Font("Arial", 30));


    DataofColumn_1.setCellValueFactory(new MapValueFactory(Column1MapKey));
    DataofColumn_1.setMinWidth(100);


    DataofColumn_2.setCellValueFactory(new MapValueFactory(Column2MapKey));
    DataofColumn_2.setMinWidth(140);

    DataofColumn_3.setCellValueFactory(new MapValueFactory(Column3MapKey));
    DataofColumn_3.setMinWidth(110);

    DataofColumn_4.setCellValueFactory(new MapValueFactory(Column4MapKey));
    DataofColumn_4.setMinWidth(140);


    DataofColumn_5.setCellValueFactory(new MapValueFactory(Column5MapKey));
    DataofColumn_5.setMinWidth(140);

    DataofColumn_6.setCellValueFactory(new MapValueFactory(Column6MapKey));
    DataofColumn_6.setMinWidth(120);

    DataofColumn_7.setCellValueFactory(new MapValueFactory(Column7MapKey));
    DataofColumn_7.setMinWidth(120);

    DataofColumn_8.setCellValueFactory(new MapValueFactory(Column8MapKey));
    DataofColumn_8.setMinWidth(120);


    tableView.setEditable(false);


    tableView.getSelectionModel().setCellSelectionEnabled(true);
    tableView.getColumns().setAll(DataofColumn_1, DataofColumn_2, DataofColumn_3, DataofColumn_4, DataofColumn_5, DataofColumn_6, DataofColumn_7, DataofColumn_8);
    tableView.setMinWidth(973);

    TextField ftSearch = new TextField();
    ftSearch.setPromptText("Enter Date");
    ftSearch.setLayoutX(250);
    ftSearch.setLayoutY(500);


    ftSearchBtn.setLayoutX(450);
    ftSearchBtn.setLayoutY(500);

    ftPointBtn.setLayoutX(550);
    ftPointBtn.setLayoutY(500);


    ftGoalsBtn.setLayoutX(550);
    ftGoalsBtn.setLayoutY(550);


    ftWinBtn.setLayoutX(550);
    ftWinBtn.setLayoutY(600);

    Label labelTotal = new Label("Total  : " + count);
    labelTotal.setLayoutX(50);
    labelTotal.setLayoutY(500);

    Label resultLable = new Label("Result");
    resultLable.setLayoutX(250);
    resultLable.setLayoutY(610);

    Stage primaryStage = new Stage();
    //primaryStage.setTitle("New Customer");
    FlowPane flowPane = new FlowPane();
    flowPane.setHgap(20);
    flowPane.setVgap(20);


    flowPane.setOrientation(Orientation.VERTICAL);



    ftGoalsBtn.setOnAction(new EventHandler <ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            LocalDate startDate = LocalDate.of(2020, 11, 1); //start date
            long start = startDate.toEpochDay();


            LocalDate endDate = LocalDate.of(2021,01,1); //end date
            long end = endDate.toEpochDay();


            long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
            System.out.println(LocalDate.ofEpochDay(randomEpochDay));


            Date date1=null;
            try {
                 date1 = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(LocalDate.ofEpochDay(randomEpochDay)));
            } catch (ParseException e) {
                e.printStackTrace();

            }

            boolean way = true;
            Random rand = new Random();
            int rand_int1 = rand.nextInt(15);

            Random rand2 = new Random();
            int rand_int2 = rand.nextInt(15);


            Random rand3 = new Random();
            int rand_int3 = rand.nextInt(15);


            Random rand4 = new Random();
            int rand_int4 = rand.nextInt(15);

           Collections.shuffle(allPremierLeagueFootballclub);
            String randTeamOne =null;


            for(int i=0; i<1 ;i++){
                randTeamOne = allPremierLeagueFootballclub.get(i).getNameOfTheClube();
               int randgoals = allPremierLeagueFootballclub.get(i).getNumber_of_goals()+rand_int1;
               int randPoint = allPremierLeagueFootballclub.get(i).getNumber_of_points()+rand_int3;




            }
            String randTeamTwo=null;



            Collections.shuffle(allPremierLeagueFootballclub);
            for(int i=0; i<1 ;i++){
                 randTeamTwo = allPremierLeagueFootballclub.get(i).getNameOfTheClube();
                 int randgoalst = allPremierLeagueFootballclub.get(i).getNumber_of_goals()+rand_int2;
                 int randPointt = allPremierLeagueFootballclub.get(i).getNumber_of_points()+rand_int4;


            }

            if (randTeamOne==randTeamTwo){

                Collections.shuffle(allPremierLeagueFootballclub);
                for(int i=0; i<1 ;i++){
                    randTeamTwo = allPremierLeagueFootballclub.get(i).getNameOfTheClube();



                }

            }else{
                System.out.println("Random match generated between Team "+randTeamTwo+" and "+" Team "+randTeamOne +" on " + LocalDate.ofEpochDay(randomEpochDay));
            Match matchRand = new Match(date1,randTeamOne,randTeamTwo,rand_int1,rand_int2,rand_int3,rand_int4);
            allMatchplayedDetail.add(matchRand);

                boolean y = true;

                for (Footballclub footballd : allPremierLeagueFootballclub) {
                    if (footballd.getNameOfTheClube().equals(randTeamOne) && footballd.getNameOfTheClube().equals(randTeamTwo) ) {
                        y = false;
                        System.out.println("Team one founded......");
                        int matchClubgoalsOne = footballd.getNumber_of_goals() + rand_int1;
                        int matchClubPointsOne = footballd.getNumber_of_points() + rand_int3;
                        int matchClubMatchersOne = footballd.getNumber_of_matchers() + 1;

                        footballd.setNumber_of_goals(matchClubgoalsOne);
                        footballd.setNumber_of_matchers(matchClubMatchersOne);
                        footballd.setNumber_of_points(matchClubPointsOne);

                        System.out.println("Team two founded.....");

                        int matchClubgoalsTwo = footballd.getNumber_of_goals() + rand_int2;
                        int matchClubPointsTwo = footballd.getNumber_of_points() + rand_int4;
                        int matchClubMatchersTwo = footballd.getNumber_of_matchers() + 1;

                        footballd.setNumber_of_goals(matchClubgoalsTwo);
                        footballd.setNumber_of_matchers(matchClubMatchersTwo);
                        footballd.setNumber_of_points(matchClubPointsTwo);


                    }

                }
                if (y) {
                    System.out.println("The team one club names you entered does not exist!!!");
                }

                // win defeat count adding

                if (rand_int2 > rand_int1) {
                    boolean q = true;
                    for (Footballclub footballd : allPremierLeagueFootballclub) {
                        if (footballd.getNameOfTheClube().equals(randTeamTwo)) {
                            q = false;
                            System.out.println("Team " + randTeamTwo + " Wins count Updated....");

                            int matchClubTwoWin = footballd.getWins() + 1;
                            footballd.setWins(matchClubTwoWin);


                        }
                    }

                    for (Footballclub footballa : allPremierLeagueFootballclub) {
                        if (footballa.getNameOfTheClube().equals(randTeamOne)) {

                            System.out.println("Team " + randTeamOne + " defeat count Updated.....");

                            int matchClubOneDefe = footballa.getDefeats() + 1;
                            footballa.setDefeats(matchClubOneDefe);

                        }
                    }
                } else if (rand_int1 > rand_int2) {
                    boolean n = true;

                    for (Footballclub footballa : allPremierLeagueFootballclub) {
                        if (footballa.getNameOfTheClube().equals(randTeamOne)) {
                            n = false;
                            System.out.println("Team " + randTeamOne + " Wins count Updated.....");

                            int matchClubOneWin = footballa.getWins() + 1;
                            footballa.setWins(matchClubOneWin);

                        }
                    }

                    for (Footballclub footballf : allPremierLeagueFootballclub) {
                        if (footballf.getNameOfTheClube().equals(randTeamTwo)) {

                            System.out.println("Team " + randTeamTwo + " defeat count Updated.....");

                            int matchClubTwoDefat = footballf.getDefeats() + 1;
                            footballf.setDefeats(matchClubTwoDefat);


                        }
                    }


                } else {
                    for (Footballclub footballf : allPremierLeagueFootballclub) {
                        if (footballf.getNameOfTheClube().equals(randTeamOne)) {

                            System.out.println("Team " + randTeamOne + " draw count updated.....");

                            int matchClubTwoDraw = footballf.getDrows() + 1;
                            footballf.setDrows(matchClubTwoDraw);

                        }
                    }


                    for (Footballclub footballn : allPremierLeagueFootballclub) {
                        if (footballn.getNameOfTheClube().equals(randTeamTwo)) {

                            System.out.println("Team " + randTeamTwo + " draw count updated.....");

                            int matchClubTwoDraw = footballn.getDrows() + 1;
                            footballn.setDrows(matchClubTwoDraw);


                        }
                    }
                }

                // sving data to file

                File file = new File("matchClassDetails.txt");
                FileOutputStream fout = null;
                try {
                    fout = new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                ObjectOutputStream objout = null;
                try {
                    objout = new ObjectOutputStream(fout);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                for(int i = 0; i < allMatchplayedDetail.size(); i++){
                    try {
                        objout.writeObject(allMatchplayedDetail.get(i));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }



            }



        }
    });

    ftSearchBtn.setOnAction(new EventHandler <ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Wirking");
            Button btnEnter = new Button("Enter and Search");

            DatePicker d = new DatePicker();

            StackPane secondaryLayout = new StackPane();

            VBox vbox = new VBox(btnEnter, new Text("Pick your Date"), d);
            vbox.setSpacing(20);
            vbox.setAlignment(Pos.BOTTOM_CENTER);
//            vbox.setPadding(new Insets(15));


            //Match Data Table
            TableColumn<Map, String> ColumnA = new TableColumn<>("Date");
            TableColumn<Map, String> ColumnB = new TableColumn<>("Team One");
            TableColumn<Map, String> ColumnC = new TableColumn<>("Team One goals");
            TableColumn<Map, String> ColumnD = new TableColumn<>("Team One points");
            TableColumn<Map, String> ColumnE = new TableColumn<>("Team Two");
            TableColumn<Map, String> ColumnF= new TableColumn<>("Team Two goals");
            TableColumn<Map, String> ColumnG = new TableColumn<>("Team Two points");

            ColumnA.setCellValueFactory(new MapValueFactory(ColumnAMapKey));
            ColumnA.setMinWidth(130);
            ColumnB.setCellValueFactory(new MapValueFactory(ColumnBMapKey));
            ColumnB.setMinWidth(130);

            ColumnC.setCellValueFactory(new MapValueFactory(ColumnCMapKey));
            ColumnC.setMinWidth(130);
            ColumnD.setCellValueFactory(new MapValueFactory(ColumnDMapKey));
            ColumnD.setMinWidth(130);

            ColumnE.setCellValueFactory(new MapValueFactory(ColumnEMapKey));
            ColumnE.setMinWidth(130);
            ColumnF.setCellValueFactory(new MapValueFactory(ColumnFMapKey));
            ColumnF.setMinWidth(130);


            ColumnG.setCellValueFactory(new MapValueFactory(ColumnGMapKey));
            ColumnG.setMinWidth(130);


            TableView tablem_view = new TableView<>(generateDataInMap());


            tablem_view.setEditable(false);
            tablem_view.getSelectionModel().setCellSelectionEnabled(false);
            tablem_view.getColumns().setAll(ColumnA, ColumnB,ColumnC,ColumnD,ColumnE, ColumnF,ColumnG);








            VBox vbox2 = new VBox(tablem_view);


            Scene secondScene = new Scene(secondaryLayout, 700, 900);


            Stage newWindow = new Stage();

            newWindow.setScene(secondScene);


            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100);
            secondaryLayout.getChildren().addAll(vbox2,vbox);

            newWindow.show();



            btnEnter.setOnAction(new EventHandler <ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //Table







                    DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern( "yyyy-MM-dd" );
                    LocalDateTime todayDATETIME = LocalDateTime.now();
                    String formattedDateOfToday = todayDATETIME.format(dateOnly);

                    LocalDate dateofEnter =d.getValue();
                    System.out.println(dateofEnter);


//                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date date1 = null;
                    try {
                        date1 = new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(d.getValue()));

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    System.out.println(date1);

                    boolean x = true;
                    for (Match match : allMatchplayedDetail) {
                        if (match.getMatchDate().equals(date1)) {

                            x = false;




                                ObservableList <Map> allsData = FXCollections.observableArrayList();




                                for (Match footballclub : allMatchplayedDetail){


                                    Map<String, String> dataRow = new HashMap<>();


                                    dataRow.put(ColumnAMapKey, String.valueOf(footballclub.getMatchDate()));
                                    dataRow.put(ColumnBMapKey, String.valueOf(footballclub.getTeamOne()));
                                    dataRow.put(ColumnCMapKey, String.valueOf(footballclub.getTeamOneGoals()));
                                    dataRow.put(ColumnDMapKey, String.valueOf(footballclub.getTeamOnePoints()));
                                    dataRow.put(ColumnEMapKey, String.valueOf(footballclub.getTeamTwo()));
                                    dataRow.put(ColumnFMapKey, String.valueOf(footballclub.getTeamOneGoals()));
                                    dataRow.put(ColumnGMapKey, String.valueOf(footballclub.getTeamOnePoints()));
                                    count+=1;

                                    allsData.add(dataRow);

                                }


                        }
                    }
                    if (x) {
                        System.out.println("The club name you entered does not exist!");

                    }


                }

            });



//            String sDate =ftSearch.getText();
//            DatePicker d = new DatePicker();


        }
    });






    final VBox vbox = new VBox();
    Scene scene = new Scene(new Group(), 1000, 1000);
    stage.setTitle("FOOTBALL PREMIER LEAGUE MANAGER");
    stage.setWidth(1200);
    stage.setHeight(800);
    stage.setResizable(false);

    vbox.setSpacing(5);
    vbox.setMinSize(700, 600);

    vbox.setPadding(new Insets(10, 10, 10, 10));


    vbox.getChildren().addAll(labelTItal, tableView);

    ((Group) scene.getRoot()).getChildren().addAll(vbox, ftSearch, ftSearchBtn, labelTotal, resultLable,ftGoalsBtn);




    stage.setScene(scene);

    stage.show();

}


    private ObservableList<Map> generateDataInMap() {

        ObservableList <Map> allData = FXCollections.observableArrayList();




        for (Footballclub footballclub : allPremierLeagueFootballclub){


            Map<String, String> dataRow = new HashMap<>();


            dataRow.put(Column1MapKey, String.valueOf(footballclub.getClubId()));
            dataRow.put(Column2MapKey, String.valueOf(footballclub.getNameOfTheClube()));
            dataRow.put(Column3MapKey, String.valueOf(footballclub.getWins()));
            dataRow.put(Column4MapKey, String.valueOf(footballclub.getDefeats()));
            dataRow.put(Column5MapKey, String.valueOf(footballclub.getDrows()));
            dataRow.put(Column6MapKey, String.valueOf(footballclub.getNumber_of_goals()));
            dataRow.put(Column7MapKey, String.valueOf(footballclub.getNumber_of_points()));
            dataRow.put(Column8MapKey, String.valueOf(footballclub.getNumber_of_matchers()));
            count+=1;

            allData.add(dataRow);

        }
        return allData;


    }


}



