package com.rockcairn.fourteenerquiz;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient charClient;

    public ChatController(ChatClient.Builder chatCientBuilder) {
        this.charClient = chatCientBuilder.build();
    }

    @GetMapping("/fourteener-quiz")
    public String generate(
        @RequestParam(value = "message", defaultValue = "Give me a question and answer about Colorado Fourteeners") String message) {
        return this.charClient.prompt().user(message).call().content();
    }
}
