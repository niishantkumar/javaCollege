package javaCollege.Practicals;

public class Prac4 {
    public static void main(String[] args) {
        System.out.println();
        String s1 = "Java is prog lang";
        String s2[] = s1.split(" ");
        System.out.println(s1);

        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        System.out.println();
    }
}
