import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBlackJack {

    @Test
    public void testBlackJack() {
        BlackJack blackjack = new BlackJack();

        int val1 = blackjack.calculateBlackjack(20,10);
        int val2 = blackjack.calculateBlackjack(22,30);
        int val3 = blackjack.calculateBlackjack(22,20);

        assertEquals(val1, 20);
        assertEquals(val2, 0);
        assertEquals(val3, 20);


    }
}
