package com.iihye.springvuelab.contenttype;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/content-type")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContentTypeController {

    @PostMapping("/json")
    public ResponseEntity<Object> json(@RequestBody Object object){
        log.info("object: {}", object);

        return ResponseEntity.ok().body(object.toString());
    }

    @PostMapping("/urlencode")
    public ResponseEntity<Object> urlencoded(@RequestParam String name, @RequestParam String age){
        log.info("name: {}, age: {}", name, age);

        return ResponseEntity.ok().body(name + ", " + age);
    }

    @PostMapping("/formdata")
    public ResponseEntity<Object> formdata(@RequestParam String name, @RequestParam String age){
        log.info("name: {}, age: {}", name, age);

        return ResponseEntity.ok().body(name + ", " + age);
    }
}
