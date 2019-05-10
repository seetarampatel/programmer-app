package assignment2;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author situ1
 */
public class ProgrammerTest {
    
    /**
     * Here I declare the local variable programmer for testing methods
     */
    Programmer programmer;
    
    public ProgrammerTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }
    
    /**
     * Here, we declare the new programmer object with default values of instance variables
     */
    @Before
    public void setUp() 
    {
        programmer = new Programmer("Seetaram", "Java", "Intermediate", LocalDate.of(2018, Month.DECEMBER, 15), LocalDate.of(2019, Month.JULY, 25));
    }
    
    @After
    public void tearDown() 
    {
    }

    /**
     * Test of getProgrammerName method, of class Programmer.
     * here we first declare a String variable expResult for programmer name
     * we also get the value of programmer name from our programmer object and match it with variable expResult 
     * if both name are match, then the test testGetProgrammerName() will be passed
     */
    @Test
    public void testGetProgrammerName() 
    {
        String expResult = "Seetaram";
        String result = programmer.getProgrammerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgrammerName method, of class Programmer.
     * we set new random programmer name and also match it with validating rules of programmer name
     * if both are same then testSetProgrammerName() test will be passed
     */
    @Test
    public void testSetProgrammerName() 
    {
        programmer.setProgrammerName("Situ");
        String result = programmer.getProgrammerName();
        assertEquals("Situ", result);
    }

    /**
     * Here we take programmer name which start with lowercase
     * because the programmer name is not valid so that catch block throw an exception
     */
    @Test
    public void testInvalidProgrammerName()
    {
        try
        {
            programmer.setProgrammerName("kanu"); 
            fail("Programmer name must dtart with an uppercase");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }
    
    /**
     * Test of getProgrammingLanguage method, of class Programmer.
     * here we first declare a String variable expResult for programming language
     * we also get the value of programming language from our programmer object and match it with variable expResult 
     * if both name are match, then the test testGetProgrammingLanguage() will be passed
     */
    @Test
    public void testGetProgrammingLanguage() 
    {
        String expResult = ("Java");             
        String result = programmer.getProgrammingLanguage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgrammingLanguage method, of class Programmer.
     * For below seven tests,
     * we set new random programming language and also match it with validating rules of programming language 
     * if both are same then testSetProgrammerName() test will be passed
     */
    
    @Test
    public void testSetProgrammingLanguageJava() 
    {
        programmer.setProgrammingLanguage("Java");
        String result = programmer.getProgrammingLanguage();
        assertEquals("Java", result);
    }
    
    
    @Test
    public void testSetProgrammingLanguagePython() 
    {
        programmer.setProgrammingLanguage("Python");
        String result = programmer.getProgrammingLanguage();
        assertEquals("Python", result);
    }

    @Test
    public void testSetProgrammingLanguageSwift() 
    {
        programmer.setProgrammingLanguage("Swift");
        String result = programmer.getProgrammingLanguage();
        assertEquals("Swift", result);
    }
    
    @Test
    public void testSetProgrammingLanguageJavaScript() 
    {
        programmer.setProgrammingLanguage("JavaScript");
        String result = programmer.getProgrammingLanguage();
        assertEquals("JavaScript", result);
    }
    
    @Test
    public void testSetProgrammingLanguageKotlin() 
    {
        programmer.setProgrammingLanguage("Kotlin");
        String result = programmer.getProgrammingLanguage();
        assertEquals("Kotlin", result);
    }
    
    @Test
    public void testSetProgrammingLanguageSQL() 
    {
        programmer.setProgrammingLanguage("SQL");
        String result = programmer.getProgrammingLanguage();
        assertEquals("SQL", result);
    }
    
    @Test
    public void testSetProgrammingLanguagePHP() 
    {
        programmer.setProgrammingLanguage("PHP");
        String result = programmer.getProgrammingLanguage();
        assertEquals("PHP", result);
    }
    
    /**
     * Here we take programming language HTML which is not in the list
     * so here in try block exception are occurred and in catch block exceptions are handled
     * here if user select programming language which is not in the list then its throw an exception
     */
    @Test
    public void testSetProgrammingLanguageIsInvalid()
    {
        try
        {
            programmer.setProgrammingLanguage("HTML"); 
            fail("Programming language must be from the list");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Programming Language: "+e.getMessage());      // This will print the exception message
        }
    }
    
    /**
     * Test of getProgrammingLevel method, of class Programmer.
     * here we first declare a String variable expResult for programming level
     * we also get the value of programming level from our programmer object and match it with variable expResult 
     * if both name are match, then the test testGetProgrammingLevel() will be passed
     */
    @Test
    public void testGetProgrammingLevel() 
    {
        String expResult = ("Intermediate");              
        String result = programmer.getProgrammingLevel();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setProgrammingLevel method, of class Programmer.
     * For below three tests,
     * we set new random programming level and also match it with validating rules of programming level 
     * if both are same then testSetProgrammingLevel() test will be passed
     */
    @Test
    public void testSetProgrammingLevelbeginner() 
    {
        programmer.setProgrammingLevel("Beginner");
        String result = programmer.getProgrammingLevel();
        assertEquals("Beginner", result);
    }
    
    @Test
    public void testSetProgrammingLevelintermediate() 
    {
        programmer.setProgrammingLevel("Intermediate");
        String result = programmer.getProgrammingLevel();
        assertEquals("Intermediate", result);
    }

    @Test
    public void testSetProgrammingLeveladvanced() 
    {
        programmer.setProgrammingLevel("Advanced");
        String result = programmer.getProgrammingLevel();
        assertEquals("Advanced", result);
    }

    /**
     * Here we take programming level Expert which is not in the list
     * here if user select programming level which is not in the list then its throw an exception
     * the catch block throw an exception if user select programming level which is not in the list
     */
    @Test
    public void testSetProgrammingLevelIsInvalid()
    {
        try
        {
            programmer.setProgrammingLevel("Expert");
            fail("Programming level must be from the list");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid Programming Level: "+e.getMessage());
        }
    }
    
    /**
     * Test of getStartDate method, of class Programmer.
     * here we first declare a LocalDate variable expResult for start date 
     * we also get the value of start date from our programmer object and match it with LocalDate variable expResult 
     * if both name are match, then the test testGetStartDate will be passed
     */
    
    @Test
    public void testGetStartDate() 
    {
        LocalDate expResult = LocalDate.of(2018, Month.DECEMBER, 15);
        LocalDate result = programmer.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate method, of class Programmer.
     * For below test,
     * we set new random start date and also match it with validating rules of start date
     * if both are same then testSetStartDate() test will be passed
     */
    @Test
    public void testSetStartDate() 
    {
        programmer.setStartDate(LocalDate.of(2019, Month.JANUARY, 10));
        LocalDate result = programmer.getStartDate();
        assertEquals(LocalDate.of(2019, Month.JANUARY, 10), result);
    }

    /**
     * Here we take start date which exist in the past
     * because the start date is not valid so that catch block throw an exception
     */
    @Test
    public void testSetStartDateIsInvalid()
    {
        try
        {
            LocalDate startDate = LocalDate.of(2016, Month.JULY, 12);
            programmer.setStartDate(startDate);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("The start date is exist in past, valid start date must take place in the future");
        }
    }
    
    /**
     * Test of getEndDate method, of class Programmer.
     * here we first declare a LocalDate variable expResult for end date 
     * we also get the value of end date from our programmer object and match it with LocalDate variable expResult 
     * if both name are match, then the test testGetEndDate will be passed
     */
    @Test
    public void testGetEndDate() 
    {
        LocalDate expResult = LocalDate.of(2019, Month.JULY, 25);
        LocalDate result = programmer.getEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEndDate method, of class Programmer.
     * For below test,
     * we set new random end date and also match it with validating rules of end date
     * if both are same then testSetEndDate() test will be passed
     * 
     */
    @Test
    public void testSetEndDate() 
    {
        programmer.setEndDate(LocalDate.of(2019, Month.SEPTEMBER, 17));
        LocalDate result = programmer.getEndDate();
        assertEquals(LocalDate.of(2019, Month.SEPTEMBER, 17), result);
    }

    /**
     * Here we take end date which exist in the past
     * because the end date is not valid so that catch block throw an exception
     */
    @Test
    public void testSetEndDateIsInvalid()
    {
        
        try
        {
            LocalDate endDate = LocalDate.of(2016, Month.JUNE, 14);
            programmer.setEndDate(endDate);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("The end date is exist in past, valid end date must take place in the future");
        }
    }
    
    /**
     * Here we take end date which is in the future but it is before start date
     * because the end date is not valid so that catch block throw an exception
     */
    @Test
    public void testSetEndDateIsInvalidInFuture()
    {
        
        try
        {
            LocalDate endDate = LocalDate.of(2018, Month.DECEMBER, 11);
            programmer.setEndDate(endDate);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("The end date is exist in future before start date, valid end date must take place after start date");
        }
    }
    
    /**
     * Test of getDuration method, of class Programmer.
     * This method calculate the duration by calculating period between start date and end date
     * here we declare a Integer variable expResult 
     * if both are duration are same, then testGetDuration() test will be passed
     */
    @Test
    public void testGetDuration()
    {
        int expResult = 1;
        int result = programmer.getDuration();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class Programmer.
     */
    @Test
    public void testToString()
    {
        String expResult = "The Programmer Seetaram is Intermediate in Java and wants to start programming language on 2018-12-15 and will finish on 2019-07-25.";
        String result = programmer.toString();
        assertEquals(expResult, result);
    }
}
