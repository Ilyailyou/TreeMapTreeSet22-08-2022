import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Иосип", "Броз Тито", 88));
        list.add(new Person("Ганс", "Фон Альберг", 84));
        list.add(new Person("Иисус", "Христос", 33));
        list.add(new Person("Стас", "Барецкий", 50));
        list.add(new Person("Абрахам", "Ван Хель Синг", 3));
        Collections.sort(list, new PersonComparator(1));
        System.out.println(list);
        Collections.sort(list, new PersonComparator(3));
        System.out.println(list);

    }
}
