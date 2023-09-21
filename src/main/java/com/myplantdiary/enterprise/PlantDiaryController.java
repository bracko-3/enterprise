package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantDiaryController {

    /**
     * Handle the root (/) endpoint and return a start page
     * @return
     */

    @RequestMapping("/")
    public String index(Model model) {
        Specimen specimen = new Specimen();
        specimen.setDescription("Pawpaw fruite season");
        specimen.setLatitude("39.74");
        specimen.setLongitude("-84.51");
        specimen.setSpecimenID("1003");
        specimen.setPlantId(84);
        model.addAttribute(specimen);

        return "start";
    }

    /**
     * Endpoint to fetch specimens
     */
    @GetMapping("/specimen")
        public ResponseEntity fetchAllSpecimen() {
            return new ResponseEntity(HttpStatus.OK);
        }

    /**
     * Endpoint to fetch specimen by ID
     */
    @GetMapping("/specimen/{id}")
        public ResponseEntity fetchSpecimenById(@PathVariable("id") String id) {
            return new ResponseEntity(HttpStatus.OK);
        }

    /**
     * Endpoint to create specimen
     */
    @PostMapping(value = "/specimen", consumes = "application/json", produces = "application/json")
        public Specimen createSpecimen(@RequestBody Specimen specimen) {
            return specimen;
        }
    /**
     * Endpoint to delete specimen by ID
     */
    @DeleteMapping("/specimen/{id}")
        public ResponseEntity deleteSpecimen(@PathVariable("id") String id) {
            return new ResponseEntity(HttpStatus.OK);
    }
}
