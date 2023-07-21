//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.SplittableRandom;
//
//public class StringMethodsTest {
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
//    @Test
//    public void removeSpaces_HappyPath_removedExtraSpaces() {
//        String text = "    Red Rover School   ";
//        String expectedResult = "Лишние пробелы удалены";
//
//        String actualResult = new StringMethods().removeSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    @Test
//    public void removeSpaces_HappyPath_noExtraSpaces() {
//        String text = "Red Rover School";
//        String expectedResult = "Пробелов не было";
//
//        String actualResult = new StringMethods().removeSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void removeSpaces_HappyPath_EmptyText() {
//        String text = "";
//        String expectedResult = "Строка пустая";
//
//        String actualResult = new StringMethods().removeSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
////Task 2
//    //Написать алгоритм removeAllAs().
//    //Написать алгоритм removeAllAs().
//    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
//    // Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
//    // Метод возвращает обработанную строку.
//    //Test Data:
//    // “    Red Rover School   “ →  “Red Rover School“
//    //“panda   “ → “pnd”
//    //“taramasalata” → “trmslt”
//
//    @Test
//    public void removeAllAs_HappyPath1() {
//
//        String text = "    Red Rover School   ";
//        String expectedResult = "Red Rover School";
//
//        String actualResult = new StringMethods().removeAllAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void removeAllAs_HappyPath2() {
//
//        String text = "panda";
//        String expectedResult = "pnd";
//
//        String actualResult = new StringMethods().removeAllAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    @Test
//    public void removeAllAs_HappyPath3() {
//
//        String text = "taramasalata";
//        String expectedResult = "trmslt";
//
//        String actualResult = new StringMethods().removeAllAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Negative
//    @Test
//    public void removeAllAs_Empty() {
//
//        String text = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().removeAllAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Task 3
//    //Написать алгоритм removeAllZeros().
//    //С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
//    // Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
//    // Метод возвращает обработанную строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
//    //Test Data:
//    // “3504209706040000 “ →  “35429764“
//    //“0000000111“ → “111”
//
//    @Test
//    public void removeAllZeros_HappyPath1() {
//        String numbers = "3504209706040000 ";
//        String expectedResult = "35429764";
//
//        String actualResult = new StringMethods().removeAllZeros(numbers);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void removeAllZeros_HappyPath2() {
//        String numbers = "0000000111";
//        String expectedResult = "111";
//
//        String actualResult = new StringMethods().removeAllZeros(numbers);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void removeAllZeros_HappyPathValidString() {
//        String numbers = "125346";
//        String expectedResult = "This is a valid string";
//
//        String actualResult = new StringMethods().removeAllZeros(numbers);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //negative
//    @Test
//    public void removeAllZeros_EmptyStringNegative() {
//        String numbers = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().removeAllZeros(numbers);
//
//        Assert.assertEquals(actualResult, expectedResult);
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
//    @Test
//    public void removeAllSpaces_HappyPath1() {
//        String text = "    R e d     Ro ve    r Sc   h ool   ";
//        String expectedResult = "RedRoverSchool";
//
//        String actualResult = new StringMethods().removeAllSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void removeAllSpaces_HappyPath2() {
//        String text = "p a     n   d a   ";
//        String expectedResult = "panda";
//
//        String actualResult = new StringMethods().removeAllSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void removeAllSpaces_HappyPath_OnlySpaces() {
//        String text = "       ";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().removeAllSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Negative
//    @Test
//    public void removeAllSpaces_EmptyString_Negative() {
//        String text = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().removeAllSpaces(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    //Task 5
//    //Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
//    // Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
//    // Итоговый результат должен строится с помощью метода из видео 2.
//    //Test Data:
//    //“Abracadabra” → “5, 6”
//    //“Homenum Revelio” → “0, 15”
//    //“3 tarAmasAlatA” → “6, 8”
//
//    @Test
//    public void countAs_method1_HappyPath_Contain_aA_NoSpaces() {
//        String text = "Abracadabra";
//        String expectedResult = "5, 6";
//
//        String actualResult = new StringMethods().countAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method1_HappyPath_No_Aa() {
//        String text = "Homenum Revelio";
//        String expectedResult = "0, 15";
//
//        String actualResult = new StringMethods().countAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method1_HappyPath_contains_Aa_and_Spaces() {
//        String text = "3 tarAmasAlatA";
//        String expectedResult = "6, 8";
//
//        String actualResult = new StringMethods().countAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method1_EmptyString() {
//        String text = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().countAs(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    @Test
//    public void countAs_method2_HappyPath_Contain_aA_NoSpaces() {
//        String text = "Abracadabra";
//        String expectedResult = "5, 6";
//
//        String actualResult = new StringMethods().countAs1(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method2_HappyPath_No_Aa() {
//        String text = "Homenum Revelio";
//        String expectedResult = "0, 15";
//
//        String actualResult = new StringMethods().countAs1(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method2_HappyPath_contains_Aa_and_Spaces() {
//        String text = "3 tarAmasAlatA";
//        String expectedResult = "6, 8";
//
//        String actualResult = new StringMethods().countAs1(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countAs_method2_EmptyString() {
//        String text = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().countAs1(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Task 6
//    //Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
//    //Test Data:
//    //“As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions.
//    // Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use,
//    // it will otherwise still support Java 8 with public updates for personal use indefinitely.
//    // Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true
//    //
//    //“99 little bugs in a code.
//    //99 little bugs in a code.
//    //Take one down, and patch it around.
//    //235 critical bugs in the code.” → false
//
//    @Test
//    public void countJava_HappyPath_True() {
//        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
//                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, " +
//                "it will otherwise still support Java 8 with public updates for personal use indefinitely. " +
//                "Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
//        boolean expectedResult = true;
//
//        boolean actualResult = new StringMethods().countJava(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    @Test
//    public void countJava_HappyPath_False() {
//        String text = "99 little bugs in a code.\n" +
//                "99 little bugs in a code.\n" +
//                "Take one down, and patch it around.\n" +
//                "235 critical bugs in the code.";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().countJava(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void countJava_HappyPath_Empty() {
//        String text = "";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().countJava(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    //Task 7
//    //Task 7
//    //Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
//    //Test Data:
//    //“Abracadabra” →  ““Abracadabra””
//
//    @Test
//    public void insertQuotes() {
//        String text = "Abracadabra";
//        String expectedResult = "\"Abracadabra\"";
//
//        String actualResult = new StringMethods().insertQuotes(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//
//    //Task 8
//    // Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
//    //(результат строится с помощью метода concat())
//    //
//    //Test Data:
//    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
//    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
//    //Задание со звездочкой:
//    //“Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
//    //"Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
//
//    @Test
//    public void insertQuotes_HappyPath1() {
//        String part1 = "Федор Достоевский писал";
//        String part2 = "Надо любить жизнь больше, чем смысл жизни.";
//        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
//
//        String actualResult = new StringMethods().insertQuotes(part1, part2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void insertQuotes_HappyPath2_WithInternalQuotes() {
//        String part1 = "Наполеон Бонапарт писал";
//        String part2 = "В моем словаре нет слова \"невозможно\".";
//        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";
//
//        String actualResult = new StringMethods().insertQuotes(part1, part2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//
//    //Task 9
//    // Напишите метод, кторый принимает на вход название города и исправляет написание:
//    //Test Data:
//    //“ташкент” → “Ташкент”
//    //“ЧикаГО” → “Чикаго”
//
//    @Test
//    public void cityName_HappyPath_AllLowerCase() {
//        String city = "ташкент";
//        String expectedResult = "Ташкент";
//
//        String actualResult = new StringMethods().cityName(city);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void cityName_HappyPath_MixLowerUpperCase() {
//        String city = "ЧикаГо";
//        String expectedResult = "Чикаго";
//
//        String actualResult = new StringMethods().cityName(city);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void cityName_HappyPath_Empty() {
//        String city = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().cityName(city);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 10
//    //Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все,
//    // что находится между первой и последней буквой-параметром:
//    //Test Data:
//    //“Abracadabra”, “b” → “bracadab”
//    //“Whippersnapper”, “p” → “ppersnapp”
//
//    @Test
//    public void separateText_HappyPath1() {
//        String text = "Abracadabra";
//        String letter = "b";
//        String expectedResult = "bracadab";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void separateText_HappyPath2() {
//        String text = "Whippersnapper";
//        String letter = "p";
//        String expectedResult = "ppersnapp";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void separateText_NoLetterInString() {
//        String text = "Whippersnapper";
//        String letter = "d";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void separateText_EmptyLetter() {
//        String text = "Whippersnapper";
//        String letter = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void separateText_EmptyString() {
//        String text = "";
//        String letter = "d";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void separateText_AllEmpty() {
//        String text = "";
//        String letter = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().betweenFirstAndLastLetter(text, letter);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 11
//    //Напишите метод, который принимает на вход слово, и возвращает true,
//    // если слово начинается и заканчивается на одинаковую букву, и false иначе
//    //Test Data:
//    //	“Abracadabra” → true
//    //	“Whippersnapper” → false
//
//    @Test
//    public void sameLetter_HappyPath_True() {
//        String text = "Abracadabra";
//        boolean expectedResult = true;
//
//        boolean actualResult = new StringMethods().sameLetters(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void sameLetter_HappyPath_False() {
//        String text = "Whippersnapper";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().sameLetters(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task12
//    //Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает последнее слово
//    //Test Data:
//    //	“Red Rover” → “Rover”
//
//    @Test
//    public void partOfString_HappyPath() {
//        String text = "Red Rover";
//        String expectedResult = "Rover";
//
//        String actualResult = new StringMethods().partOfString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void partOfString_EmptyString_Negative() {
//        String text = "";
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().partOfString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 13
//    //Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между двумя индексами включительно
//    //Test Data:
//    //	“Red rover”, 1, 4 → “Rover”
//
//    @Test
//    public void deletePartOfString_HappyPath_Index1lessThenIndex2() {
//        String text = "Red Rover";
//        int index1 = 1;
//        int index2 = 4;
//        String expectedResult = "Rover";
//
//        String actualResult = new StringMethods().deletePartOfString(text, index1, index2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void deletePartOfString_Index1GreaterThenIndex2() {
//        String text = "Red Rover";
//        int index1 = 4;
//        int index2 = 1;
//        String expectedResult = "Rover";
//
//        String actualResult = new StringMethods().deletePartOfString(text, index1, index2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Negative
//    @Test
//    public void deletePartOfString_EqualIndices_Negative() {
//        String text = "Red Rover";
//        int index1 = 4;
//        int index2 = 4;
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().deletePartOfString(text, index1, index2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void deletePartOfString_EmptyString_Negative() {
//        String text = "";
//        int index1 = 1;
//        int index2 = 4;
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().deletePartOfString(text, index1, index2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void deletePartOfString_IndexGretarThenStringLength_Negative() {
//        String text = "Red Rover";
//        int index1 = 1;
//        int index2 = 40;
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().deletePartOfString(text, index1, index2);
//
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    //Task 14
//    // Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
//    //Test Data:
//    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
//    //“Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
//
//    @Test
//    public void splitStringBySpaces_HappyPath_1() {
//        String text = "QA for Everyone";
//        String[] expectedResult = {"QA", "for", "Everyone"};
//
//        String[] actualResult = new StringMethods().splitString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitStringBySpaces_HappyPath_2() {
//        String text = "Александр Сергеевич Пушкин";
//        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
//
//        String[] actualResult = new StringMethods().splitString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitString_HappyPath_NoSpaces() {
//        String text = "АлександрСергеевичПушкин";
//        String[] expectedResult = {"АлександрСергеевичПушкин"};
//
//        String[] actualResult = new StringMethods().splitString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Nagative
//    @Test
//    public void splitString_EmptyString_Negative() {
//        String text = "";
//        String[] expectedResult = {};
//
//        String[] actualResult = new StringMethods().splitString(text);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 15
//    //Test Data:
//    //“Александр Сергеевич Пушкин” →
//    //
//    //“Имя: Александр
//    //Отчество: Сергеевич
//    //Фамилия: Пушкин”
//
//    //Method 1 (with arrays)
//
//    @Test
//    public void splitFirstMiddleLastName_HappyPath() {
//        String fullName = "Александр Сергеевич Пушкин";
//        String expectedResult = "Имя: Александр" + "\n" + "Отчество: Сергеевич" + "\n" + "Фамилия: Пушкин";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void splitFirstMiddleLastName_NoSpaces() {
//        String fullName = "АлександрСергеевичПушкин";
//        String expectedResult = "Error";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitFirstMiddleLastName_Empty() {
//        String fullName = "";
//        String expectedResult = "Error";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitFirstMiddleLastName_DifferentLength() {
//        String fullName = "Александр Пушкин";
//        String expectedResult = "Error";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Method 2 without arrays
//
//    @Test
//    public void splitFirstMiddleLastName2_HappyPath() {
//        String fullName = "Александр Сергеевич Пушкин";
//        String expectedResult = "Имя: Александр" + "\n" + "Отчество: Сергеевич" + "\n" + "Фамилия: Пушкин";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName2(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void splitFirstMiddleLastName2_NoSpaces() {
//        String fullName = "АлександрСергеевичПушкин";
//        String expectedResult = "Error";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName2(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitFirstMiddleLastName2_Empty() {
//        String fullName = "";
//        String expectedResult = "Error";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName2(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void splitFirstMiddleLastName2_DifferentLength() {
//        String fullName = "Александр Пушкин";
//        String expectedResult = "Name length is not equals to a provided header";
//
//        String actualResult = new StringMethods().splitFirstMiddleLastName2(fullName);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 16
//    //Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово повторяется n раз.
//    //Test Data:
//    //“one”, 5 → “oneoneoneoneone”
//
//    @Test
//    public void repeatString_HappyPath() {
//        String text = "one";
//        int number = 5;
//        String expectedResult = "oneoneoneoneone";
//
//        String actualResult = new StringMethods().repeatString(text, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void repeatString_EmptyString() {
//        String text = "";
//        int number = 5;
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().repeatString(text, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void repeatString_InvalidNumber() {
//        String text = "one";
//        int number = 0;
//        String expectedResult = "";
//
//        String actualResult = new StringMethods().repeatString(text, number);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Task 17
//
//    //Напишите метод, который принимает строку и index,
//    // и возвращает численное значение буквы, которая находится на позиции index
//    // (использовать только один метод класса String)
//    // "Abrakadabra"; 0  -- 65;    3  --  97
//
////    @Test
////    public void checkCharValueOfLetter_HappyPath() {
////        String text = "Abrakadabra";
////        int index = 0;
////        char expectedResult = 65;
////
////        char actualResult = new StringMethods().checkCharValueOfLetter(text, index);
////
////        Assert.assertEquals(actualResult, expectedResult);
////
////    }
//
//    @Test
//    public void checkCharValueOfLetter_HappyPath1() {
//        String text = "Abrakadabra";
//        int index = 3;
//        char expectedResult = 97;
//
//        char actualResult = new StringMethods().checkCharValueOfLetter(text, index);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void checkCharValueOfLetter_IndexGreaterThanStringLength() {
//        String text = "Abrakadabra";
//        int index = 33;
//        char expectedResult = (char)Integer.MAX_VALUE;
//
//        char actualResult = new StringMethods().checkCharValueOfLetter(text, index);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void checkCharValueOfLetter_InvalidIndex() {
//        String text = "Abrakadabra";
//        int index = -3;
//        char expectedResult = (char)Integer.MAX_VALUE;
//
//        char actualResult = new StringMethods().checkCharValueOfLetter(text, index);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void checkCharValueOfLetter_EmptyString() {
//        String text = "";
//        int index = 3;
//        char expectedResult = (char)Integer.MAX_VALUE;
//
//        char actualResult = new StringMethods().checkCharValueOfLetter(text, index);
//
//        Assert.assertEquals(actualResult, expectedResult);
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
//    @Test
//    public void ignoreStringCase_HappyPath_true(){
//        String s1 = "one";
//        String s2 = "One";
//        String s3 = "ONE";
//        boolean expectedResult = true;
//
//        boolean actualResult = new StringMethods().compareStringCase(s1, s2, s3);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void ignoreStringCase_HappyPath_false(){
//        String s1 = "one";
//        String s2 = "Один";
//        String s3 = "ONE";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().compareStringCase(s1, s2, s3);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    //Negative
//    @Test
//    public void ignoreStringCase_EmptyString(){
//        String s1 = "";
//        String s2 = "Один";
//        String s3 = "ONE";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().compareStringCase(s1, s2, s3);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//    @Test
//    public void ignoreStringCase_OnlySpacesString(){
//        String s1 = "      ";
//        String s2 = "Один";
//        String s3 = "   ";
//        boolean expectedResult = false;
//
//        boolean actualResult = new StringMethods().compareStringCase(s1, s2, s3);
//
//        Assert.assertEquals(actualResult, expectedResult);
//
//    }
//
//
//}
//
//
//
//
//
