import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputstring = in.nextLine();
        System.out.println(inputstring.replace(" ",""));
    }
}
