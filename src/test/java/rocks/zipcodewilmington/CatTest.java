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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`




    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Cat";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);



    }
    @Test
    public void setBirthDateTest() {

        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);
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
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;


        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);
        fitru.speak();
        String expected = "meow!";
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
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);
        Integer expected = 5;
        Integer actual = fitru.getId();

        //Given
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkAnimalInheritance() {

        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(fitru instanceof Animal);
    }

    @Test
    public void checkMammalInheritance() {

        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 5;

        //When
        Cat fitru = new Cat(givenName, givenBirthDate, givenId);

        //Then
        Assert.assertTrue(fitru instanceof Mammal);

    }



}
