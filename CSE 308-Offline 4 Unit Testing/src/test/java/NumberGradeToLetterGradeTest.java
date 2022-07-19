import org.junit.jupiter.api.*;

class NumberGradeToLetterGradeTest {

    private NumberGradeToLetterGrade gradeCalculator;


    @Nested
    class ConstructorTest{
        @Test
        void credit3DoesNotThrowExceptions(){
            Assertions.assertDoesNotThrow(() -> new NumberGradeToLetterGrade("3"));
        }

        @Test
        void credit4DoesNotThrowExceptions(){
            Assertions.assertDoesNotThrow(() -> new NumberGradeToLetterGrade("4"));
        }

        @Test
        void credit2ThrowsException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> new NumberGradeToLetterGrade("2"));
        }

        @Test
        void credit5ThrowsException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> new NumberGradeToLetterGrade("5"));
        }

        @Test
        void credit3point5ThrowsException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> new NumberGradeToLetterGrade("3.5"));
        }

        @Test
        void nonNumberCreditThrowsException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> new NumberGradeToLetterGrade("asd"));
        }
    }



    @Nested
    class ThreeCreditNumberGradeToLetterGradeTest {

        @BeforeEach
        void setUp(){
            gradeCalculator = new NumberGradeToLetterGrade("3");
        }
        
        @Test
        void number350ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("350"));
        }

        @Test
        void number300point8ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("300.8"));
        }

        @Test
        void number300point3ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("300.3"));
        }

        @Test
        void number300ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("300"));
        }

        @Test
        void number270ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("270"));
        }

        @Test
        void number239point8ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("239.8"));
        }

        @Test
        void number239point3ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("239.3"));
        }

        @Test
        void number239ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("239"));
        }

        @Test
        void number220ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("220"));
        }

        @Test
        void number209point8ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("209.8"));
        }

        @Test
        void number209point3ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("209.3"));
        }

        @Test
        void number209ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("209"));
        }

        @Test
        void number195ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("195"));
        }

        @Test
        void number179point8ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("179.8"));
        }

        @Test
        void number179point3ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("179.3"));
        }

        @Test
        void number179ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("179"));
        }

        @Test
        void number100ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("100"));
        }

        @Test
        void number0ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("0"));
        }

        @Test
        void numberNegative0point3ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-0.3"));
        }

        @Test
        void numberNegative0point8ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-0.8"));
        }


        @Test
        void numberNegative100ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-100"));
        }

        @Test
        void nonNumberInputShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade(""));
        }

        @AfterEach
        void tearDown(){
            gradeCalculator = null;
        }

    }



    @Nested
    class FourCreditNumberGradeToLetterGradeTest {

        @BeforeEach
        void setUp(){
            gradeCalculator = new NumberGradeToLetterGrade("4");
        }

        @Test
        void number450ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("450"));
        }

        @Test
        void number400point5ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("400.5"));
        }

        @Test
        void number400ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("400"));
        }

        @Test
        void number350ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("350"));
        }

        @Test
        void number319point8ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("319.8"));
        }

        @Test
        void number319point3ShouldReturnA(){
            Assertions.assertEquals("A", gradeCalculator.calculateGrade("319.3"));
        }

        @Test
        void number319ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("319"));
        }

        @Test
        void number300ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("300"));
        }

        @Test
        void number279point8ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("279.8"));
        }

        @Test
        void number279point3ShouldReturnB(){
            Assertions.assertEquals("B", gradeCalculator.calculateGrade("279.3"));
        }

        @Test
        void number279ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("279"));
        }

        @Test
        void number260ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("260"));
        }

        @Test
        void number239point8ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("239.8"));
        }

        @Test
        void number239point3ShouldReturnC(){
            Assertions.assertEquals("C", gradeCalculator.calculateGrade("239.3"));
        }

        @Test
        void number239ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("239"));
        }

        @Test
        void number100ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("100"));
        }

        @Test
        void number0ShouldReturnF(){
            Assertions.assertEquals("F", gradeCalculator.calculateGrade("0"));
        }

        @Test
        void numberNegative0point3ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-0.3"));
        }

        @Test
        void numberNegative0point8ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-0.8"));
        }

        @Test
        void numberNegative100ShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-100"));
        }

        @Test
        void nonNumberInputShouldThrowException(){
            Assertions.assertThrowsExactly(IllegalArgumentException.class, ()-> gradeCalculator.calculateGrade("-asd"));
        }

        @AfterEach
        void tearDown(){
            gradeCalculator = null;
        }

    }

}