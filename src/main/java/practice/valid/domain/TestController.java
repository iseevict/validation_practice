package practice.valid.domain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    // Valid
    @PostMapping("/test")
    public void validTest(@RequestBody @Valid DTO.ReqeustDto request) {
        testService.validTestMethod(request);
    }

    // Validated + Valid
    @PostMapping("/test/valid")
    public void validatedTest(@RequestBody DTO.ReqeustValidatedDto request) {
        testService.validatedTestMethod(request);
    }

    // Validated Group - 1
    @PostMapping("/test/valid/one")
    public void validatedGroupOneTest(@RequestBody @Validated(ValidGroupOne.class) DTO.ReqeustGroupDto request) {
        testService.validatedGroupTestMethod(request);
    }

    // Validated Group - 2
    @PostMapping("/test/valid/two")
    public void validatedGroupTwoTest(@RequestBody @Validated(ValidGroupTwo.class) DTO.ReqeustGroupDto request) {
        testService.validatedGroupTestMethod(request);
    }

    // Custom Validated
    @PostMapping("/test/custom")
    public void validatedCustomTest(@RequestBody @Valid DTO.RequestCustomDto request) {
        testService.validatedCustomTestMethod(request);
    }
}
