# Spring Training
#### 1. Hello World (helloworld)
#### 2. Strategy Pattern (strategy)
Spring dependency injection. 
#### 3. List Injection (listinjection)
#### 4. Depends-On (dependson)
Define object initialization order with depends-on element.
#### 5. Bean Scope (beanscope)
| Scope         | Description   |
| ----------- |---------------|
| singleton     | This scopes the bean definition to a single instance per Spring IoC container (default). |
| prototype     | This scopes a single bean definition to have any number of object instances.      |
| request       | This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.     |
| session       | This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.      |
| global-session| This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.      |
#### 6. Method Injection (methodinjection)
#### 7. Method Replacement (methodreplacement)
Exemplifies method replacement with method injection.
#### 8. Factory Method & Factory Class (factorymethod)
#### 9. FactoryBean Interface (factorybeaninterface)
#### 10. Namespaces (namespace)
Exemplifies p-namespace, c-namepsace usage.
#### 11. Property Placeholder Configurer (propertyplaceholderconfigurer)
Purpose of using these holders is making configuration files independent of specific values. For example, this is appropriate for database properties.
#### 12. Spring Bean Lifecycle (beanlifecycle)
#### 13. Spring Bean Post Processor & @Required (beanpostprocessor)
- The BeanPostProcessor interface defines callback methods that you can implement to provide your own instantiation logic.
- @Required annotation indicates that the affected bean property must be populated in XML configuration file at configuration time otherwise the container throws a BeanInitializationException exception.