package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    String givenName1 = "Tom";
    Date givenBirthDate1 = new Date();
    Integer givenId1 = 4;
    Cat firstCat = new Cat(givenName1, givenBirthDate1, givenId1);
    String givenName2 = "Tom";
    Date givenBirthDate2 = new Date();
    Integer givenId2 = 7;
    Cat secondCat = new Cat(givenName2, givenBirthDate2, givenId2);



    @Test
    public void addCatTest() {

        CatHouse.add(firstCat);
        CatHouse.add(secondCat);
        Integer numberOfCat = 2;

        Assert.assertEquals(firstCat, CatHouse.getCatById(4));
        Assert.assertEquals(numberOfCat, CatHouse.getNumberOfCats());

    }
    @Test
    public void removeCatTest() {
        CatHouse.clear();
        CatHouse.add(firstCat);

        CatHouse.remove(firstCat);
        Integer numberOfCat = 0;
        Integer actualCatNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(numberOfCat, actualCatNumber);


    }

    @Test
    public void removeCatIdTest(){
        CatHouse.clear();
        CatHouse.add(firstCat);
        CatHouse.add(secondCat);

        CatHouse.remove(secondCat.getId());
        Integer numberOfCat = 1;
        Integer actualCatNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(numberOfCat, actualCatNumber);
        Assert.assertNull(CatHouse.getCatById(7));


    }

    @Test
    public void getCatByIdTest(){
        CatHouse.add(firstCat);

        CatHouse.getCatById(firstCat.getId());
        Integer expectedCatId = 4;
        Integer actualCatId = firstCat.getId();

        Assert.assertEquals(expectedCatId, actualCatId);


    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse.clear();
        CatHouse.add(firstCat);
        CatHouse.add(secondCat);

        CatHouse.getNumberOfCats();
        Integer expectedNumOfCats = 2;
        Integer actualNumOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumOfCats, actualNumOfCats);
    }
}
