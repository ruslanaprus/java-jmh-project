package org.example;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Init {
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)
    public static void init(){
        concurrentModificationExceptionFixed();
    }

    public static void concurrentModificationExceptionFixed() {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7)
        );

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 2) {
                iterator.remove();
            }
        }
    }

}
