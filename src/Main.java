import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //declare variables
        String partyChoice = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\tOther\nChoose your party affiliation: ";

        //display the menu
        System.out.println(menu);
        partyChoice = in.nextLine();

        if(partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        }
        else if(partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant.");
        }
        else if(partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent Person.");
        }
        else if(partyChoice.equalsIgnoreCase("Other"))
        {
            System.out.println("You get a different party.");
        }
        else
            System.out.println("This is not a party: " + partyChoice + "must be [D,R,I,Other]");
    }
}