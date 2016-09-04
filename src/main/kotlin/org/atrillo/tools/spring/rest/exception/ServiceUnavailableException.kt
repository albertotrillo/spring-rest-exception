package org.atrillo.tools.spring.rest.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value= HttpStatus.SERVICE_UNAVAILABLE)  // 503
open class ServiceUnavailableException(message: String?) : RuntimeException(message)