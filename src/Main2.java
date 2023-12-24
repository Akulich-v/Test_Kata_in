import java.util.HashMap;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите строку выражение в виде a + b, a - b, a * b, a / b");
        System.out.println("арабскими или римскими цифрами");
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String[] str2 = str1.split(" ");

        System.out.println(dev(str2));
    }

    static String dev(String[] a) {
        int ca;
        int cb;
        int otvet;
        String otvet1;
        boolean tf = false;

        HashMap<String, Integer> rim = new HashMap<>();
        rim.put("I", 1);
        rim.put("II", 2);
        rim.put("III", 3);
        rim.put("IV", 4);
        rim.put("V", 5);
        rim.put("VI", 6);
        rim.put("VII", 7);
        rim.put("IIX", 8);
        rim.put("IX", 9);
        rim.put("X", 10);

        HashMap<Integer, String> rim1 = new HashMap<>();
        rim1.put(1, "I");
        rim1.put(2, "II");
        rim1.put(3, "III");
        rim1.put(4, "IV");
        rim1.put(5, "V");
        rim1.put(6, "VI");
        rim1.put(7, "VII");
        rim1.put(8, "VIII");
        rim1.put(9, "IX");
        rim1.put(10, "X");
        rim1.put(11, "XI");
        rim1.put(12, "XII");
        rim1.put(13, "XIII");
        rim1.put(14, "XIV");
        rim1.put(15, "XV");
        rim1.put(16, "XVI");
        rim1.put(17, "XVII");
        rim1.put(18, "XVIII");
        rim1.put(19, "XIX");
        rim1.put(20, "XX");
        rim1.put(21, "XXI");
        rim1.put(22, "XXII");
        rim1.put(23, "XXIII");
        rim1.put(24, "XXIV");
        rim1.put(25, "XXV");
        rim1.put(26, "XXVI");
        rim1.put(27, "XXVII");
        rim1.put(28, "XXVIII");
        rim1.put(29, "XXIX");
        rim1.put(30, "XXX");
        rim1.put(31, "XXXI");
        rim1.put(32, "XXXII");
        rim1.put(33, "XXXIII");
        rim1.put(34, "XXXIV");
        rim1.put(35, "XXXV");
        rim1.put(36, "XXXVI");
        rim1.put(37, "XXXVII");
        rim1.put(38, "XXXVIII");
        rim1.put(39, "XXXIX");
        rim1.put(40, "XL");
        rim1.put(41, "XLI");
        rim1.put(42, "XLII");
        rim1.put(43, "XLIII");
        rim1.put(44, "XLIV");
        rim1.put(45, "XLV");
        rim1.put(46, "XLVI");
        rim1.put(47, "XLVII");
        rim1.put(48, "XLVIII");
        rim1.put(49, "XLIX");
        rim1.put(50, "L");
        rim1.put(51, "LI");
        rim1.put(52, "LII");
        rim1.put(53, "LIII");
        rim1.put(54, "LIV");
        rim1.put(55, "LV");
        rim1.put(56, "LVI");
        rim1.put(57, "LVII");
        rim1.put(58, "LVIII");
        rim1.put(59, "LIX");
        rim1.put(60, "LX");
        rim1.put(61, "LXI");
        rim1.put(62, "LXII");
        rim1.put(63, "LXIII");
        rim1.put(64, "LXIV");
        rim1.put(65, "LXV");
        rim1.put(66, "LXVI");
        rim1.put(67, "LXVII");
        rim1.put(68, "LXVIII");
        rim1.put(69, "LXIX");
        rim1.put(70, "LXX");
        rim1.put(71, "LXXI");
        rim1.put(72, "LXXII");
        rim1.put(73, "LXXIII");
        rim1.put(74, "LXXIV");
        rim1.put(75, "LXXV");
        rim1.put(76, "LXXVI");
        rim1.put(77, "LXXVII");
        rim1.put(78, "LXXVIII");
        rim1.put(79, "LXXIX");
        rim1.put(80, "LXXX");
        rim1.put(81, "LXXXI");
        rim1.put(82, "LXXXII");
        rim1.put(83, "LXXXIII");
        rim1.put(84, "LXXXIV");
        rim1.put(85, "LXXXV");
        rim1.put(86, "LXXXVI");
        rim1.put(87, "LXXXVII");
        rim1.put(88, "LXXXVIII");
        rim1.put(89, "LXXXIX");
        rim1.put(90, "XC");
        rim1.put(91, "XCI");
        rim1.put(92, "XCII");
        rim1.put(93, "XCIII");
        rim1.put(94, "XCIV");
        rim1.put(95, "XCV");
        rim1.put(96, "XCVI");
        rim1.put(97, "XCVII");
        rim1.put(98, "XCVIII");
        rim1.put(99, "XCIX");
        rim1.put(100, "C");

        if (a.length != 3) {
            return "Не соответстует требованиям";
        }
        try {
            ca = Integer.parseInt(a[0]);
            cb = Integer.parseInt(a[2]);
        } catch (Exception e) {
            try {
                ca = rim.get(a[0]).intValue();
                cb = rim.get(a[2]).intValue();
                tf = true;
            } catch (Exception c) {
                return "Не соответстует требованиям";
            }
        }

        if (0 > ca || ca > 10 || 0 > cb || cb > 10) {
            return "Не соответстует требованиям";
        }

        switch (a[1]) {
            case ("+"):
                otvet = ca + cb;
                break;
            case ("-"):
                otvet = ca - cb;
                break;
            case ("/"):
                otvet = ca / cb;
                break;
            case ("*"):
                otvet = ca * cb;
                break;
            default:
                return "Данный символ не известен";

        }

        if (tf) {
            if (otvet < 0) {
                return ("Отрицательные числа в римской системе отсутствуют");
            }
            return rim1.get(otvet);
        }
return String.valueOf(otvet);

    }
}
