package Class26;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
         /* Create an arrayList of words.
       Remove every word that ends with “e”.
     */
        //Break till 11:55


        ArrayList<String> words=new ArrayList();
        words.add("Java");
        words.add("India");
        words.add("Palestine");
        words.add("USA");
        words.add("France");
        words.add("Pakistan");
        words.add("Ukraine");

        java.util.Iterator<String> iterator=words.iterator();

        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(words);
    }
}
