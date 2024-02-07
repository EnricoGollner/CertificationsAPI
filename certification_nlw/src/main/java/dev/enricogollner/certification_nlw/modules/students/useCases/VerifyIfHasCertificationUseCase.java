package dev.enricogollner.certification_nlw.modules.students.useCases;

import dev.enricogollner.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    public boolean execute(VerifyHasCertificationDTO dto) {
        return dto.getEmail().equals("enricogollner@gmail.com") && dto.getTechnology().equals("Java");
    }
}
