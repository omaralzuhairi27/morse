package at.nacs.morse.communication;

import at.nacs.morse.logic.Manager;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
@RefreshScope
@RequiredArgsConstructor
public class MorseEndpoint {

  private final Manager manager;

  @PostMapping
  String post(@RequestBody String letter) {
    return manager.encode(letter);
  }
}
