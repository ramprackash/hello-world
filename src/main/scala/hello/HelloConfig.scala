package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {
	@RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
        def home() = {
        "Hello world!";
    }
	@RequestMapping(value=Array("/"), method=Array(RequestMethod.POST))
        def homepost() = {
        "Post world!";
    }
}
