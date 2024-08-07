package kr.huichan.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String[] stringList = sc.nextLine().split("[^a-z|A-Z]");
        String[] dic = new String[stringList.length];
        int index[] = new int[stringList.length];
        int count = 0;

        for (int i = 0; i < stringList.length; i++) {
            boolean isFirst = true;
            for (int j = 0; j < dic.length; j++) {
                if (stringList[i].toLowerCase().equals(dic[j])) {
                    index[j]++;
                    isFirst = false;
                }
            }
            if (isFirst) {
                dic[count] = stringList[i].toLowerCase();
                index[count]++;
                count++;
            }
        }

        int max = 0;
        System.out.println("===== 단어 빈도 =====");
        for (int i = 0; i < index.length; i++) {
            if (index[max] < index[i]) max = i;
            if (index[i] > 0) System.out.println(dic[i] + ": " + index[i]);
        }
        System.out.println("가장 빈도 높은 단어: " + dic[max] + " (" + index[max] + "번)");
    }
}
