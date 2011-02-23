package cukes;

import cuke4duke.annotation.I18n.EN.Given;
import java.util.List;
import java.util.ArrayList;

public class RomanNumeralSteps {
    @Given("a number in arabic such as (\\d+)")
    public void arabicToRoman(int arabic){
	//TODO create the step definitions here
        System.out.println("From step definition");
    }
}
