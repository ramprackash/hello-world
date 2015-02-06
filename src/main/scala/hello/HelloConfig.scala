package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody, RequestParam, RestController}

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
	@RequestMapping(Array("/"))
	def home() = {
		"Hello world - from Scala!";
	}

}

