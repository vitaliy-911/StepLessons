package ClassWork.Predicates.impl;

import ClassWork.Predicates.Apple;
import ClassWork.Predicates.Color;
import ClassWork.Predicates.predicate.ApplePredicate;

public class AppleColorGreenPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
