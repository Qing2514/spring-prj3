# spring-prj3

### 基础实验

1、学习理解 AOP（Aspect Orient Programming）即面向切面编程的基本概念，重点掌握切面、增强处理、切点的概念； 

2、掌握使用@AspectJ 实现 Spring AOP 的基本步骤和配置方法，会使用基于 Annotation 的注解方式或基于 XML 配置文件的方式来定义切入点和增强处理。

### 提高实验

1、事务管理是企业应用中非常重要的部分，Spring 框架对事务管理进行了高层 次的抽象，定义了各种类型的事务管理器，用来实现事务管理功能； 

2、Spring 框架支持编程式事务管理，也就是可以通过编写代码实现事务管理； Spring 同时也支持声明式事务管理，声明式事务管理基于 Spring AOP 实现， 不在源文件中编写代码管理事务，而是使用 AOP 框架，在 IoC 容器中装配； 

3、Spring 配置文件中提供了<tx:advice.../>元素来配置事务增强处理，并使用 <aop:advisor.../>为 IoC 容器中的 Bean 配置自动事务代理。


### 扩展实验

1、进一步理解 AOP 的基本概念与作用； 

2、理解 Spring AOP 基于代理和代理工厂的核心工作原理，理解 Spring AOP 的主要实现过程； 

3、掌握使用 Spring 提供的代理工厂 ProxyFactoryBean 来实现 AOP 的方法，理解 Spring AOP 与 IoC 容器的结合方式，以及各自起到的作用；

4、掌握 Spring AOP 中四种类型增强处理的作用和实现方法。
