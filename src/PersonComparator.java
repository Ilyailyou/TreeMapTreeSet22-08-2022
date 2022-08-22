import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int max;

    public PersonComparator(int max){
        this.max = max;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int c1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int c2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        if(c1 != c2 && !(c1>=max && c2>=max)) {
            return Integer.compare(c1, c2);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
