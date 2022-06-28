package gayathri.assignment.data;

public class DefaultInitialization {
    int number;
    char character;
    public void printValues(){
        System.out.println(number);
        System.out.println(character);
    }

    public void displayValues(){
        int number;
        char character;
        //Complie time error, we cant access the values without initialization
        //System.out.println("NUmber is "+num+" and the character is"+character);
    }
}
