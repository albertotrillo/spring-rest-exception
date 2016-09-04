# Atrillo Tools - Spring Rest Exception

Contains a set of rest api standard-compliant exceptions annotated with their corresponding ResponseStatus code.

The exceptions are intended to be thrown inside a Spring web controller, as this is one of the base approaches for Spring web exception handling.

More info:

https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc#using-http-status-codes

# Example

This endpoint : 

```
@RestController
open class FooController {

    @RequestMapping("/")
    fun foo() {

        throw BadRequestException("Custom message for my bad request exception")
    }
}
```

Returns : 

```
{
  "timestamp": 1473024120969,
  "status": 400,
  "error": "Bad Request",
  "exception": "org.atrillo.tools.springrestexceptions.exception.BadRequestException",
  "message": "Custom message for my bad request exception",
  "path": "/"
}
```

