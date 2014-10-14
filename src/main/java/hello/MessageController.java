package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by L3m4C on 14/10/2014.
 */
@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public Message send(Message message) throws Exception {
        return message;
    }

}
