package com.rss.certification_nlw.modules.students.controllers;

import com.rss.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.rss.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "Usuario já fez a prova";
        }
        System.out.println(verifyHasCertificationDTO);

        return "Ususario pode fazer a prova";

    }
}
