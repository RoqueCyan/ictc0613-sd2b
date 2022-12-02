import java.util.Scanner;
import java.io.IOException;

public class Act5B_MyLinkedList_Roque_SD2B 
{
    public Act5B_MyLinkedList_Roque_SD2B   next; 
    public static Act5B_MyLinkedList_Roque_SD2B  firstNode;
    public static Act5B_MyLinkedList_Roque_SD2B  lastNode = null;

    public String firstName, middleName, lastName, areaCode, telephone, sex;
    public int age;
    public Act5B_MyLinkedList_Roque_SD2B(String [] store, Act5B_MyLinkedList_Roque_SD2B h)
    {
        firstName = store[0];
        middleName = store[1];
        lastName = store[2];
        areaCode = store[3];
        telephone = store[4];
        sex = store[5];
        age = Integer.parseInt(store[6]);
        next = h;
    }
    public static void main(String[]args) throws IOException
    {
        int numNodes;
        String [] store = new String[7];
        Scanner input = new Scanner(System.in);
        System.out.println("How many members' information will be entered? ");
        numNodes = Integer.parseInt(input.nextLine());
        System.out.println("");
        for (int i = 0; i < numNodes; i++)
        {
            System.out.println("Kindly give the information for member # " + (i+1));
            System.out.println("Enter first name: ");
            store[0] = input.nextLine();
            System.out.println("Enter middle name: ");
            store[1] = input.nextLine();
            System.out.println("Enter last name: ");
            store[2] = input.nextLine();
            System.out.println("Enter area code: ");
            store[3] = input.nextLine();
            System.out.println("Enter telephone number: ");
            store[4] = input.nextLine();
            System.out.println("Enter sex: ");
            store[5] = input.nextLine();
            System.out.println("Enter age: ");
            store[6] = input.nextLine();

            System.out.println("");

            Act5B_MyLinkedList_Roque_SD2B h = new Act5B_MyLinkedList_Roque_SD2B(store, null);
            if(lastNode != null)
            {
                lastNode.next = h;
                lastNode = h;
            }
            else
            {
                firstNode = h;
                lastNode = h;
            }
        }
        Act5B_MyLinkedList_Roque_SD2B h = firstNode;
        while(h != null)
        {
            System.out.println("");
            System.out.printf("Welcome to the club! %s %s %s! ", h.firstName, h.middleName, h.lastName);
            System.out.printf("Your area code and telephone number is (%s) %s ", h.areaCode, h.telephone);
            System.out.printf("You are a %s member, and you are %s years old ", h.sex, h.age);

            h = h.next;
        }
        input.close();
    }
}
