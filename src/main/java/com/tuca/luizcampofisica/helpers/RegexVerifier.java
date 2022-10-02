package com.tuca.luizcampofisica.helpers;

import java.util.regex.Pattern;

public class RegexVerifier {


    public static boolean hasLetters(String string) {
        return !string.matches(".*[0-9].*");
    }

    public static void main(String[] args) {
        System.out.println(hasLetters("Opa"));
    }
}