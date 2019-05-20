package at.nacs.morse.logic;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Manager {

  private final Map<String, String> morse;

//  @Value("${translation.not-supported}")
//  private String notSupported;

  public String encode(String letter) {
    String lowerCase = letter.toUpperCase();
    
    return morse.getOrDefault(lowerCase, "wrong");
  }

}
