package com.example.dependency.injection;

import org.springframework.stereotype.Component;

// Аннотация @Component говорит
// фреймворку превратить класс в бин.
// При запуске Spring создаст экземпляр класса Engine. 
// Этот экземпляр будет синглтоном в нашем случае. 
// Мы сможем его впоследствии получить из контекста приложения 
// с помощью команды: context.getBean(Engine.class);
@Component
public class Engine {
    
}
