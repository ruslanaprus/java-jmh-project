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
        new ParseDomain("https://rock.festival.com/?q=nearest").parseDomainOne();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationTwo() {
        new ParseDomain("https://rock.festival.com/?q=nearest").parseDomainTwo();
    }
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationThree() {
        new ParseDomain("https://rock.festival.com/?q=nearest").parseDomainThree();;
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    @Fork(value = 2)
    @Warmup(iterations = 3)
    @Measurement(iterations = 3)
    public static void implementationFour() {
        new ParseDomain("https://rock.festival.com/?q=nearest").parseDomainFour();;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

}

