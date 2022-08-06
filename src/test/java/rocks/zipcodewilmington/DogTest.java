package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setBirthDateTest() {

        //Given
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        //When
        Dog fitru = new Dog(givenName, givenBirthDate, givenId);
        Date date = new Date();
        fitru.setBirthDate(date);
        Date expected = date;
        Date actual = fitru.getBirthDate();



        //Given
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void speakTest(){

        //Given
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        //When
        Dog fitru = new Dog(givenName, givenBirthDate, givenId);
        fitru.speak();
        String expected = "bark!";
        String actual = fitru.speak();


        //Given
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void eat(){

        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);
        Food apple = new Food();
        Food banana = new Food();
        Food peaches = new Food();

        fitru.getNumberOfMealsEaten();
        fitru.eat(apple);
        fitru.eat(banana);
        fitru.eat(peaches);
        Integer expected = 3;
        Integer actual = fitru.getNumberOfMealsEaten();

        //Given
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getId() {
        //Given
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Dog fitru = new Dog(givenName, givenBirthDate, givenId);
        Integer expected = 5;
        Integer actual = fitru.getId();

        //Given
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalInheritance() {

        //Given
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Dog fitru = new Dog(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(fitru instanceof Animal);
    }

    @Test
    public void checkMammalInheritance() {

        //Given
        String givenName = "Name of Dog";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Dog fitru = new Dog(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(fitru instanceof Mammal);

    }
}
