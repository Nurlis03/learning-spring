package com.example.dependency.injection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DependencyInjectionApplicationTests {
	@Test
	public void givenXmlConfig_whenConstructorInjected_ThenEngineExist() {
		ApplicationContext xmlConfigContext = new ClassPathXmlApplicationContext("injection.xml");
		CarWithConstructor carWithConstructor = xmlConfigContext.getBean(CarWithConstructor.class);
		assertNotNull(carWithConstructor.getEngine());
	}

	@Test
	public void givenXmlConfig_whenSetterInjected_ThenEngineExist() {
		ApplicationContext xmlConfigContext = new ClassPathXmlApplicationContext("injection.xml");
		CarWithSetter carWithSetter = xmlConfigContext.getBean(CarWithSetter.class);
		assertNotNull(carWithSetter.getEngine());
	}
}
