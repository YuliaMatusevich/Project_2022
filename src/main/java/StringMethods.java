import utils.Utils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.basicValidString;

public class StringMethods {


//
//
//    //Task 1
////Написать метод removeSpaces(), который принимает на вход строку.
////Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
////Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
////Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
////Если пробелов не было, вернуть сообщение “Пробелов не было”.
////Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
////
////Test Data:
////“    Red Rover School   “ → “Лишние пробелы удалены”
////“Red Rover School“ → “Пробелов не было”
////“” → “Строка пустая”
//
//    public String removeSpaces(String text) {
//        if (text.isEmpty()) {
//            return "Строка пустая";
//        } else if (text.equals(text.trim())) {
//            return "Пробелов не было";
//        } else {
//            text = text.trim();
//            return "Лишние пробелы удалены";
//        }
//
//    }
//
//
//    //Task 2
//
//    //Написать алгоритм removeAllAs().
//    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    // Метод возвращает обработанную строку.
//    //Test Data:
//    // “    Red Rover School   “ →  “Red Rover School“
//    //“panda   “ → “pnd”
//    //“taramasalata” → “trmslt”
//
//    public String removeAllAs(String text) {
//        if (!text.isEmpty()) {
//            String textCorrected = text.trim();
//            textCorrected = textCorrected.replace("a", "");
//            return textCorrected;
//        }
//        return "";
//    }
//
//    //Task 3
//    //Написать алгоритм removeAllZeros().
//    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
//    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    // Метод возвращает обработанную строку, в которой нет нулей.
//    // Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//    //Test Data:
//    // “3504209706040000 “ →  “35429764“
//    //“0000000111“ → “111”
//
//    public String removeAllZeros(String numbers) {
//        if (!numbers.isEmpty()) {
//            String newNumbers = numbers.trim().replace("0", "");
//
//            if (newNumbers.equals(numbers)) {
//
//                return "This is a valid string";
//
//            } else {
//
//                return newNumbers;
//            }
//
//        }
//        return "";
//
//    }
//
//    //Task 4
//    //Написать алгоритм removeAllSpaces.
//    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    // Метод возвращает обработанную строку.
//    //Test Data:
//    // “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//    //“p a     n   d a   “ → “panda”
//
//
//    public String removeAllSpaces(String text) {
//        if (!text.isEmpty()) {
//            return text.trim().replace(" ", "");
//
//        }
//        return "";
//
//    }
//
//    //Task5
//    //Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
//    // Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
//    // Итоговый результат должен строится с помощью метода из видео 2.
//    //Test Data:
//    //“Abracadabra” → “5, 6”
//    //“Homenum Revelio” → “0, 15”
//    //“3 tarAmasAlatA” → “6, 8”
//
//    //Method 1
//
//    public String countAs(String text) {
//        if (!text.isEmpty()) {
//            text = text.toLowerCase();
//            String text1 = text.replace("a", "");
//            String a = String.valueOf(text.length() - text1.length());
//            String b = ", " + text1.length();
//
//            return a.concat(b);
//
//
//        }
//        return "";
//    }
//
//    //Method 2
//
//    public String countAs1(String text) {
//        if (!text.isEmpty()) {
//            text = text.trim().toLowerCase();
//            int countA = 0;
//            for (int i = 0; i < text.length(); i++) {
//                if (text.charAt(i) == 'a') {
//                    countA++;
//                }
//            }
//            String countAa = String.valueOf(countA);
//            String countOthers = ", " + String.valueOf(text.length() - countA);
//            return countAa.concat(countOthers);
//        }
//        return "";
//    }
//
//
//    //Task 6
//    //Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
//
//    //Test Data:
//    //“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)
//    // versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019
//    // for commercial use, although it will otherwise still support Java 8 with public updates for personal use indefinitely.
//    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security
//    // and other upgrades.” → true
//    //
//    //“99 little bugs in a code.
//    //99 little bugs in a code.
//    //Take one down, and patch it around.
//    //235 critical bugs in the code.” → false
//
//    public boolean countJava(String text) {
//        return text.contains("Java");
//    }
//
//    //Task 7
//    //Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
//    //Test Data:
//    //“Abracadabra” →  ““Abracadabra””
//
//    public String insertQuotes(String text) {
//        String quote = "\"";
//        return quote.concat(text).concat(quote);
//    }
//
//
//    //Task 8
//
//    //Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
//    //(результат строится с помощью метода concat())
//    //
//    //Test Data:
//    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
//    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
//    //Задание со звездочкой:
//    //“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
//    //"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
//
//    public String insertQuotes(String part1, String part2) {
//        String newPart1 = part1.concat(": ");
//        String quote = "\"";
//        String newPart2 = quote.concat(part2).concat(quote);
//
//        String fullPhrase = newPart1.concat(newPart2);
//
//        return fullPhrase;
//
//
//    }
//
//    //Task 9
//    //Напишите метод, кторый принимает на вход название города и исправляет написание:
//    //Test Data:
//    //“ташкент” → “Ташкент”
//    //“ЧикаГО” → “Чикаго”
//
//    public String cityName(String city) {
//        if (!city.isEmpty()) {
//            city = city.toLowerCase();
//            String firstUpperCase = String.valueOf(city.charAt(0)).toUpperCase();
//            String restLetters = city.substring(1, city.length());
//            city = firstUpperCase.concat(restLetters);
//
//            return city;
//        }
//        return "";
//    }
//
//    //Task 10
//    //Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
//    // что находится между первой и последней буквой-параметром:
//    //Test Data:
//    //“Abracadabra”, “b” → “bracadab”
//    //“Whippersnapper”, “p” → “ppersnapp”
//
//    public String betweenFirstAndLastLetter(String text, String letter) {
//        if (!text.isEmpty() && !letter.isEmpty() && text.contains(letter)) {
//
//            return text.substring(text.indexOf(letter), (text.lastIndexOf(letter) + 1));
//
//        }
//        return "";
//    }
//
//    //Task 11
//    //Напишите метод, который принимает на вход слово, и возвращает true,
//    // если слово начинается и заканчивается на одинаковую букву, и false иначе
//    //Test Data:
//    //	“Abracadabra” → true
//    //	“Whippersnapper” → false
//
//    //Method2
//    public boolean sameLetters(String text) {
//        if (text != null && !text.isBlank()) {
//            text = text.toLowerCase();
//            String first = String.valueOf(text.charAt(0));
//            String last = String.valueOf(text.charAt((text.length() - 1)));
//
//            return first.equals(last);
//        }
//        return false;
//    }
//
//    //Method 2
//    public boolean sameLetters1(String text) {
//        if (text != null && !text.isBlank()) {
//            text = text.toLowerCase();
//            return text.indexOf(text.charAt(0)) == text.lastIndexOf(text.length() - 1);
//            //взяли последн. индекс буквы строки  и она же находится на последнем индексе слова
//            // str.charAt(0) - первая буква слова
//
//        }
//        return false;
//    }
//
//    //Task12
//    //Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
//    //Test Data:
//    //	“Red Rover” → “Rover”
//
//    public String partOfString(String text) {
//        int index = 4;
//        if (!text.isEmpty() && index < text.length()) {
//            text = text.substring(index);
//
//            return text;
//        }
//        return "";
//    }
//
//    //Task 13
//    //Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
//    //Test Data:
//    //	“Red rover”, 1, 4 → “Rover”
//
//    public String deletePartOfString(String text, int index1, int index2) {
//        if (!text.isEmpty() && index1 < text.length() && index2 < text.length()) {
//            if (index1 < index2) {
//                text = text.replace(text.substring(index1, index2 + 1), "");
//
//                return text;
//            } else if (index1 > index2) {
//                text = text.replace(text.substring(index2, index1 + 1), "");
//
//                return text;
//
//            }
//            return "";
//
//        }
//        return "";
//
//    }
//
//    //Task 14
//    // Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
//    //Test Data:
//    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
//    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
//
//    public String[] splitString(String text) {
//        if (!text.isEmpty()) {
//            String newText[] = text.split(" ");
//
//            return newText;
//        }
//        return new String[0];
//    }
//
//    //Task 15
//
//    //Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает текст:
//
//    //Test Data:
//    //“Александр Сергеевич Пушкин” →
//    //
//    //“Имя: Александр
//    //Отчество: Сергеевич
//    //Фамилия: Пушкин”
//
//    public String splitFirstMiddleLastName(String fullName) {
//        if (fullName.contains(" ")) {
//            String[] newName = fullName.split(" ");
//            String[] header = {"Имя: ", "Отчество: ", "Фамилия: "};
//            if (header.length == newName.length) {
//                String row = "";
//                for (int i = 0; i < 1; i++) {
//                    row = row + header[i] + newName[i];
//                }
//                for (int i = 1; i < newName.length; i++) {
//                    row = row + "\n" + header[i] + newName[i];
//                }
//
//                return row;
//            }
//        }
//        return "Error";
//    }
//
//    public String splitFirstMiddleLastName2(String fullName) {
//        if (fullName.contains(" ")) {
//            String[] newName = fullName.split(" ");
//            if (newName.length == 3) {                              // newName != null покрывется условием про наличие пробелов
//                String row1 = "Имя: " + newName[0];
//                String row2 = "Отчество: " + newName[1];
//                String row3 = "Фамилия: " + newName[2];
//                fullName = row1 + "\n" + row2 + "\n" + row3;
//
//                return fullName;
//            }
//            return "Name length is not equals to a provided header";
//        }
//        return "Error";
//
//    }
//
//
//    //Task 16
//    //Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
//    //Test Data:
//    //“one”, 5 → “oneoneoneoneone”
//
//    public String repeatString(String text, int number) {
//        if (!text.isEmpty() && number > 0) {
//            text = text.repeat(number);
//
//            return text;
//        }
//        return "";
//
//    }
//
//    //Task 17
//
//    //Напишите метод, который принимает строку и index,
//    // и возвращает численное значение буквы, которая находится на позиции index
//    // (использовать только один метод класса String)
//
//    public char checkCharValueOfLetter(String text, int index) {
//        if (basicValidString(text) && index > 0 && index <= text.length()) {
//            char letter = text.charAt(index);
//
//            return letter;
//        }
//        return (char) Integer.MAX_VALUE;
//
//    }
//
//    //Task 18
//    //Написать метод, который принимает 3 слова, и сравнивает их методом,
//    // который считает, что прописные и заглавные буквы - это одни и те же буквы.
//    // Метод возвращает true, если все слова одинаковы, и метод возвращает false, если слова не одинаковы:
//    //Test Data:
//    //“one”, “One”, “ONE”  → true
//    //“one”, “Один”, “ONE” → false
//
//    public boolean compareStringCase(String s1, String s2, String s3) {
//        if (!s1.isBlank() && !s2.isBlank() && !s3.isBlank()) {
//            return (s1.equalsIgnoreCase(s2) && s2.equalsIgnoreCase(s3));
//        }
//        return false;
//
//    }
//
//
//    public static void main(String[] args) {
//
//
//    }
}
