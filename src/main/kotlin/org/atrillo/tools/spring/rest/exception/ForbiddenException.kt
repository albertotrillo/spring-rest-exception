package org.atrillo.tools.spring.rest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.FORBIDDEN)  // 403
open class ForbiddenException(message: String?) : RuntimeException(message)