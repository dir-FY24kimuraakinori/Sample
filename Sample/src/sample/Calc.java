package sample;

import javax.naming.spi.DirStateFactory.Result;

public class Calc {

    public static void main(String[] args) {
        int score = 100;
        System.out.print("scoreが40以上、または50以下：");
        System.out.println(score >= 40 || score <= 50);
    }

}
