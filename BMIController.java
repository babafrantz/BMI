package com.Application.BMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BMIController {

    @GetMapping("/first_bmiController")
    public String getBmiForm(Model model){

        new BmiModel().time();
        new BmiModel().date();

        model.addAttribute("times",  new BmiModel().time());
        model.addAttribute("dates", new BmiModel().date());
        return "BMI_OPENING";


    }
    @GetMapping("/male")
    public String getBMIMALE(Model model){
        return"BMI_Male";
    }

    @GetMapping("/female")
    public String getBMIFemale(Model model){
        return"BMI_Female";}

    @GetMapping("/children")
    public String getBMIchildren(Model model){
        return"BMI_CHILDREN";}

    //

    @PostMapping("/male_bmiController")
    public String postBmiResults(Model model,
                                 @RequestParam( value = "weight") float weight,
                                 @RequestParam( value = "height") float height){

        BmiModel bmimodel = new BmiModel();

        bmimodel.setHeight(height);
        bmimodel.setWeight(weight);

       float bmi_result = bmimodel.Bmi();
       String bmi_inter = bmimodel.male_interpretation(bmi_result);

        model.addAttribute("bmi_result", bmi_result);
        model.addAttribute("bmi_inter", bmi_inter);

        return "BMI_Results";


    }


}
