package Class15;

public class Task4 {

    /*Create a method that will print whether given String is palindrome or not.*/

    void printPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }
    }

    // Break till 11:50
    public static void main(String[] args) {
        Task4 task=new Task4();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
    }

}