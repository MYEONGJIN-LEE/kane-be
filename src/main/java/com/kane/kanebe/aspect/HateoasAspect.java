package com.kane.kanebe.aspect;

import com.buildcenter.common.exception.CommonException;
import com.kane.kanebe.model.common.CommonReturnVO;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

/**
 * @author kane
 * hateaos 적용
 * restcontroller에서 AfterReturning 후 body에 삽입.
 */

@RequiredArgsConstructor
@Component
@Aspect
public class HateoasAspect {

    @AfterReturning(value = "execution(* com.kane.kanebe.restcontroller..*(..))", returning = "response")
    public void setHateoas(final JoinPoint joinPoint, ResponseEntity response) throws CommonException {

        Arrays.stream(joinPoint.getTarget().getClass().getDeclaredMethods()).forEach(method -> {
            WebMvcLinkBuilder webMvcLinkBuilder = linkTo(method);
            ((CommonReturnVO) response.getBody()).add(webMvcLinkBuilder.withRel(method.getName()));
        });
    }
}
