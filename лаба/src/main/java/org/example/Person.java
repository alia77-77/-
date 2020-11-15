package org.example;

import java.io.IOException;

class Person {
    private String name;
    private String id;
    private String BirtDate;
    private Department div;
    private String Salary;
    private String gender;

    public Person(String[] str, Department div) throws IOException {
        if (str.length != 6 || div == null)
            throw new IOException("Введенных данных не достаточно, чтобы создать объект класса.");

        id = str[0];
        name = str[1];
        gender = str[2];
        BirtDate = str[3];
        this.div = div;
        Salary = str[5];
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", BirtDate='" + BirtDate + '\'' +
                ", div=" + div +
                ", Salary='" + Salary + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}




