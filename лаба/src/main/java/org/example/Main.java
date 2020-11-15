package org.example;

import java.io.IOException;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "foreign_names.csv";
        Character separator = ';';
        List<Person> people = Read.readFromFile(csvFilePath, separator);
        for (int i=0;i< people.size();i++) {

            System.out.println(people.get(i));
        }
    }
}
