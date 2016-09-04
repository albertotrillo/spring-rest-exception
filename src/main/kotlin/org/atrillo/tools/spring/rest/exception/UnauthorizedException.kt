package org.atrillo.tools.spring.rest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.UNAUTHORIZED)  // 401
open class UnauthorizedException(message: String?) : RuntimeException(message)