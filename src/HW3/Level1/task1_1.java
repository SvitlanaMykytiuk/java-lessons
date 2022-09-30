package HW3.Level1;

public class task1_1 {
    public static void main(String[] args) {

        String study = "I study Basic Java!";
        int studylenth = study.length();
        System.out.println(study.charAt(studylenth-1));
        System.out.println(study.contains("Java"));
        System.out.println(study.replace('a' , 'o'));
        System.out.println(study.toUpperCase());
        System.out.println(study.toLowerCase());
        System.out.println(study.substring(0, study.indexOf("Java")));


    }
}
