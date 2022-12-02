import java.util.regex.*;
import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String data;
        System.out.print("Дата: ");
        Scanner in = new Scanner(System.in);
        data=in.nextLine();
        String regex = ("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])[/]\\d{4}$"); 
        String regex2 = "^(0?[1-9]|[12][0-9]|3[01]).(0?[1-9]|1[012])[.]\\d{4}$";

        Pattern wrongformat = Pattern.compile(regex2);
        Pattern pattern = Pattern.compile(regex);

        Matcher wrongformatmatcher = wrongformat.matcher(data);
        Matcher matcher = pattern.matcher(data);

  if (wrongformatmatcher.matches()==true){
      System.out.println("Введенное выражение не соотвествтвует заданному формату даты dd/mm/yyyy");
      System.exit(0);
  }
        if (matcher.matches()==false){
            System.out.println("Введенное выражение не является датой");
        }
        else{
            System.out.println("Введенное выражение является датой");
        }
    }
}