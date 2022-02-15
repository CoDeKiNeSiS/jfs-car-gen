package com.example.car_gen;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    Honda civic = new Honda("Blue", 2003,140, true);


    @Test
    public void testAccelerateSpeed() {
        Assert.assertEquals(5, civic.accelerateSpeed());
    }

    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(0, civic.decelerateSpeed());
    }

    @Test
    public void testConvertToElectric() {
        Assert.assertEquals(true, civic.convertToElectric());
    }



}
