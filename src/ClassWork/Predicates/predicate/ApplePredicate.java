package ClassWork.Predicates.predicate;

import ClassWork.Predicates.Apple;

@FunctionalInterface
public interface ApplePredicate <T> {

    boolean test(T t);

}
