## Bean
* Это просто Java объект
* Когда Java объекты создаются с помощью Spring'а, они называются бинами (beans)
* Бины создаются из Java классов (так же, как и обычные объекты)

```xml
<bean id="testBean" class="ru.alishev.springcourse.TestBean">
<constructor-arg value="Neil"/>
</bean>
```