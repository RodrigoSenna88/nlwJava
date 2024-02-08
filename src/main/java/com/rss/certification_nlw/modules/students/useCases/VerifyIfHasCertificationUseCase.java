package com.rss.certification_nlw.modules.students.useCases;

import com.rss.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.rss.certification_nlw.modules.students.repositories.CertificationStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.certificationStudentRepository.findStudentByEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if(!result.isEmpty()) {
            return true;
        }
        return false;
    }
}
