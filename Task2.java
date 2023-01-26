package Homework8Class13;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters , numbers, and special characters.
        Find out how many Alphanumeric (abc AZ 234) characters are there in the String
        */
        String str="acsghgDGHGJ46567&*(()(%";
        System.out.println(str.replaceAll("[^A-Za-z0-9]" ,   " "));
    }
}
