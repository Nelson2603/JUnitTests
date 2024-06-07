package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

@DisplayName("Тест для класса Калькулятор")
public class TestCalculator {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Тест для метода плюс")
    public void testMethodPlusWithTwoNumbers() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(40,calculator.plus(20,20));

    }

    @Test
    public void testMethodMinusWithTwoNumbers() {
       Assertions.assertEquals(20,calc.minus(60,40));
    }

    @Test
    public void divideTwoNumbers() {
        Assertions.assertEquals(5,calc.divide(10,2));
        Assertions.assertEquals(2.5,calc.divide(5,2));
    }


    @Test
    public void testMethodMultiplyTwoNumbers() {
        Assertions.assertEquals(20,calc.multiply(10,2));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    public void testMethodIsEven (int n) {
        Assertions.assertEquals(true,calc.isEven(n));
    }

    @Test
    public void testAddNumberToList () {
        calc.addList(2);
        calc.addList(3);
        calc.addList(4);
        Assertions.assertEquals(4,calc.numbers.size());
        Assertions.assertTrue(calc.numbers.contains(2));
        Assertions.assertTrue(calc.numbers.contains(3));
        Assertions.assertTrue(calc.numbers.contains(4));

    }

    @Test
    public void testDeleteNumberFromList () {
        calc.addList(10);
        calc.addList(20);

        calc.deliteNumber(10);
        Assertions.assertEquals(4,calc.numbers.size()) ;
        Assertions.assertIterableEquals(Arrays.asList(1,2,3,20),calc.numbers);
    }

    @BeforeEach
    public void before(){
        System.out.println("лист подготовлен для теста");
        calc.addList(1);
        calc.addList(2);
        calc.addList(3);
    }

    @AfterEach
    public void after(){
        calc = null;
    }


}
