package tech.sakshi.springbootlearning.hello;

import java.util.*;  

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        
    @RequestMapping("/hello")
    public Map<Integer,String> sayHi(){
        Map<Integer,String> map1=new HashMap<Integer,String>();  
        map1.put(100,"Nate");    
        map1.put(101,"Cassie");    
        map1.put(102,"Rue");           
        return map1;
    }
}
