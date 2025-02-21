package practice.valid.domain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping("/test")
    public void validTest(@RequestBody @Valid DTO.ReqeustDto request) {
        testService.validTestMethod(request);
    }

    @PostMapping("/test/valid")
    public void validatedTest(@RequestBody DTO.ReqeustValidatedDto request) {
        testService.validatedTestMethod(request);
    }
}
