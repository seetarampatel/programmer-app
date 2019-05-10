package assignment2;

import java.net.URL;
import java.time.Period;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author situ1
 */
public class CreateProgrammerController implements Initializable {

    /**
     * This is a local variable programmerNameTextField with object TextField
     */
    @FXML
    private TextField programmerNameTextField;
     
    /**
     * This is a local variable programmingLanguageComboBox with object ComboBox
     * we also pass String as Object
     */
    @FXML
    private ComboBox<String> programmingLanguageComboBox;
    
    /**
     * These are variables for radio buttons with object RadioButton
     */
    @FXML
    private RadioButton beginnerRadioButton;

    @FXML
    private RadioButton IntermediateRadioButton;

    @FXML
    private RadioButton advancedRadioButton;
    
    /**
     * This is a Toggle group which combine radio buttons and allow us to move from one to another radio button
     */
    private ToggleGroup progLevelToggleGroup;
    
    /**
     * This is a variable languagePhotoImageView with object ImageView which store the image
     */
    @FXML
    private ImageView languagePhotoImageView;
    
    /**
     * These are local variable with object DatePicker
     */
    @FXML
    private DatePicker startDatePicker;

    @FXML
    private DatePicker endDatePicker;
    
    /**
     * This is a local variable getDurationOfLanguage with object Label
     */
    @FXML
    private Label getDurationOfLanguage;
    
    /**
     * This is a local variable createProgrammerButtonPushed with object button
     */
    @FXML
    private Button createProgrammerButtonPushed;
    
    /**
     * This is a local variable errMsgLabel with object Label
     */
    @FXML
    private Label errMsgLabel;
    
    /**
     * This is a action which I put on programmingLanguage ComboBox
     * user can choose any programming language from comboBox and,
     * the picture of that programming language automatically set in ImageView
     */
    @FXML
    public void changeProgLanguageImage()
    {
        String chooseProgLanguage = programmingLanguageComboBox.getValue().toString();
     
        if(chooseProgLanguage.equalsIgnoreCase("Java"))
            languagePhotoImageView.setImage(new Image("./images/Java.png"));
        else if(chooseProgLanguage.equalsIgnoreCase("Python"))
            languagePhotoImageView.setImage(new Image("./images/Python.jpg"));
        else if(chooseProgLanguage.equalsIgnoreCase("Swift"))
            languagePhotoImageView.setImage(new Image("./images/Swift.jpg"));
        else if(chooseProgLanguage.equalsIgnoreCase("JavaScript"))
            languagePhotoImageView.setImage(new Image("./images/JavaScript.png"));
        else if(chooseProgLanguage.equalsIgnoreCase("Kotlin"))
            languagePhotoImageView.setImage(new Image("./images/Kotlin.png"));
        else if(chooseProgLanguage.equalsIgnoreCase("PHP"))
            languagePhotoImageView.setImage(new Image("./images/PHP.png"));
        if(chooseProgLanguage.equalsIgnoreCase("SQL"))
            languagePhotoImageView.setImage(new Image("./images/SQL.jpg"));
    }
    
    /**
     * This is a action on button called Create programmer
     * When user click create programmer button, application checks for empty fields and validation of fields
     * if there is any field is empty or the data is wrong, then its shows an error
     */
    @FXML
    public void createProgrammerButtonPushed()
    {
        if (this.startDatePicker.getValue() != null)
        {
            try{
                
                
                String progLevel = (((RadioButton) progLevelToggleGroup.getSelectedToggle()).getText());
                
                Programmer newProgrammer = new Programmer
                                                (
                                                    this.programmerNameTextField.getText(),
                                                    this.programmingLanguageComboBox.getValue(),
                                                         progLevel,
                                                    this.startDatePicker.getValue(), 
                                                    this.endDatePicker.getValue()
                                                );
                System.out.println(newProgrammer);
            } catch (IllegalArgumentException e)
            {
                errMsgLabel.setText(e.getMessage());
            }
        }
        else
        {
            errMsgLabel.setText("You have to fill up all required important information");
        }
        
        /**
         * When user click on create programmer button, application returns the period between start date and end date
         * This will return the period in years, months and days according to the condition
         */
        Period period = Period.between(startDatePicker.getValue(), endDatePicker.getValue());
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
        if(years >= 1)
            getDurationOfLanguage.setText(String.format("%d years", years));
        else if(months >=1)
            getDurationOfLanguage.setText(String.format("%d months", months));
        else
            getDurationOfLanguage.setText(String.format("%d days", days));          
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        /**
         * This is for programming language ComboBox and we add values in it
         * I also set default value for ComboBox
         */
        programmingLanguageComboBox.getItems().addAll("Java", "Python", "Swift", "JavaScript", "Kotlin", "SQL", "PHP");
        programmingLanguageComboBox.setValue("Choose Programming Language");
        
        
        /**
         * This is for programming level radio buttons and we combine them as toggle
         * by putting things into Toggle group, the applications know for which objects, we want to move from one to another
         */
        progLevelToggleGroup = new ToggleGroup();
        this.beginnerRadioButton.setToggleGroup(progLevelToggleGroup);
        this.IntermediateRadioButton.setToggleGroup(progLevelToggleGroup);
        this.advancedRadioButton.setToggleGroup(progLevelToggleGroup);
        
        /**
         * This will set Label getDurationOfLanguage invisible when we run our application
         */
        getDurationOfLanguage.setText("");
        
        /**
         * This will set Label errMsgLabel invisible when we run our application
         */
        errMsgLabel.setText("");
        

        

    }    
    
}
