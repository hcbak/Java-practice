package kr.huichan.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String randomUpperAlphabet(int length) {
        String result = "";

        for (int i = 0; i < length; i++) {
            result += (char) ('A' + randomNumber(0, 26));
        }

        return result;
    }

    public static String rockPaperScissors() {
        String result = "";
        int click = randomNumber(1, 3);

        if (click == 1) {
            result = "가위";
        } else if (click == 2) {
            result = "바위";
        } else if (click == 3) {
            result = "보";
        }

        return result;
    }

    public static String tossCoin() {
        return randomNumber(1, 2) == 1 ? "앞면" : "뒷면";
    }
}
