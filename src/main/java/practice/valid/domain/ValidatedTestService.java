package practice.valid.domain;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class ValidatedTestService {

    public void validatedTestMethod(@Valid DTO.ReqeustValidatedDto request ) {
        System.out.println("notNullCheck : " + request.getNotNullCheck());
        System.out.println("notEmptyCheck : " + request.getNotEmptyCheck());
        System.out.println("notBlankCheck : " + request.getNotBlankCheck());
        System.out.println("minCheck : " + request.getMinTest());
        System.out.println("maxCheck : " + request.getMaxTest());
        System.out.println("patternCheck : " + request.getPatternTest());
        System.out.println("emailCheck : " + request.getEmailTest());
        System.out.println("sizeCheck : " + request.getSizeTest().length());
    }
}
