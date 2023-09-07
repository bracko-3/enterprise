package com.myplantdiary.enterprise;


import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantDiaryController {

    /**
     * Handle the root (/) endpoint and return a start page
     * @return
     */

    @RequestMapping("/")
    public String index() {
        Specimen specimen = new Specimen();
        return "start";
    }
}
