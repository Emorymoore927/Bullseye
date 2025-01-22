
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReading {

    //Array with the coordinates of each player's throws
    double[][] coordinates;

    double throw1, throw2, score1, score2;

    double playerOne;

    double playerTwo;
    Score s = new Score();

    int game = 1;

    //Number of rows to initialize coordinates array
    int rows = 0;

    /**
     * Reads each file storing all the coordinates into the coordinates array
     *
     * @thrown Exception
     */

    public void read() throws Exception {

        Scanner fileScan;
        fileScan = new Scanner(new File("H:\\My Drive\\emory.moore@pop.belmont.edu 2022-11-02 23 57\\Belmont\\Sophomore\\Second Semester\\Programming II\\TestBullseye\\games.txt"));

        //Temporary array to store coordinates
        List<Double> array = new ArrayList<>();

        coordinates = new double[6][2];

        while (fileScan.hasNext() == true) {
            array.add(fileScan.nextDouble());
            rows++;
        }

        int index = 0;

        //Coordinates are stored in coordinates array.
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = array.get(index);
                playerOne = coordinates[i][j];
                playerTwo = coordinates[i][j];

                throw1 = getThrow1(i,j);
                throw2 = getThrow2(i,j);
                //score1=getScore1(i,j);
                //score2=getScore2(i,j);

                //double previousScore=score1;
               // double currentScore= previousScore + score1;


                //ORIGINAL SOLUTION TO PRINT FIRST LINE OF COORDINATES
                /*if (index < 6) {
                    playerOne = coordinates[i][j];
                    //System.out.println("Player 1: " + playerOne);
                    //System.out.println("Player 1 score:" +  s.score1(x,y)); //uncomment to see score

                } else if (index >= 6) {
                    playerTwo = coordinates[i][j];
                    //System.out.println("Player 2: " + playerTwo);
                    //s.score1(playerTwo,playerTwo); //uncomment to see score
                }*/

                //Printing each player's first 6 throws. NEW SOLUTION
                if (index < 2) {
                    System.out.println("Player 1 throw: " + playerOne);
                    //ERROR-MISMATCH
                    //HOW TO FIND THE TOTAL SCORE??
                    //double x= fileScan.nextDouble();
                    //double y= fileScan.nextDouble();
                    //s.playerArray(x, y);
                    //System.out.println("Player 1 score:" + s.score1(playerOne, playerOne));

                }

                if (index >= 2 && index < 4) {
                    System.out.println("Player 1 throw: " + playerOne);
                    //System.out.println("Player 1 score:" + s.score1(playerOne, playerOne));

                }

                if (index >= 4 && index < 6) {
                    System.out.println("Player 1 throw: " + playerOne);
                    //System.out.println("Player 1 score:" + s.score1(playerOne, playerOne));
                }

                if (index > 5 && index < 8) {
                    System.out.println("Player 2 throw: " + playerTwo);
                    //System.out.println("Player 2 score:" + s.score1(playerTwo, playerTwo));
                }

                if (index >= 8 && index < 10) {
                    System.out.println("Player 2 throw: " + playerTwo);
                    //System.out.println("Player 2 score:" + s.score1(playerTwo, playerTwo));
                }

                if (index >= 10 && index < 13) {
                    System.out.println("Player 2 throw: " + playerTwo);
                    //System.out.println("Player 2 score:" + s.score1(playerTwo, playerTwo));
                }
                index++;
            }
        }

        //ATTEMPT: CREATE THE GAMES.
        for (int a = 0; a < coordinates.length / 2; a++) {
            int game = a + 1;

            System.out.println("Game: " + game);
        }
    }

    /**
     * Returns the coordinates array.
     *
     * @return array of coordinates
     */
    public double[][] getCoordinates() {
        return coordinates;
    }

    public double getThrow1(double row,double col) {
        return row;
    }

    public double getThrow2(double r, double c) {
        return c;
    }

    public double getScore1(double x, double y){
        score1=s.score1(x,y);
        return score1;
    }

    public double getScore2(double x, double y) {
        score2 = s.score1(x, y);
        return score2;
    }
}









//ATTEMPT: DIVIDE THE COORDINATES INTO THE GAME. IT ONLY WORKS FOR PLAYER ONE'S FIRST THROW

/*for (int a = 0; a < coordinates.length / 2; a++) {
        int game = a + 1;
        //System.out.println("Game: " + game);

        if (game == 1) {
            System.out.println("Game: " + game);

            for (int i = 0; i < coordinates.length; i++) {
                for (int j = 0; j < coordinates[i].length; j++) {
                    coordinates[i][j] = array.get(index);
                    playerOne = coordinates[i][j];
                    playerTwo = coordinates[i][j];
                }
            }

            if (index < 2) {
                System.out.println("Player 1 throw: " + playerOne);
            }

            if (index > 5 && index < 8) {
                System.out.println("Player 2 throw: " + playerTwo);
            }
        }

        if (game==2){
            System.out.println("Game: " + game);
            for (int i = 0; i < coordinates.length; i++) {
                for (int j = 0; j < coordinates[i].length; j++) {
                    coordinates[i][j] = array.get(index);
                    playerOne = coordinates[i][j];
                    playerTwo = coordinates[i][j];
                }
            }
            if (index >= 2 && index < 4) {
                System.out.println("Player 1 throw: " + playerOne);
            }

            if (index >= 8 && index < 10) {
                System.out.println("Player 2 throw: " + playerTwo);
            }
        }

        if (game==3){
            System.out.println("Game: " + game);
            for (int i = 0; i < coordinates.length; i++) {
                for (int j = 0; j < coordinates[i].length; j++) {
                    coordinates[i][j] = array.get(index);
                    playerOne = coordinates[i][j];
                    playerTwo = coordinates[i][j];
                }
            }

            if (index >= 4 && index < 6) {
                System.out.println("Player 1 throw: " + playerOne);
            }

            if (index >= 10 && index < 13) {
                System.out.println("Player 2 throw: " + playerTwo);
            }
        }
    }
}*/








//ATTEMPT: CREATE A METHOD THAT KEEPS TRACK OF GAMES.
//PROBLEM: THE SCOPE OF THE PLAYER'S COORDINATES IS WITHIN THE READ METHOD.
/*public void play() {
        int index = 0;
        //Printing out the throws and scores for each player per game.
        for (int a = 0; a < coordinates.length / 2; a++) {
            int game = a + 1;

            System.out.println("Game: " + game);

            if (index < 2) {
                System.out.println("Player 1 throw: " + playerOne);
                //System.out.println("Player two throw: " + playerTwo);
            }
        }
    }*/

