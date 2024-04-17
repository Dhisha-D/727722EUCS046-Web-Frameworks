package com.example.cy2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cy2.Model.College;


@RestController
public class ApiController {
    @GetMapping("/college")
    public College college()
    {
        College c=new College();
        c.setCollegeName("ABC College");
        c.setDepartmentName("Computer Science");
        c.setSection(1);
        return c;
    }
}

