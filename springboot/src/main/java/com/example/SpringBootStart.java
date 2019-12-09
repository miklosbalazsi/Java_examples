/**
 * spring-boot-starter-web
 * @RestController annotation is used to define the RESTful web services. It serves JSON, XML and custom response.
 *      @RestController
 *      public class ProductServiceController { }
 *
 * @RequestMapping annotation is used to define the Request URI to access the REST Endpoints.
 *                 We can define Request method to consume and produce object. The default request method is GET.
 *      @RequestMapping(value = "/products")
 *      public ResponseEntity<Object> getProducts() { }
 *
 * @RequestBody annotation is used to define the request body content type.
 *      public ResponseEntity<Object> createProduct(@RequestBody Product product) { }
 *
 * @PathVariable annotation is used to define the custom or dynamic request URI. The Path variable in request URI is defined as curly braces {}
 *      public ResponseEntity<Object> updateProduct(@PathVariable("id") String id) { }
 *
 * @RequestParam annotation is used to read the request parameters from the Request URL. By default, it is a required parameter.
 *      public ResponseEntity<Object> getProduct(
 *      @RequestParam(value = "name", required = false, defaultValue = "honey") String name) { }
 */
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class SpringBootStart {

    /** MAIN */
    public static void main(String[] args) {
        log.info("START SpringApplication.run SpringBuutStart.class");
        SpringApplication.run(SpringBootStart.class);
    }

    /** REST END POINT */
    @RequestMapping(value="/")
    public String index(){
        return "Hello World";
    }

}
