package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static List<String> createArrayList() {
        List<String> newList = new ArrayList<>(Arrays.asList("GKFFD", "TNANA",
                "MPMSL", "PSWME", "LZMLF", "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"));

        return newList;
    }

    public static void printElementsAndIndex(List<String> customList) {
        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Element: " + customList.get(i) + ", Index: " + i);
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        System.out.println(addElementToList(createArrayList(), "AAAAA"));
        printElementsAndIndex(createArrayList());
    }
}
