import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        String[]students = {"ngoc","trinh","dat","nhat"};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = input.nextLine();

       for (int i = 0; i < students.length; i++){
           if(students[i].equals(name)){
               System.out.println("Your name at: " + (i +1));
               break;
           }else {
               System.out.println("Not found!");

           }
       }
    }
}
