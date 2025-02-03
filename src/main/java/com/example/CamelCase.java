package com.example;

public class CamelCase {

    // Méthode pour transformer un texte en majuscules
    public static String toUpperCase(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Le texte ne peut pas être null");
        }
        return text.toUpperCase();
    }
}
