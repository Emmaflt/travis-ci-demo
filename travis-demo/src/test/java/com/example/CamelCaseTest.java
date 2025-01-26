package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseTest {

    @Test
    public void testToUpperCase_withValidString() {
        String result = CamelCase.toUpperCase("bonjour");
        assertEquals("BONJOUR", result, "La méthode devrait transformer tout le texte en majuscules.");
    }

    @Test
    public void testToUpperCase_withEmptyString() {
        String result = CamelCase.toUpperCase("");
        assertEquals("", result, "La méthode devrait retourner une chaîne vide si l'entrée est vide.");
    }

    @Test
    public void testToUpperCase_withNullString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CamelCase.toUpperCase(null);
        });
        assertEquals("Le texte ne peut pas être null", exception.getMessage());
    }
}
