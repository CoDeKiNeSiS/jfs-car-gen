package com.example.car_gen;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    Honda civic = new Honda("Blue", 2003,140, false);

    @Test
    public void testAccelerateSpeed() {
        Assert.assertEquals(55, civic.accelerateSpeed());
    }

    @Test
    public void testDecelerateSpeed() {
        Assert.assertEquals(45, civic.decelerateSpeed());
    }

    @Test
    public void testConvertToElectric() {
        Assert.assertEquals(true, civic.convertToElectric());
    }



}
