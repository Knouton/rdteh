package day8.lambda.changeStrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("abc");
        arrayList.add("CcccCCCcc");
        arrayList.add("Ddasdasd");
        arrayList.add("ccaCac");
        arrayList.add("caca");

        arrayList.replaceAll(String::toLowerCase); //в нижний регистр
        arrayList.sort(Comparator.comparingInt(String::length)); //отсортировать по длинне
        arrayList.forEach(System.out::println); //вывести все строки в консоль
    }
}