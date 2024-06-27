package com.sun.pep.application.port.in;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;

public interface AuthorizeInputPort{

    Boolean check(Authentication authentication, RequestAuthorizationContext context) throws Exception;
}
