# Spring Training
#### 1. Hello World (helloworld)
Basic hello world application with XML based configuration. 
#### 2. Strategy Pattern (strategy)
Spring dependency injection with XML based configuration. 
#### 3. List Injection (listinjection)
List injection with XML based configuration.
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

#### 15. Util Namespace (utilnamespace)
- util:constant, injects static variables to objects(beans).
- util:property-path, injects any property of any bean to another beans property.
- util:properties, injects property files

#### 16. Spring Expression Language (spel)
It may not be possible to inject all values before runtime. The [Spring Expression Language](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/expressions.html "SpEL") is a powerful expression language that supports querying and manipulating an object graph at runtime.

Validation of an email address with SpEL and Regex: 

```xml
<property name="validEmail" 
          value="#{user.email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}'}"/>
```
#### 17. Annotation Based Configuration (strategyannotationconfiguration)
- @Component, @Autowired, @Qualifier annotation definitions. 
- Small sample code of Logger class.

#### 18. Java Based Configuration (javabasedconfiguration)
[Java Based Configuration](http://www.tutorialspoint.com/spring/spring_java_based_configuration.htm "Tutorials Point"), provides us to create configuration files without using xml files.

#### 19. Database Operations With JDBC (datasource)
- Spring JdbcTemplate (jdbctemplate)
    * Created JdbcTemplate object can be used for multiple SQL operations. Also this JdbcTemplate object can be shared between threads (threadsafe).
    * [Batch Update](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/jdbc/core/JdbcTemplate.html#batchUpdate-java.lang.String-org.springframework.jdbc.core.BatchPreparedStatementSetter-, "Spring Documentaion"): Issue multiple update statements on a single PreparedStatement, using batch updates and a BatchPreparedStatementSetter to set values.
- DataSource, HSQL (datasource), Callback Class
    * HSQL is a embedded database, we can also use H2 or DERBY instead.
    * CustomerRowMapper implements RowMapper interface, CustomerExtractor implements ResultSetExtractor so that they can create customer object by using ResultSet object. These are called **Callback Class**.
    * If we don't need any return value from a callback class so we can use RowCallbackHandler.
- NamedParameterJdbcTemplate, SimpleJdbcInsert (namedparameterjdbctemplate)
    * Exemplifies usage of **SqlParameterSource** interface with SimpleJdbcInsert and NamedParameterJdbcTemplate classes.
    
    *P.S. These packages are self-contained, their only dependency is Customer.java class and resource files.*

#### 20. Connection Pool, MySQL Connection (mysql)
- DriverManagerDataSource creates new connection for each connection request. SingleConnectionDataSource allows only one connection object usage, thus this class is better for testing, but can't serve multiple users. Both of them are not recommended for real applications.
- Connection Pool contains multiple connections thus it provides faster service to users. Open source tools often used such as [DBCP](http://commons.apache.org/proper/commons-dbcp/) or [c3po](http://www.mchange.com/projects/c3p0/) for that kind configurations.

#### 21. Hibernate (hibernate)

[Hibernate ORM](http://hibernate.org/orm/) enables developers to more easily write applications whose data outlives the application process. As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC).

@Entity, specifies that class can be saved to database.

@Table, specifies the name of table that our data will be saved in it. If @Table annotation is not used then our class name would be the table name.

@Id, specifies that our value is the primary key.

@GeneratedValue, corresponds to AUTO_INCREMENT keyword of MySQL. The value with this annotation shouldn't be assigned by developer.

#### 22. Spring Transaction Management - (transactionmanagement, INCOMPLETE)

- [Transaction](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/transaction.html) management by using @Transactional annotation.

    - propagation: Defines how transactions relate to each other ([_Enum Constant Summary_](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html)).

    - isolation: Defines data contract between transactions ([_Enum Constant Summary_](http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/transaction/annotation/Isolation.html))

    - timeout: How long this transaction runs before timing out and being rolled back automatically.

    - readOnly: A read-only transaction can be used when your code reads but does not modify data, that means it only uses SQL SELECT command (true or false).

    - rollbackFor: Indicates which exception types must cause a transaction rollback.

    - noRollBackFor: Indicates which exception types must not cause a transaction rollback.
    
#### 23. Spring AOP and AspectJ (aopperformancemonitoring)
Exemplifies the creation of Around Advice by using @Aspect, @Around annotations and XML configuration. 

#### 24. @AspectJ Based AOP with Spring (aspectjbasedaop)
This example consist of @Pointcut, @Before, @After, @AfterReturning, @AfterThrowing.

_Go to [reference](http://www.tutorialspoint.com/spring/aspectj_based_aop_appoach.htm) for more detail._

#### 25. Pointcut Definitions (pointcutdefinition)
- Combining the named pointcuts with '&&', '||' and '!' symbols.
- Getting pointcuts from external class.
- Usage of 'execution' and 'within' of AspectJ pointcut expression language.
- Two different usage of target's parameter in advice with 'args'.
- Run aspects in order with @Order annotation.

#### 26. Inter-type Declarations (declareparents)
- Mixin
- @DeclareParent

#### 27. Spring MVC - Hello World (mvchelloworld)
Spring MVC - 101, introduction to Spring MVC.
#### 28. Spring MVC, Testing - Employee Registration (mvcexample)
- Spring MVC
- Hibernate 
- Validation-api: exception handling
- Spring Testing
    - JUnit
        - @RunWith: JUnit will invoke the class it references to run the tests in that class instead of the runner built into JUnit.
        - @WebAppConfiguration: Declare that the ApplicationContext loaded for an integration test should be a WebApplicationContext.
        - @ContextConfiguration: Determine how to load and configure an ApplicationContext for integration tests.
    - Spring TestContext
        - MockMvc
    - Mockito: Mockito library enables mocks creation, verification and stubbing.

_// TODO: Add database testing_

_Note: This module consist of java based configuration, namely xml files haven't been used, it also contains redirection in jsp._

_Go to [reference](http://websystique.com/springmvc/spring-4-mvc-and-hibernate4-integration-example-using-annotations/) for more detail._
#### 29. Spring Security (loginform)
#### 30. Spring REST - XML Example (resthelloworld)
#### 31. Spring REST - GET, POS, DELETE, PUT Methods (springrest, INCOMPLETE)
_// TODO: Use database to change, update, or get as json and xml media types. Show status codes and @ResponseStatus annotation. Exemplify the exception handling with @ControllerAdvice annotation._
#### 32. Spring Remoting - RMI Service Exporter (rmiserviceexporter)
[Remote Method Invocation (RMI)](http://www.oracle.com/technetwork/articles/javaee/index-jsp-136424.html): Java Remote Method Invocation (Java RMI) enables the programmer to create distributed Java technology-based to Java technology-based applications, in which the methods of remote Java objects can be invoked from other Java virtual machines*, possibly on different hosts. RMI uses object serialization to marshal and unmarshal parameters and does not truncate types, supporting true object-oriented polymorphism.

RMI Service Exporter provides that calling one hosts' method from another host for short.

#### 33. Spring Web Service (studentws, studentwsclient)
- Server side (studentws)
    - @EnableWs 
    - WsConfigurerAdapter 
    - DefaultWsdl11Definition 
    - XsdSchema
    - MessageDispatcherServlet
    - @Endpoint 
    - @PayloadRoot 
    - @ResponsePayload 
    - @RequestPayload 

- Client side (studentwsclient)
    - Jaxb2Marshaller
    - WebServiceGatewaySupport  
    
_Go to [reference](http://www.concretepage.com/spring-4/spring-4-soap-web-service-producer-consumer-example-with-tomcat) for more detail._