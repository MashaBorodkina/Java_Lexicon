package se.lexicon.mb;

import org.junit.jupiter.api.Test;
import se.lexicon.mb.JavaFundamental_Part1.CalculatorLogic;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorLogicTest {
         @Test
        public void testAddition() {
            assertEquals(5, CalculatorLogic.calculate(2, 3, "+"));
        }

        @Test
        public void testSubtraction() {
            assertEquals(1, CalculatorLogic.calculate(4, 3, "-"));
        }

        @Test
        public void testMultiplication() {
            assertEquals(6, CalculatorLogic.calculate(2, 3, "*"));
        }

        @Test
        public void testDivision() {
            assertEquals(2, CalculatorLogic.calculate(6, 3, "/"));
        }

        @Test
        public void testDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> CalculatorLogic.calculate(5, 0, "/"));
        }

        @Test
        public void testInvalidOperator() {
            assertThrows(IllegalArgumentException.class, () -> CalculatorLogic.calculate(5, 5, "%"));
        }
    }

