package org.curso;

public class Main {
    public static void main(String[] args) {

        final int score1 = 11, score2 = 3;
        char myScore =  7;
        var goal = switch (myScore) {
            default -> { if(10 > score1) yield "unknow"; yield "2";}
            case score1 -> "great";
            case 2,4,6 -> "good";
            case score2, 0 -> {yield "bad";}
        };
        System.out.println(goal);
    }
}