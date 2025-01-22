import java.util.ArrayList;

public class Score {
    double[][] scoreArray;

    double score;

    //The coordinate value
    int value=0;

    double radius=0;

    double playerOne;

    double playerTwo;

    public void playerArray(double x, double y){
       for (int i= 0; i<scoreArray.length; i++ ){
           for (int j=0; j< scoreArray[i].length; j++){
               if (scoreArray.length<= 6){ //value<=6
                   playerOne= scoreArray[i][j];
               } else{
                   playerTwo= scoreArray[i][j];
               }
           }
       }
    }

    public double score1(double x , double y){
        radius= Math.sqrt((x*x)+ (y*y));
        if (radius <= 4){
            score= 100;
        }

        else if (radius >4 && radius <= 8 ){
            score=80;
        }

        else if (radius >8 && radius<=12){
            score= 60;
        }

        else if (radius>12 && radius <=16 ){
            score= 40;
        }

        else if (radius >16 && radius <= 20 ){
            score = 20;
        }
        return score;
    }

    public double score(){
        if (value <= 4){
            score= 100;
        }

        else if (value >4 && value <= 8 ){
            score=80;
        }

        else if (value >8 && value<=12){
            score= 60;
        }

        else if (value>12 && value <=16 ){
            score= 40;
        }

        else if (value >16 && value <= 20 ){
            score = 20;
        }
        return score;
    }

    public double deterWinner(double p1score , double p2score){
        if (p1score > p2score) {
            System.out.println("Player one wins.");
        }

        else if (p1score==p2score) {
            System.out.println("The players tie.");

        } else if (p2score > p1score){
            System.out.println("Player two wins.");
        }

        return 0;
    }
}
