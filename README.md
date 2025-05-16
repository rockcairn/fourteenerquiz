# Fourteener Quiz
- based on spring-boot starter for openAI
- [start.spring.io](https://start.spring.io)
    - Spring Web
    - OpenAI

## Getting Started
- ```brew install openjdk@17```
- ```brew install maven```

## Pom Dependencies
- org.springframework.boot [_spring-boot-starter-web_]
- org.springframework.ai [_spring-ai-starter-model-openai_]
- io.github.cdimascio [_dotenv-java@3.2.0_]

## Configure
- create a local _.env_ based on the [.env.sample](.env.sample)
    ```
    OPENAI_API_KEY=<openai-api-key>
    OPENAI_MODEL=<model-name>
    ```
## Build and Run
- ```mvn package```
- ```mvn spring-boot:run```

## See Results
- [http://localhost:8080/fourteener-quiz](http://localhost:8080/fourteener-quiz)
- note that when you setup your OpenAI account for an API_KEY you need a minimal payment.


### References
- [OpenAI Docs Creating Prompts](https://platform.openai.com/docs/guides/text?api-mode=responses#prompt-engineering)