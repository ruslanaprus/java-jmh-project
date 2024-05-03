package org.example;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class Main {

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationOne() {
        WordDeleter.remove("vys coe objiqono potou sydiesu yhypno", new String[] {"coe", "yhypno", "vys", "potou"});
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationTwo() {
        WordDeleter.removeWithHashMap("vys coe objiqono potou sydiesu yhypno", new String[] {"coe", "yhypno", "vys", "potou"});
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationThree() {
        WordDeleter.removeWithList("vys coe objiqono potou sydiesu yhypno", new String[] {"coe", "yhypno", "vys", "potou"});
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationFour() {
        WordDeleter.removeWithRegex("vys coe objiqono potou sydiesu yhypno", new String[] {"coe", "yhypno", "vys", "potou"});
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

}

