import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Get and store the user's name. (Store as text)
        String name;
        name = scanner.nextLine();
        //Get and store the user's age. (Store as a whole number)
        int age;
        age = scanner.nextInt();
        //Get and store the user's weight. (Store it as a real number)
        float weight;
        weight = scanner.nextFloat();
        //Get and store if the user is a smoker. (Store it as either true or false)
        boolean smoker;
        smoker = scanner.nextBoolean();
        //Output all of the information back to the user.
        System.out.println(name + " has an age of " + age + " and weights " + weight + " with " + smoker + " test result in smoking.");
        scanner.close();
    }
}
