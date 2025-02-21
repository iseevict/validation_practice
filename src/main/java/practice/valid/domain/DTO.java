package practice.valid.domain;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class DTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReqeustDto {

        @NotNull
        private String notNullCheck; // null

        @NotEmpty
        private String notEmptyCheck; // ""

        @NotBlank
        private String notBlankCheck; // " "

        @Min(value = 1)
        private Integer minTest; // 0

        @Max(value = 100)
        private Integer maxTest; // 101

        @Pattern(regexp = "^[0-9-]+$", message = "전화번호는 숫자와 '-'만 가능")
        private String patternTest; // phoneNum

        @Email
        private String emailTest; // stpark0509@gmail.com

        @Size(min = 1, max = 25)
        private String sizeTest; // 50
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReqeustValidatedDto {

        @NotNull
        private String notNullCheck; // null

        @NotEmpty
        private String notEmptyCheck; // ""

        @NotBlank
        private String notBlankCheck; // " "

        @Min(value = 1)
        private Integer minTest; // 0

        @Max(value = 100)
        private Integer maxTest; // 101

        @Pattern(regexp = "^[0-9-]+$", message = "전화번호는 숫자와 '-'만 가능")
        private String patternTest; // phoneNum

        @Email
        private String emailTest; // stpark0509@gmail.com

        @Size(min = 1, max = 25)
        private String sizeTest; // 50
    }
}
