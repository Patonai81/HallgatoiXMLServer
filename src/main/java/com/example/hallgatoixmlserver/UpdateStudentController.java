package com.example.hallgatoixmlserver;


import com.example.hallgatoixmlserver.webuni.RemainingFreeSemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ws")
public class UpdateStudentController {

    @Autowired
    RemainingFreeSemesterService remainingFreeSemesterService;



    @GetMapping("/teszt")
    public void findCourseById() {
        System.out.println(  remainingFreeSemesterService.getRemainingSemester(2));
        System.out.println("ok");
    }

}
