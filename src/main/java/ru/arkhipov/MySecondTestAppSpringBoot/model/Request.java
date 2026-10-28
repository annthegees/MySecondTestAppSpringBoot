package ru.arkhipov.MySecondTestAppSpringBoot.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "uid не должен быть пустым")
    @Size(max = 32, message = "uid не должен превышать 32 символа")
    private String uid;

    @NotBlank(message = "operationUid не должен быть пустым")
    @Size(max = 32, message = "operationUid не должен превышать 32 символа")
    private String operationUid;

    // необязательное
    private String systemName;

    @NotBlank(message = "systemTime не должен быть пустым")
    private String systemTime;

    // необязательное
    private String source;

    @NotNull(message = "communicationId обязателен")
    @Min(value = 1, message = "communicationId должен быть не меньше 1")
    @Max(value = 100000, message = "communicationId должен быть не больше 100000")
    private Integer communicationId;

    // необязательные
    private Integer templateId;
    private Integer productCode;
    private Integer smsCode;
}