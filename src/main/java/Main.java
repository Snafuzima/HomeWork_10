
/* 1) Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово. Можно сделать с помощью коллекций.

2) Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add()
можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
 взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.*/


import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Первое задание:");
        firstTask();
        System.out.println();

        System.out.println("Второе задание:");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "93333332222");
        phonebook.add("Surkov", "82221114444");
        phonebook.add("Surkov", "88005353535");
        phonebook.add("Smirnov", "72223334867");

        System.out.println("Номера по фамилии Сурков: ");
        System.out.print(phonebook.get("Surkov"));
        System.out.println("\n");

        System.out.println("Не существующая фамилия.");
        System.out.println(phonebook.get("Ivanov"));



    }




        private static void firstTask() {
            List<String> words = new ArrayList<>();

            //добавляем слова
            words.add("apple");
            words.add("egg");
            words.add("chicken");
            words.add("apple");
            words.add("orange");
            words.add("egg");
            words.add("avocado");
            words.add("beer");
            words.add("chicken");
            words.add("chicken");
            words.add("egg");
            words.add("beer");
            words.add("beer");
            words.add("nuggets");
            words.add("cabbage");

            // переводим в Map, чтобы посчитать слова
            Map<String, Integer> valueWords = new HashMap<>();
            for (String s : words) {
                valueWords.put(s, valueWords.getOrDefault(s, 0) + 1);
            }


            // переводим слова из list в Set, который удалит дубликаты и выведет отдельный список с уникальными значениями
            HashSet<String> uniqueWords = new HashSet<String>(words);


            //выводим результаты
            System.out.println(words);
            System.out.println();
            System.out.println(uniqueWords);
            System.out.println();
            System.out.println(valueWords);


        }

}
