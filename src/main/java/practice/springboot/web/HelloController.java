package practice.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import practice.springboot.web.dto.HelloResponseDto;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello()
    {
        return  "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount)
    {
        return new HelloResponseDto(name,amount);

    }

//    @GetMapping("/hello/{name}")
//    public String helloDto(@PathVariable("name") String name,
//                                     @RequestParam("amount") int amount)
//    {
//         HelloResponseDto a = new HelloResponseDto(name,amount);
//         return a.getName();
//
//    }


}
