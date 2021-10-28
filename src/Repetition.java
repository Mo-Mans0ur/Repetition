public class Repetition {
    public static void main(String[] args) {
        //Exercise 1

        /*
        if you had to make some car classes, and they have the same
        attributes it's easier to make a car which inherits the
        attributes from the Car Class than to write what attributes
        it has again

        we have D.R.Y: don't repeat yourself

        lets call the biggest class with the attributes the "Parent
        Class" and then we have the "Child Classes" which inherits
        the attributes

        the way we make that happen is with the keyword super,
        super makes the constructor inherit the attributes from
        the "parent class"
_____________________________________________________________________________
        example:
        the constructor in the "Parent Class" would look like this:

        attributes  ⬇

        private String name;
        private int velocity;
        private int seats;
        private String color;


            public Car (String "name", int velocity, int seats, String "color){
              this.name = name;
              this.velocity = velocity;
              this.seats = seats;
              this.color = color;


            }

       the Constructor in the "child Class" would look like this:

       it doesn't need any attributes that is in the constructor again


       public Car(String "name", int velocity, int seats, String "color") {
            super(name, velocity, seats, color);
_____________________________________________________________________________

  */
        //Exercise 2



    }
}