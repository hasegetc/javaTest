package com.lyc.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuyuchao liuyc@tongyuan.cc
 * @date 2020-7-27
 * Copyright© 2008-2020 苏州同元软控信息技术有限公司 All Rights Reserved.
 */
public class Test {
    public static void main(String[] args) {
        BigDecimal
            multiply = new BigDecimal(10.56).multiply(new BigDecimal(110.24)).setScale(2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(81.001)).setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal multiplys = new BigDecimal(10.56).multiply(new BigDecimal(110.24)).multiply(new BigDecimal(81.001)).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(multiply.doubleValue());
        System.out.println(multiplys.doubleValue());

        String[] array = {"a", "b", "c", "d", "e"};
        List<String> strings = Arrays.asList(array);

        strings.stream().filter(x -> {
            return !x.equalsIgnoreCase("a");
        }).forEach(System.out::println);

        // loop a stream
        strings.stream().forEach(x -> System.out.println(x));

        // reuse it to filter again! throws IllegalStateException
        long count = strings.stream().filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }
}
