import Exercise2.Cars;
import Exercise2.Sedan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Repetition {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Exercise 1

        /*
        if you had to make some car classes, and they have the same
        attributes it's easier to make a car which inherits the
        attributes from the Exercise2.Car Class than to write what attributes
        it has again

        we have D.R.Y: don't repeat yourself

        lets call the biggest class with the attributes the "Parent
        Class" and then we have the "Child Classes" which inherits
        the attributes

        the way we make that happen is with the keyword super and extend the
        "Parent class" to the "Child class"

        super makes the constructor inherit the attributes from
        the "parent class"

        and we can't use the constructor if we haven't
        extended the "parent class"
_____________________________________________________________________________
        example:
        the constructor in the "Parent Class" would look like this:

        attributes  ⬇

        private String name;
        private int velocity;
        private int seats;
        private String color;


            public Exercise2.Car (String "name", int velocity, int seats, String "color){
              this.name = name;
              this.velocity = velocity;
              this.seats = seats;
              this.color = color;


            }

       the Constructor in the "child Class" would look like this:

       it doesn't need any attributes that is in the constructor again


       public Exercise2.Car(String "name", int velocity, int seats, String "color") {
            super(name, velocity, seats, color);
_____________________________________________________________________________

  */
        //Exercise 2

        Cars truck = new Cars("Volkswagen",90,2,"RED");
        System.out.println(truck);

        Sedan mercedes = new Sedan("Mercedes", 110, 5, "Black");
        System.out.println(mercedes);
/*
_____________________________________________________________________________
*/
        //Exercise 3
        ArrayList<String> listOfWords = new ArrayList<String>();

        try {
            Scanner scanner = new Scanner(new File("Ressource/randomWords.csv"));
            while (scanner.hasNextLine()) {
                listOfWords.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
                System.out.println("File couldn't be found");
                e.printStackTrace();
        }

        System.out.println(listOfWords.size());
/*
        there is 20 Strings in the file
_____________________________________________________________________________
*/

        //Exercise 4
        int aBirthInSeconds = 7;
        int aDeathInSeconds = 13;
        int usaPopulation = 331002651;



/*
_____________________________________________________________________________
 */
        //Exercise 5
        /*
        what happens in the picture is it generates 10 random numbers(integers)
        between 0 and 10 the method "generateRandomIntegers" is bound to only be
        10 numbers
         */

/*
_____________________________________________________________________________
 */

        // Exercise 6

        ArrayList<Integer> arrayListOfNumbers = new ArrayList<Integer>();



        System.out.println("choose what multiple of a number to be removed");
        for (int i = 1; i < 100 +1; i++) {
            arrayListOfNumbers.add(i);
            System.out.print( i + " , ");
        }
        System.out.println();
        int input = scanner.nextInt();

        arrayListOfNumbers.removeIf(integer -> (integer % input == 0 && integer != input));
        System.out.println(arrayListOfNumbers);
/*
_____________________________________________________________________________
 */
        //Exercise 7
        /*
        Static is a keyword that makes a method or a class possibles to be used in
        other classes/methods.
         */

    }
}