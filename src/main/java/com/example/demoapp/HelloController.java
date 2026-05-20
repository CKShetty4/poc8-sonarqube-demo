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
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Demo App</title>

                    <style>
                        * {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                        }

                        body {
                            height: 100vh;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            background: linear-gradient(135deg, #141e30, #243b55);
                            font-family: Arial, sans-serif;
                            color: white;
                        }

                        .container {
                            background: rgba(255, 255, 255, 0.08);
                            padding: 40px;
                            border-radius: 20px;
                            box-shadow: 0 8px 25px rgba(0,0,0,0.4);
                            text-align: center;
                            backdrop-filter: blur(8px);
                            max-width: 900px;
                        }

                        h1 {
                            font-size: 42px;
                            margin-bottom: 20px;
                            color: #00e5ff;
                        }

                        p {
                            font-size: 18px;
                            margin-bottom: 25px;
                            color: #dfefff;
                        }

                        pre {
                            text-align: left;
                            background: #0d1117;
                            color: #00ff99;
                            padding: 20px;
                            border-radius: 12px;
                            overflow-x: auto;
                            font-size: 14px;
                            line-height: 1.4;
                            border: 1px solid #30363d;
                        }

                        .footer {
                            margin-top: 20px;
                            color: #b0c4de;
                            font-size: 14px;
                        }
                    </style>
                </head>

                <body>

                    <div class="container">
                        <h1>Demo Spring Boot Page</h1>

                        <p>Welcome to your beautifully styled demo application!</p>

                        <pre>
                                  ____ _  ______  _          _   _
      |\\    _,,,---,,_           / ___| |/ / ___|| |__   ___| |_| |_ _   _
ZZZzz /,.-''    -.  ;-;;,_      | |   | ' /\\___ \\| '_ \\ / _ \\ __| __| | | |
     |,4-  ) )-,_. ,\\ (  '-'    | |___| . \\ ___) | | | |  __/ |_| |_| |_| |
    '---''(_/--'  '-\\_)         \\____|_|\\_\\____/|_| |_|\\___|\\__|\\__|\\__, |
                                                                     |___/

Welcome, chinmay.kshetty!
                        </pre>

                        <div class="footer">
                            Made with Spring Boot ❤️
                        </div>
                    </div>

                </body>
                </html>
                """;
    }
}
