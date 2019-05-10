package assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author situ1
 */

/**
 * This is a class called Programmer
 */
public class Programmer {
    
    /**
     * Here I declare the instance variables such as 
     * programmerName, programmingLanguage, programmingLevel with datatype String and
     * startDate, endDate with datatype LocalDate
     */
    private String programmerName, programmingLanguage, programmingLevel;
    private LocalDate startDate, endDate;

    /**
     * This is a constructor of instance variable 
     * we set our instance variable, so that we can validate them
     */
    public Programmer(String programmerName, String programmingLanguage, String programmingLevel, LocalDate startDate, LocalDate endDate) {
        setProgrammerName(programmerName);
        setProgrammingLanguage(programmingLanguage);
        setProgrammingLevel(programmingLevel);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    /**
     * This is a get method which returns the programmer name
     */
    public String getProgrammerName() {
        return programmerName;
    }

    /**
     * This is a set method of programmer name with validation 
     * Here programmer name must start with an uppercase otherwise its throw an error
     * For that we use matches method that allow user to must input name with an uppercase
     */
    public void setProgrammerName(String programmerName) {
        if(programmerName.matches("[A-Z][a-z]*"))
            this.programmerName = programmerName;
        else
            throw new IllegalArgumentException ("Programmer name must start with an uppercase");
    }

    /**
     * This is a get method which returns the programming language
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * This is a set method  of programming language with validation 
     * Here I choose seven programming languages and user must select programming language among them
     * here I use equalsIgnoreCase() method so that there is no worries about uppercase or lowercase letters for selecting programming language
     * if user select other programming language which is not in the list, then throw an error
     */
    public void setProgrammingLanguage(String programmingLanguage) {
        if
        (
            programmingLanguage.equalsIgnoreCase("Java") ||
            programmingLanguage.equalsIgnoreCase("Python") ||
            programmingLanguage.equalsIgnoreCase("Swift") ||
            programmingLanguage.equalsIgnoreCase("JavaScript") ||
            programmingLanguage.equalsIgnoreCase("Kotlin") ||
            programmingLanguage.equalsIgnoreCase("SQL") ||
            programmingLanguage.equalsIgnoreCase("PHP") 
        )
            this.programmingLanguage = programmingLanguage;
        else
            throw new IllegalArgumentException ("Programming language field can't be empty and must take place from the list");
    }

    /**
     * This is a get method which returns the programming level
     */
    public String getProgrammingLevel() {
        return programmingLevel;
    }
    
    /**
     * This is a set method of programming level with validation 
     * Here there are three programming level and user must select programming level among them
     * here I use equalsIgnoreCase() method so that there is no worries about uppercase or lowercase letters for selecting programming level
     * if user select other programming level which is not in the list, then throw an error
     */
    public void setProgrammingLevel(String programmingLevel) {
        if
        (   
            programmingLevel.equalsIgnoreCase("beginner") ||
            programmingLevel.equalsIgnoreCase("intermediate") ||
            programmingLevel.equalsIgnoreCase("advanced") 
        )
            this.programmingLevel = programmingLevel;
        else
            throw new IllegalArgumentException("Programming level field can't be empty");
    }

    /**
     * This is a get method which returns the start date
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * This is a set method of start date with validation
     * Here I validate that start date must take place after current date
     * otherwise its throw an error 
     */
    public void setStartDate(LocalDate startDate) {
        if(startDate.isAfter(LocalDate.now()))
            this.startDate = startDate;
        else
            throw new IllegalArgumentException("Please choose proper date when you will start to learn programming language");
    }

    /**
     * This is a get method which returns the end date
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * This is a set method of end date with validation
     * Here I validate that end date must take place after current date and start date
     * otherwise its throw an error 
     */
    public void setEndDate(LocalDate endDate) {
        if(endDate.isAfter(LocalDate.now()) && endDate.isAfter(startDate))
            this.endDate = endDate;
        else
            throw new IllegalArgumentException("Choose valid end date when you will finish programming language");
    }

    /**
     * Here duration method returns the period between start and end date and returns the years
     */
    public int getDuration() 
    {
        int durationYears = Period.between(startDate, endDate).getMonths();
        return (endDate.getYear()- startDate.getYear());
    }
       
    /**
     * This is a toString which returns the string with information
     * @return 
     */
    public String toString()
    {
        return String.format("The Programmer %s is %s in %s and wants to start programming language on %s and will finish on %s." , programmerName, programmingLevel, programmingLanguage, startDate, endDate);
    }
    
}
