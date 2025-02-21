package practice.valid.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
public class TestService {
    private final ValidatedTestService validatedTestService;

    /**
     * @Valid 테스트
     */
    public void validTestMethod(DTO.ReqeustDto request ) {
        System.out.println("notNullCheck : " + request.getNotNullCheck());
        System.out.println("notEmptyCheck : " + request.getNotEmptyCheck());
        System.out.println("notBlankCheck : " + request.getNotBlankCheck());
        System.out.println("minCheck : " + request.getMinTest());
        System.out.println("maxCheck : " + request.getMaxTest());
        System.out.println("patternCheck : " + request.getPatternTest());
        System.out.println("emailCheck : " + request.getEmailTest());
        System.out.println("sizeCheck : " + request.getSizeTest().length());
    }

    /**
     * @Validated,@Valid 테스트
     */
    public void validatedTestMethod(DTO.ReqeustValidatedDto request) {
        validatedTestService.validatedTestMethod(request);
    }

    /**
     * @Validated Group 테스트
     */
    public void validatedGroupTestMethod(DTO.ReqeustGroupDto request) {
        System.out.println("notNullCheck : " + request.getNotNullCheck());
        System.out.println("notEmptyCheck : " + request.getNotEmptyCheck());
        System.out.println("notBlankCheck : " + request.getNotBlankCheck());
    }
}