package com.company;

import java.util.regex.Pattern;

public class Main {

    /*
    Simple method to quickly validate a  provided java regex matches in a provided string.

    Arg[0] - String to match
    Arg[1] - Regex to compare against
    */
    public static void main(String[] args) {
        if (regexMatches(args[0], args[1])) {
            System.out.println("Path matches.");
        } else {
            System.out.println("Path doesn't match.");
        }
    }

    static boolean regexMatches(String path, String regex) {
        Pattern DirectoryPattern = Pattern.compile(regex);
        return DirectoryPattern.matcher( path ).matches();
    }
}