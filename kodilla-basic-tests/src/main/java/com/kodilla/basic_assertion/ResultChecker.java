package com.kodilla.basic_assertion;

public class ResultChecker {
    static boolean assertEquals(int expected, int actual) {
        if (expected != actual) {
            return false;
        }
        return true;
    }
}
