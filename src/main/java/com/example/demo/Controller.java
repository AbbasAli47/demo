package com.example.demo;


        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping
    public String index() {
        return "GET";
    }
    @PostMapping
    public String index1() {
        return "Post";
    }
    @PutMapping
    public String index2() {
        return "Put";
    }
    @DeleteMapping
    public String index3() {
        return "Delete";
    }

//    docker run -e MYSQL_ROOT_PASSWORD=1234 -d -p 3309:3306 mysql:5.7.13
//    mysql -hlocalhost --protocol=TCP -uroot -p1234
}