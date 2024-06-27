package com.sun.pep.application.core.usecase;

import com.sun.pep.application.core.domain.AuthorizationRequest;
import com.sun.pep.application.port.in.AuthorizeInputPort;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;

public class AuthorizeUseCase implements AuthorizeInputPort {

    @Override
    public Boolean check(Authentication authentication, RequestAuthorizationContext context) throws Exception {
        String user = authentication.getName();
        String resource = context.getRequest().getRequestURI();
        String action = context.getRequest().getMethod();

        return null;
    }

}
