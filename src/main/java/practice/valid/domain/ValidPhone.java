package practice.valid.domain;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneNumValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER } ) // 이 어노테이션을 어디에 붙일 것인가
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPhone {
    String message() default "입력한 전화번호의 형식이 잘못되었습니다.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
