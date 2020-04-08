package ru.gromov;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Gromov Anton
 * 07.04.2020
 */
public class App {
    static Map<Character, String> charKey = new HashMap<Character, String>();
    static Map<Character, Integer> sameButton = new HashMap<Character, Integer>();

    static {
        charKey.put('a', "2");
        charKey.put('b', "22");
        charKey.put('c', "222");

        charKey.put('d', "3");
        charKey.put('e', "33");
        charKey.put('f', "333");

        charKey.put('g', "4");
        charKey.put('h', "44");
        charKey.put('i', "444");

        charKey.put('j', "5");
        charKey.put('k', "55");
        charKey.put('l', "555");

        charKey.put('m', "6");
        charKey.put('n', "66");
        charKey.put('o', "666");

        charKey.put('p', "7");
        charKey.put('q', "77");
        charKey.put('r', "777");
        charKey.put('s', "7777");

        charKey.put('t', "8");
        charKey.put('u', "88");
        charKey.put('v', "888");

        charKey.put('w', "9");
        charKey.put('x', "99");
        charKey.put('y', "999");
        charKey.put('z', "9999");

        charKey.put(' ', "0");

        sameButton.put('a', 1);
        sameButton.put('b', 1);
        sameButton.put('c', 1);

        sameButton.put('d', 2);
        sameButton.put('e', 2);
        sameButton.put('f', 2);

        sameButton.put('g', 3);
        sameButton.put('h', 3);
        sameButton.put('i', 3);

        sameButton.put('j', 4);
        sameButton.put('k', 4);
        sameButton.put('l', 4);

        sameButton.put('m', 5);
        sameButton.put('n', 5);
        sameButton.put('o', 5);

        sameButton.put('p', 6);
        sameButton.put('q', 6);
        sameButton.put('r', 6);
        sameButton.put('s', 6);

        sameButton.put('t', 7);
        sameButton.put('u', 7);
        sameButton.put('v', 7);

        sameButton.put('w', 8);
        sameButton.put('x', 8);
        sameButton.put('y', 8);
        sameButton.put('z', 8);

        sameButton.put(' ', 9);
    }

    public static String spelling(String nextLine) {
        char[] nextLineCharArray = nextLine.toCharArray();
        char previous = nextLineCharArray[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charKey.get(previous));

        for (int i = 1; i < nextLineCharArray.length; i++) {
            char current = nextLineCharArray[i];
            if (sameButton.get(previous) == sameButton.get(current)) {
                stringBuilder.append(" ");
            }
            previous = current;
            stringBuilder.append(charKey.get(previous));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            System.out.println("Case #" + (i + 1) + ": "
                    + spelling(scanner.nextLine()));
        }
    }
}