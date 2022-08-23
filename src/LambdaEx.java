import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class LambdaEx {

    public static void main(String[] args) {

        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        Collections.sort(listOfPerson, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        System.out.println(" sort persons by age in ascending order");
        listOfPerson.forEach(
                (person) -> System.out.println(" Person name : " + person.getName()));
    }
}

