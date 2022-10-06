import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // nothing happens

        Person[] people = new Person[3];
        people[0] = new Person("Jenny");
        people[1] = new Person("Kenny");
        people[2] = new Person("Peter");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person[] newArray = addPerson(people, new Person("Ramaj"));

        for (Person person : newArray) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] peopleArray, Person personToAdd) {
        Person[] tempArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        tempArray[tempArray.length - 1] = personToAdd;

        return tempArray;
    }
}

