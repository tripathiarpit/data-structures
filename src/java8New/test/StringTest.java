package java8New.test;

import java8New.util.StringUtil;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        Arrays.asList("abc","dhg").forEach(StringUtil::capitalizeString);


    }
}
