package com.test.designPattern.structural.flyweight.wordprocessor.solution;

import java.util.HashMap;

// Flyweight Factory (Class) - creates and manages flyweight objects.
public class LetterFactory {
    private static final HashMap<Character , ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(char characterValues) {
        if (characterCache.containsKey(characterValues))
            // if exists, return the cached character object.
            return characterCache.get(characterValues);
        else {
            // if not exists, create the character object and cache it.
            DocumentCharacter characObj = new DocumentCharacter(characterValues, "Ariel", 10);
            //add to cache
            characterCache.put(characterValues, characObj);
            return characObj;
        }
    }
        public static int getTotalCharacters(){
            return characterCache.size();
        }
    }

