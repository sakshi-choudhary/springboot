package tech.sakshi.springbootlearning.topic;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
            new Topic("life","About Life","Life is shit!"),
            new Topic("love","About Love","Love is great!"),
            new Topic("lie","About Lie","Hate Lies!")
        );
    }

}
