package com.example.SpringBootKube01;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("demo")
@Data
public class DemoProperties {

  /**
   * A welcome message to the user.
   */
  private String message;

}
