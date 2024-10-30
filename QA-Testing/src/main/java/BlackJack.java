public class Blackjack {

    public void playGame(int num1, int num2) {
        int result = calculateBlackjack(num1, num2);
        System.out.println("Result: " + result);
    }

    public int calculateBlackjack(int num1, int num2) {
        if (num1 > 21 && num2 > 21) {
            return 0;
        } else if (num1 > 21) {
            return num2;
        } else if (num2 > 21) {
            return num1;
        } else {
            return Math.max(num1, num2);
        }
    }

    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();

        // Example inputs
        int num1 = 18;  // Replace with any integer
        int num2 = 22;  // Replace with any integer

        blackjack.playGame(num1, num2);
    }
}
