import java.util.Scanner;

public class Run_Bullseye {

    public static void main(String[] args) throws Exception {

        Scanner scan= new Scanner("games.txt");
        Scanner scan1= new Scanner(System.in);

        Score theScore = new Score();
        FileReading f= new FileReading();

        f.getCoordinates();


        f.read();
        //f.play();

            System.out.println("Enter throw for Player 1:");
            double player1x = scan1.nextDouble();
            System.out.println("Enter throw for Player 1:");
            double player1y = scan1.nextDouble();


            System.out.println("Enter throw for Player 2:");
            double player2x = scan1.nextDouble();
            System.out.println("Enter throw for Player 2:");
            double player2y = scan1.nextDouble();


            f.getThrow1(player1x, player1y);
            f.getThrow2(player2x, player2y);

            double player1Total = theScore.score1(player1x, player1y) + theScore.score1(player1x, player1y);
            double player2Total = theScore.score1(player2x, player2y) + theScore.score1(player2x, player2y);


            // theScore.score=3;
            System.out.println("Player 1 total score: " + (player1Total));
            System.out.println("Player 2 total score: " + player2Total);
            System.out.println(theScore.deterWinner(player1Total, player2Total));
        }
        //System.out.println(theScore.deterWinner(theScore.score1(player1x, player1y),theScore.score1(player2x, player2y)));
        //System.out.println(theScore.deterWinner(player1Total,player2Total));
       //System.out.println(theScore.deterWinner(theScore.score1(player1x, player1y),theScore.score1(player2x,player2y)));
}
