import java.util.*;

public class Polindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = input.nextLine();

        isPolindrome(number);
    }

    public static void isPolindrome(String number){
        boolean isPolindrome = true;
        for(int i = 0; i < number.length(); i++){
            /* Последовательно сравниваю элементы с начала и конца,
            постепенно двигаясь к середине строки */
            if(number.charAt(i) != number.charAt(number.length() - 1 - i)){
                System.out.println("Не полиндром");
                isPolindrome = false;
                break;
            }
        }
        if(isPolindrome){
            System.out.println("Полиндром");
        }
    }
}
