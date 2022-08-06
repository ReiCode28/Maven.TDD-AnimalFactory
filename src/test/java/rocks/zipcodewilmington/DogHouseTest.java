package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    String givenName1 = "Scooby";
    Date givenBirthDate1 = new Date();
    Integer givenId1 = 4;
    Dog firstDog = new Dog(givenName1, givenBirthDate1, givenId1);
    String givenName2 = "Fido";
    Date givenBirthDate2 = new Date();
    Integer givenId2 = 7;
    Dog secondDog = new Dog(givenName2, givenBirthDate2, givenId2);


    @Test
    public void addDogTest() {
        DogHouse.clear();
        DogHouse.add(firstDog);

        DogHouse.add(secondDog);
        Integer actualNumOfDogs = 2;
        Integer expectedNumOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);


    }

    @Test
    public void removeDogTest(){
        DogHouse.clear();
        DogHouse.add(firstDog);

        DogHouse.remove(firstDog);
        Integer actualNumOfDogs = 0;
        Integer expectedNumOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);
    }

    @Test
    public void removeDogById() {
        DogHouse.clear();
        DogHouse.add(firstDog);

        DogHouse.remove(firstDog.getId());
        Integer actualNumOfDogs = 0;
        Integer expectedNumOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);
        Assert.assertNull(DogHouse.getDogById(4));
    }

    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        DogHouse.add(firstDog);

        DogHouse.getDogById(firstDog.getId());
        Integer actualDogId = 4;
        Integer expectedDogId = firstDog.getId();

        Assert.assertEquals(expectedDogId, actualDogId);


    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        DogHouse.clear();
        DogHouse.add(firstDog);

        // When
        DogHouse.getNumberOfDogs();
        Integer expectedNumOfDogs = 1;
        Integer actualNumOfDogs = DogHouse.getNumberOfDogs();


        // Then
        Assert.assertEquals(expectedNumOfDogs, actualNumOfDogs);
    }
}
