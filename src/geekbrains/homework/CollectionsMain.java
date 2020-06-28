package geekbrains.homework;

import java.util.HashMap;

public class CollectionsMain {
    //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
    public static void main(String[] args) {
        String[] words = {"Ехал",
                "Грека",
                "Через",
                "Реку",
                "Видит",
                "Грека",
                "В",
                "Речке",
                "Рак",
                "Сунул",
                "Грека",
                "Руку",
                "В",
                "Реку",
                "Рак",
                "За",
                "Руку",
                "Греку",
                "Цап"};
        HashMap<String, Integer> uniqueAndCounts = new HashMap<String, Integer>();
        for (String word : words) {
            Integer frequency = uniqueAndCounts.get(word);
            uniqueAndCounts.put(word, frequency == null ? 1 : frequency + 1);//аполняем мапу, ключём из массива строк и значениями количество повторов
        }
        System.out.println(uniqueAndCounts);

        //2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        // тогда при запросе такой фамилии должны выводиться все телефоны.

        //Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще дополнительные поля
        // (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
        // Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Тестов", "+7 987 654 32 10");
        phoneBook.add("Тестов2", "+7 924 111 22 33");
        phoneBook.add("Тестов3", "+7 924 111 22 34");
        phoneBook.add("Тестов", "+7 924 111 22 35");
        phoneBook.info();

        System.out.println(" У Тестова номера: " + phoneBook.get("Тестов"));
    }


}

