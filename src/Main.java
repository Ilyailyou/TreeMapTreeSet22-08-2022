import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Иосип", "Броз Тито", 88));
        list.add(new Person("Ганс", "Фон Альберг", 84));
        list.add(new Person("Иисус", "Христос", 33));
        list.add(new Person("Стас", "Барецкий", 50));
        list.add(new Person("Абрахам", "Ван Хель Синг", 3));
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int count1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int count2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            if(count1 != count2 && !(count1>=3 && count2>=3)) {
                return Integer.compare(count1, count2);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
