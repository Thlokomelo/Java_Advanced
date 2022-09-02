/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccerleagueapp2;

/*
Application uses Java SE reading into a data structure (ArrayList and HashMap) to calculate 
the ranking table for a soccer league.
The input and output will be text. The input contains results of games, one per line.

Rules of the game are as follows:
A draw (tie) is worth 1 point, a win is worth 3 points and a loss is worth 0 points.
If two or more teams have the same number of points, they should have the same rank and be 
printed in alphabetical order.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class SoccerLeagueApp2 {

   
    public static void main(String[] args)
            throws IOException {                                                // Throws included to handle exceptions
        File file = new File(                                                   //creates the txt file path for the bufferReader
                "C:\\Users\\thlok\\Documents\\7. Java Advanced\\SoccerLeageApp2"
                        + "\\src\\soccerleagueapp2\\SoccerLeague.txt");

        BufferedReader br
                = new BufferedReader(new FileReader(file));                     //reads from the txt file

        String line;                                                            //declares variable line as a String

        HashMap<String, Results> teamResults = new HashMap<>();                 //creates hashmap to store team names and their results

        while ((line = br.readLine()) != null) {                                //while loop determines match scores
            String[] data = line.split(" ");                                    //Splits data by a space
            Results team1 = teamResults.getOrDefault(data[0], new Results());   //getOrDefault method used to collect mapped values from the hashmap
            Results team2 = teamResults.getOrDefault(data[2], new Results());   //getOrDefault method used to collect mapped values from the hashmap

            if (Integer.valueOf(data[1]) > Integer.valueOf(data[3])) {          //allocates wins as per the results
                team1.addWin();                                                 //adds points to the team
                //team2.addlost();
            }

            teamResults.put(data[0], team1);
            //teamResults.put(data[2], team2);

            if (Objects.equals(Integer.valueOf(data[1]), Integer.valueOf(data[3]))) {     //allocates draws as per the results
                team1.adddraw();                                                //adds points to the team
                team2.adddraw();                                                //adds points to the team
            }
            teamResults.put(data[0], team1);                                    //puts data into hashmap                               
            teamResults.put(data[2], team2);                                    //puts data into hashmap 
        }
        List<Teamlog> teamlog = new ArrayList<>();                              //creates List array to store data for printing
        
        for (String team : teamResults.keySet()) {                              //For loop
            Results teamres = teamResults.get(team);

            int points = teamres.wins * 3 + teamres.draws * 1;                  //variable assigned to calculate FinalPoints for each team

            teamlog.add(new Teamlog(team, points));                             //data added to the List Array

        }
        Collections.sort(teamlog, Teamlog.TeamPointsCompare);                   //Collections method used to sort data
        
        for(Teamlog team : teamlog){                                            //For loop to print sorted data
            System.out.println(team);
        }
    }

    private static class Teamlog {                                              //Teamlog Class with 2 variables

        private String teamName;
        private int teamPoints;

        public int getTeamPoints() {
            return teamPoints;
        }

        public String getTeams() {
            return teamName;

        }

        public static Comparator<Teamlog> TeamPointsCompare = new Comparator<Teamlog>() {  // Comparator method for sorting Results per TeamPoints
            public int compare(Teamlog t1, Teamlog t2) {
                int teamno1 = t1.getTeamPoints();
                int teamno2 = t2.getTeamPoints();

                return teamno2 - teamno1;
            }
        };

        @Override
        public String toString() {
            return teamName + " " + teamPoints;
        }

        public Teamlog(String teamName, int teamPoints) {                      // Teamlog constructor
            this.teamName = teamName;
            this.teamPoints = teamPoints;
        }

       
    }
     private static class Results {                                             //Results Class

            int wins = 0;
            private int looses = 0;
            int draws = 0;

            public void addWin() {
                wins++;
            }

            public void addlost() {
                looses++;
            }

            public void adddraw() {
                draws++;

            }
        }
}


