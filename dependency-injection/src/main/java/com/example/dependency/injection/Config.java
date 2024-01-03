package com.example.dependency.injection;

import org.springframework.context.annotation.ComponentScan;

// В пакете «com.example.dependency.injection» Spring будет искать 
// аннотированные с помощью @Component классы, чтобы 
// превратить их в бины при запуске приложения и 
// инициализации контейнера Spring.
@ComponentScan("com.example.dependency.injection")
public class Config {
    
}
