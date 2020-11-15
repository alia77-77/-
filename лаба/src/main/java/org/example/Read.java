package org.example;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Read {
    public static List<Person> readFromFile(String csvFilePath, Character separator) throws IOException {
        Map<String, Department> uniqueDivisions = new HashMap<>();
        List<Person> result = new ArrayList<>();
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            Department department;
            Person person;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                if (!uniqueDivisions.containsKey(nextLine[4])) {
                    department = new Department(nextLine[4]);
                    uniqueDivisions.put(nextLine[4], department);
                }
                person = new Person(nextLine, uniqueDivisions.get(nextLine[4]));
                result.add(person);
            }
        }

        return result;
    }
}
