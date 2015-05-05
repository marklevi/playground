import java.util.List;

import static java.lang.String.format;

public class PossibilityCounter {
    public int change_possibilities_top_down(int amountLeft, List<Integer> denominationsLeft) {
        if (amountLeft == 0) return 1;
        if (amountLeft < 0) return 0;

        if (denominationsLeft.size() == 0) return 0;

        System.out.println(format("checking ways to make %d with %s", amountLeft, denominationsLeft));

        final Integer currCoin = denominationsLeft.get(0);
        final List<Integer> restOfCoins = denominationsLeft.subList(1, denominationsLeft.size());

        int numPossibilities = 0;

        while (amountLeft >= 0) {
            numPossibilities += change_possibilities_top_down(amountLeft, restOfCoins);
            amountLeft -= currCoin;
        }
        return numPossibilities;
    }
}
