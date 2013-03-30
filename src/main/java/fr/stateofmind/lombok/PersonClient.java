package fr.stateofmind.lombok;

import lombok.ExtensionMethod;

import java.util.Arrays;

@ExtensionMethod({Arrays.class, PersonClient.class})
public class PersonClient {

    public static void main(String[] args) {
//        Person person = Person.of();

        Person person = new Person();
        boolean woman = person.isWoman();
        String name = person.getLastname();

        Person person2 = new Person(1L, "Joe", false);
        System.out.println("person2 = " + person2);
    }
}
