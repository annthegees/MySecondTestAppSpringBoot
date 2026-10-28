package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.arkhipov.MySecondTestAppSpringBoot.model.Request;

@Service
public class UnsupportedCodeService {

    public void check(Request request) throws UnsupportedCodeException {
        if ("123".equals(request.getUid())) {
            throw new UnsupportedCodeException("uid=123 запрещён");
        }
    }
}