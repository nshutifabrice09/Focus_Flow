package com.backend.Focus_Flow.controller;

import com.backend.Focus_Flow.model.Label;
import com.backend.Focus_Flow.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class LabelController {

    private final LabelService labelService;

    @Autowired
    public LabelController(LabelService labelService) {
        this.labelService = labelService;
    }

    @PostMapping("/label/{taskId}")
    public Label save (@RequestBody Label label, @PathVariable ("taskId") Long taskId){
        return labelService.saveLabel(label, taskId);
    }

    @GetMapping("/labels")
    public List<Label> labelList(){
        return labelService.getAllLabels();
    }

    @GetMapping("/label/{id}")
    public Label getLabel(@PathVariable ("id") Long id){
        return labelService.getLabel(id);
    }

    @PutMapping("/update/label/{id}")
    public Label updateLabel(@PathVariable ("id") Long id, @RequestBody Label label){
        return labelService.updateLabel(id, label);
    }

    @DeleteMapping("/delete/label/{id}")
    public void deleteLabel(@PathVariable ("id") Long id){
        labelService.removeLabel(id);
    }

}
