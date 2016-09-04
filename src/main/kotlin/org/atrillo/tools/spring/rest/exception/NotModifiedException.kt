package org.atrillo.tools.spring.rest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.NOT_MODIFIED)  // 304
open class NotModifiedException(message: String?) : RuntimeException(message)