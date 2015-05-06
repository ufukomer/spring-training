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
- beanlifecycle: Initialize and destroy specific variables by using init-method, destroy-method in spring configuration file.
- defaultmethods: Define init and destroy methods inside 'beans' tag.
- lifecyclemethods: Implementation of InitializingBean, DisposableBean classes to perform custom initialization, destroy. @PostConstruct, @PostDestroy with these annotations init and destroy methods are independent from configuration file. But we have to define CommonAnnotationBeanPostProcessor class in configuration file.
 
 If we implement multiple lifecycle methods, spring runs these methods according to this order:
 
 * The methods marked with @PostConstruct annotation
 * afterPropertiesSet() method if class implements InitializingBean class
 * The method defined with init-method in configuration file

 Spring runs destruction methods according to this order:
 
 * The methods marked with @PreDestroy annotation
 * destroy() method if class implements DisposableBean class
 * The method defined with destroy-method in configuration file

#### 13. Spring Bean Post Processor & @Required (beanpostprocessor)
- The BeanPostProcessor interface defines callback methods that you can implement to provide your own instantiation logic.
- @Required annotation indicates that the affected bean property must be populated in XML configuration file at configuration time otherwise the container throws a BeanInitializationException exception.

#### 14. Spring Bean Definition Inheritance (beandefinitioninheritance)
- parent tag corresponds to 'extends' keyword in Java.
- abstract = true, not possible to create object from this bean, other beans can extends it as well.
- Spring bean definitions can extends any bean definition and override its property.

#### 15. Util Namespace
- util:constant, injects static variables to objects(beans).
- util:property-path, injects any property of any bean to another beans property.
- util:properties, injects property files