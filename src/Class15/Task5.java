package Class15;

public class Task5 {
    String createEmail(String fristName, String lastName, String emailType){
        return (fristName+lastName+ "@"+emailType + ".com").toLowerCase();
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        String fullEmail=task5.
                createEmail("roman","Sahel","gmail");
        System.out.println(fullEmail);
    }
}
