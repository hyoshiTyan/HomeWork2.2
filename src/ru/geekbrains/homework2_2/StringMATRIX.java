package ru.geekbrains.homework2_2;

public class StringMATRIX extends NumberFormatException {
    private String word;

    public void StringMATRIX(String word)  {
        this.word = word;
    }

    public String StringMX(){
        return "ru.geekbrains.homework2_2.StringMATRIX " + word;
    }

    }

