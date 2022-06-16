package javafaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static Faker faker = new Faker();

    public static void main(String[] args) {

        System.out.println(generateFakeFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateArtistName());
        System.out.println(generateChuckNorris());
    }

    public static String generateFakeFirstName() {

        return "Hello my names is " + faker.name().firstName();
    }

    public static String generateFakeLastName() {
        return "My surname is " + faker.name().lastName();
    }

    public static String generateFakeEmailAddress(){
        return "Email is " + faker.internet().emailAddress();
    }

    public static String generateArtistName(){
        return faker.artist().name();
    }

    public static String generateChuckNorris(){
        return  faker.chuckNorris().fact();
    }
}
