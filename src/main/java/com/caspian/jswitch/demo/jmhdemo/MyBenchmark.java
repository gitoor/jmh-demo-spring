package com.caspian.jswitch.demo.jmhdemo;

import org.openjdk.jmh.annotations.Benchmark;

public class MyBenchmark {

  @Benchmark
  public void testMethod() {
    int a = 1;
    int b = 2;
    int sum = a + b;
  }
}