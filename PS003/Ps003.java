package PS003;

import java.util.Scanner;
class Bowler{
    Scanner sc = new Scanner(System.in);
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler(){
        System.out.println("Name = ");
        this.name = sc.nextLine();
        System.out.println("Wickets = ");
        this.wickets = sc.nextInt();
        System.out.println("Matches = ");
        this.matches = sc.nextInt();
        System.out.println("Balls_bowled = ");
        this.balls_bowled = sc.nextInt();
        System.out.println("Runs_conceded = ");
        this.runs_conceded = sc.nextInt();
    }
    public Bowler(String name,int wickets,int matches, int balls_bowled, int runs_conceded){
         this.name = name;
         this.wickets=wickets;
         this.matches=matches;
         this.balls_bowled=balls_bowled;
         this.runs_conceded=runs_conceded;
    }
    void computeBowlingAverage(){
        float bowling_avg = runs_conceded/wickets;
        System.out.println("Name: "+name);
        System.out.println("Bowling_avg = "+bowling_avg);
    }
    void showStatistics(){
        System.out.println("Name = "+name);
        System.out.println("Wickets = "+wickets);
        System.out.println("Matches = "+ matches);
        System.out.println("Balls_bowled = "+balls_bowled);
        System.out.println("Runs_conceded = "+ runs_conceded);

    }
    void computeStrikeRate(){
        float strike_rate = runs_conceded/balls_bowled;
        System.out.println("Name: "+name);
        System.out.println("Strike_rate = "+strike_rate);

    }
    
}
public class Ps003{
    public static void main(String[] args) {
        Bowler b = new Bowler();
        b.computeBowlingAverage();
        b.showStatistics();
        b.computeStrikeRate();
    }
}