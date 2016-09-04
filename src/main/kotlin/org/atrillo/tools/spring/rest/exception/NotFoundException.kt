package org.atrillo.tools.spring.rest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.NOT_FOUND)  // 404
open class NotFoundException(message: String?) : RuntimeException(message)