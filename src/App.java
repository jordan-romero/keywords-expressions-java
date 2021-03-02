public class App {
    public static void main(String[] args) {
       double kilos = (100 * 1.609344); 
       int highScore = 50; 

       if (highScore == 50) {
           System.out.println("This is an expression");
       }

       int myVar = 50; 
       myVar++;
       myVar--; 
       System.out.print(myVar);

       int anotherVar = 50; myVar--; 
       //can be on the same line after a semi-colon 

       boolean gameOver = true; 
       int score = 4000; 
       int levelCompleted = 5; 
       int bonus = 100; 

    //    if (score <  5000 && score > 1000) {
    //        System.out.println("Your score was less than 5000");
    //    } else if (score < 1000) {
    //        System.out.println("less than 1000");
    //    } else {
    //         System.out.println("got here");
    //      }

    if (gameOver == true) {
        int finalScore = score + (levelCompleted * bonus); 
        System.out.println("Your final score was " + finalScore);
    }

    }
}
