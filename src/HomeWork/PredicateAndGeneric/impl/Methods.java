package HomeWork.PredicateAndGeneric.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Methods {

    public <T> boolean anyMatch(List<T> lines, Predicate<T> predicate) {
        for (T element : lines) {
            if (predicate.test(element)) {
                return true;
            }
        }
        return false;
    }

    public <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return true;
            }
        }
        return false;
    }

    public <T> T ListFindFirstMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return element;
            }
        }
        return null;
    }

    public List<String> filter(List<String>word,Predicate<String> predicate){
        List<String>words=new ArrayList<>();
        for (String element:word){
            if (predicate.test(element)){
                words.add(element);
            }
        }
        return words;
    }

}
