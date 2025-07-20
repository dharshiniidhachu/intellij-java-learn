package com.dharshini.learning.java.strformat;

import java.text.MessageFormat;

public class StringFormatExample {
    public static void main(String[] args) {

        int age = 20;
        String name = "Dhachu";

        String formattedString = String.format("My name is %S and I am %d years old.", name, age);
        System.out.println(formattedString);

        double salary = 40000.674;
        System.out.printf("Salary: %.2f%n", salary);

        System.out.printf("Name: %-10s Age: %5d%n", name,age);

        String pattern = "Hello {0}, you have {1} new message";
        String formattedMessage = MessageFormat.format(pattern, "Dhachu", 20);
        System.out.println(formattedMessage);

        StringBuilder builder = new StringBuilder();
        builder.append("Name:").append("Alice").append(", Age:").append(20);
        System.out.println(builder.toString());

        System.out.println("This is a \"quoted\" string \tdc with a \tnewline:\nNext Line");


    }
}
