package SelfPractice.CountValue;

import SelfPractice.CountValue.UnaryPredicate;

public class OddPredicate implements UnaryPredicate<Integer> {

    public boolean test(Integer obj) {
        return obj%2 !=0;
    }
}
