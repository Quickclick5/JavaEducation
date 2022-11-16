package Lr6;

public class example08_09 {
    public static void main(String[] args) {
        char[] vpered = new char[]{'a', 'b', 'c'};
        System.out.println(Program.Method(vpered));
        char[] nazad = new char[]{'a', 'b', 'c'};
        System.out.println(Program2.MethodZad(nazad));
    }

    static class Program {
        static char[] Method(char[] chars) {
            for (int i = 0; chars.length > i; i++) {
            }

            return chars;
        }
    }

    static class Program2 {
        static char[] MethodZad(char[] chars) {
            char[] newChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                newChars[i] = chars[chars.length - i - 1];
            }

            return newChars;
        }
    }
}
