import model.Lotto;


import model.Number;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.Comparator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ComparatorTest {

    @Test
    @DisplayName("no bonus and match 6")
    void compareTest1() {
        Set<Integer> integers = new HashSet<>();
        List<Number> numbers = new LinkedList<>();

        for (int i = 1; i < 7; i++) {
            integers.add(i);
            numbers.add(new Number(false,i));
        }

        Assertions.assertEquals(1, new Comparator().compare(integers, numbers));
    }

    @Test
    @DisplayName("bonus and match 6")
    void compareTest2() {
        Set<Integer> integers = new HashSet<>();
        List<Number> numbers = new LinkedList<>();

        integers.add(1);
        numbers.add(new Number(true,1));
        for (int i = 2; i < 7; i++) {
            integers.add(i);
            numbers.add(new Number(false,i));
        }

        Assertions.assertEquals(2, new Comparator().compare(integers, numbers));
    }
}
