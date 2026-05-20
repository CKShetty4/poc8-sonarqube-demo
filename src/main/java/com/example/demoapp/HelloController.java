package com.example.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {

        return """
                <!DOCTYPE html>
                <html lang="en">
                 <html>
                <body>
                    <div class="container">
                        <h1>Demo Spring Boot Page</h1>

                        <p>Welcome to My demo application!</p>

                        <pre>
                                  ____ _  ______  _          _   _
      |\\    _,,,---,,_           / ___| |/ / ___|| |__   ___| |_| |_ _   _
ZZZzz /,.-''    -.  ;-;;,_      | |   | ' /\\___ \\| '_ \\ / _ \\ __| __| | | |
     |,4-  ) )-,_. ,\\ (  '-'    | |___| . \\ ___) | | | |  __/ |_| |_| |_| |
    '---''(_/--'  '-\\_)         \\____|_|\\_\\____/|_| |_|\\___|\\__|\\__|\\__, |
                                                                     |___/

Welcome, chinmay.kshetty This is demo!
                        </pre>

                        <div class="footer">
                           And this is sonarQube Testing
                        </div>
                    </div>
                </body>
                </html>
                """;
    }
}
