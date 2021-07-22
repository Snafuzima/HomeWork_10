import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Phonebook  {
    private HashMap<String, List<String>> phonebook;
    private List<String> numbersList;

    public Phonebook() {
        this.phonebook=new HashMap<>();

    }

    //добавляем значения в phonebook
    public void add(String name, String num) {
        if (phonebook.containsKey(name)) {
            numbersList = phonebook.get(name);
            numbersList.add(num);
            phonebook.put(name, numbersList);
        } else {
            numbersList = new ArrayList<>();
            numbersList.add(num);
            phonebook.put(name,numbersList);
        }
    }

    //получаем номер(а) по имени, ошибка при отсутствии имени
    public List<String> get(String name) {
        if (phonebook.containsKey(name)) {
            return phonebook.get(name);
        } else {
            System.err.println("no such name found");
            return new ArrayList<>();
        }

    }



}
