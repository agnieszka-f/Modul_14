package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        //When
        double result;
        result = calculator.add(2, 2);
        Assert.assertEquals(4,result,0);

        result = calculator.sub(8,7);
        Assert.assertEquals(1,result,0);

        result = calculator.mul(5,5);
        Assert.assertEquals(25,result,0);

        result = calculator.div(9,3);
        Assert.assertEquals(3,result,0);
    }
}
