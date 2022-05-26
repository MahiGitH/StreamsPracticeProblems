import ReadingFiles.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {

        while (true) {

            System.out.println("Continue personal information input? \"quit\" ends:");
            String continuePersonalInfo = "quit";
            if(in.hasNextLine()){continuePersonalInfo = in.nextLine();}

            if (continuePersonalInfo.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Input first name: ");
            String firstName = "NaN";
            if(in.hasNextLine()){firstName = in.nextLine();}


            System.out.println("Input last name: ");
            String lastName = "NaN";
            if(in.hasNextLine()){lastName = in.nextLine();}

            System.out.println("Input the year of birth: ");
            int birthYear = 0;
            if(in.hasNextLine()){birthYear = Integer.valueOf(in.nextLine());}

         persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }}
  catch (NumberFormatException e){ e.printStackTrace();}
        // implement unique last names in alphabetical order when user inputs quit
        persons.stream()
                .map(person -> person.getLastName() )
                .distinct()
                .sorted()
                .forEach(lastName -> System.out.println(lastName));
    }
}