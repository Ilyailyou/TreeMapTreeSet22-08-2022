import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Иосип", "Броз Тито", 88));
        list.add(new Person("Ганс", "Фон Альберг", 84));
        list.add(new Person("Иисус", "Христос", 33));
        list.add(new Person("Стас", "Барецкий", 50));
        list.add(new Person("Абрахам", "Ван Хель Синг", 3));
        list.add(new Person("Васька", "Колбаськин", 1));
        Predicate<Person> predicate = (person) -> person.getAge() < 18;
        list.removeIf(predicate);
        Collections.sort(list, new PersonComparator(3));
        System.out.println(list);

    }
}
