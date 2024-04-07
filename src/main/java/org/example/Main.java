package org.example;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class Main {

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 3)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public static void implementationOne() {
        StringObjects.drawQuadOne(10);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 3)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public static void implementationTwo() {
        StringObjects.drawQuadTwo(10);
    }
//    @Benchmark
//    @OutputTimeUnit(TimeUnit.MILLISECONDS)
//    @Fork(value = 3)
//    @Warmup(iterations = 5)
//    @Measurement(iterations = 5)
//    public static void implementationThree() {
//        ItemRemoval.concurrentModificationFour();
//    }


//    public static void init(){
//        GetFirstDigit.getFirstDigitOne(75); // division by 10, second digit is needed - 1_763_585 ops/ms
//        GetFirstDigit.getFirstDigitTwo(75); // toString and getNumericValue() - 441_410 ops/ms
//        GetFirstDigit.getFirstDigitThree(75); // stream() filter - 7_946 ops/ms
//        GetFirstDigit.getFirstDigitFour(75); // curious and magical (int)a.charAt(0) - '0'; - 488_889 ops/ms
//    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

}

