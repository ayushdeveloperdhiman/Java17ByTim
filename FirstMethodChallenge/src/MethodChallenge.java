public class MethodChallenge {

    public static void main(String[] args) {

        displayHighScorePosition("Ayush" , calculateHighScorePosition(1500));
        displayHighScorePosition("Shivam" , calculateHighScorePosition(999));
        displayHighScorePosition("Riya" , calculateHighScorePosition(499));
        displayHighScorePosition("Shubham" , calculateHighScorePosition(99));
        displayHighScorePosition("Tarun" , calculateHighScorePosition(-1000));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high" +
                " score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        return (playerScore >= 1000 ? 1 : (playerScore >= 500 ? 2 : (playerScore >= 100 ? 3 : 4)));
    }
}