package practice.valid.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public void handleValidationException(MethodArgumentNotValidException e) {
        for(FieldError error : e.getBindingResult().getFieldErrors()) {
            String field = error.getField();

            switch (field) {
                case "notNullCheck":
                    log.error("[Validation Error]  '{}' 필드가 null입니다.", field);
                    break;
                case "notEmptyCheck":
                    log.error("[Validation Error]  '{}' 필드에 null, \"\" 는 올 수 없습니다.", field);
                    break;
                case "notBlankCheck":
                    log.error("[Validation Error]  '{}' 필드가 null, \"\", \" \" 은 올 수 없습니다.", field);
                    break;
                case "minTest":
                    log.error("[Validation Error]  '{}' 필드의 최소값은 1 입니다.", field);
                    break;
                case "maxTest":
                    log.error("[Validation Error]  '{}' 필드의 최대값은 100 입니다.", field);
                    break;
                case "patternTest":
                    log.error("[Validation Error]  '{}' 전화번호는 숫자와 하이픈 ('-') 만 가능합니다.", field);
                    break;
                case "emailTest":
                    log.error("[Validation Error]  '{}' 이메일 형태만 가능합니다.", field);
                    break;
                case "sizeTest":
                    log.error("[Validation Error]  '{}' 필드의 최소 길이는 1, 최대 길이는 25 입니다.", field);
                    break;
                default:
                    log.error("[Validation Error]  '{}' 필드에 대해 엠포플러스에 문의해주세요.", field);
            }
        }
    }
}
