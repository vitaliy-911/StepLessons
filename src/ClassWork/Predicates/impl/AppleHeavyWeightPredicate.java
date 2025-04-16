package ClassWork.Predicates.impl;

import ClassWork.Predicates.Apple;
import ClassWork.Predicates.predicate.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return apple.getWaight() > 150;
    }
}
