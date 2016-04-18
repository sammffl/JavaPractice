/**
 * @author SamMFFL
 * @version v1.0
 */
public class Main {

    /*
     * 多行注释
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int score1 = 81;
//        double score2 = score1;
        double score2 = 75.5;
        int score3 = (int) score2;
        char score4 = (char)score2;
        System.out.println(score4);
        //常量
        final String LOVE = "Sam";
        funcAlert();
    }

    public static void funcAlert(){
        System.out.println("alert");
    }

}
