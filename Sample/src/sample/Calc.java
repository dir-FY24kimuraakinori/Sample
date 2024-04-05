package sample;

public class Calc {

    public static void main(String[] args) {
        var score = 72;
        
        switch (score / 10) {
            case 10 -> System.out.println("満点です！");
            default -> System.out.println("赤点です。。。");
        }
    }

}
