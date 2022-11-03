package Lr4;
import java.util.Scanner;
public class example08_08{

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = id.nextLine();

        System.out.print("Введите ключ шифрования: ");
        int key = id.nextInt();
        String encryptStr = Caeser.encrypt(text, key);

        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");

        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean quest = false;
        while (!quest) {
            String reply = id.next();

            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                quest = true;
            }

            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                quest = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                quest = false;
            }
        }
    }
    private static class Caeser {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }

}
