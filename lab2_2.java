import java.util.regex.*;
import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner pswrd = new Scanner(System.in);
        System.out.print("Пароль: ");
        while (true){
        String password;
        password=pswrd.nextLine();
        String regex = ("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()==false){
            System.out.print("Пароль ненадежен. Повторите ввод: ");
        }
        if (matcher.matches()==true){
            System.out.println("Пароль надежен");
            System.exit(0);
        }
    }
}
}