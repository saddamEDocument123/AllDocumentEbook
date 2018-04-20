/***


 */

 1. Why we used POM.xml file in mvc?
=>
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.backend</groupId>
  <artifactId>apitest</artifactId>
  <packaging>war</packaging>
  <version>0.0.1-SNAPSHOT</version>
  <name>apitest Maven Webapp</name>
  <url>http://maven.apache.org</url>
   <properties>
		<javaee.version>7.0</javaee.version>
		<spring.version>4.3.6.RELEASE</spring.version>
		<hibernate.version>5.2.7.Final</hibernate.version>
		<jackson.version>2.8.7</jackson.version>
	</properties>
  
  
  
  <dependencies>
  
  
  <!-- Link with backend project -->

		<dependency>

			<groupId>com.backend</groupId>
             <artifactId>restbackend</artifactId>
              <version>0.0.1-SNAPSHOT</version>


		</dependency>
  
  <!-- Java EE API -->
		<dependency>
			<groupId>javax</groupId>
			<artifactId>javaee-api</artifactId>
			<version>${javaee.version}</version>
			<scope>provided</scope>
		</dependency>
		
		
		<!-- JSTL -->

		<dependency>
			<groupId>jstl</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>


		<!-- JUNIT -->


		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>




		<!-- SPRING -->

		<!-- https://mvnrepository.com/artifact/org.springframework/spring-context-support -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context-support</artifactId>
			<version>4.3.12.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${spring.version}</version>
		</dependency>

		<!-- used for mail api -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>


		<!-- https://mvnrepository.com/artifact/org.springframework/spring-expression -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-expression</artifactId>
			<version>${spring.version}</version>
		</dependency>


		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-core</artifactId>
			<version>${spring.version}</version>

			<exclusions>
				<exclusion>
					<groupId>commons-logging</groupId>
					<artifactId>commons-logging</artifactId>
				</exclusion>
			</exclusions>

		</dependency>




		<!-- Jackson -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>${jackson.version}</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>${jackson.version}</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>${jackson.version}</version>
		</dependency>


		<!-- SLF4J Logging -->
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			<version>1.2.1</version>
		</dependency>

		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>jcl-over-slf4j</artifactId>
			<version>1.7.24</version>
		</dependency>
		

		  </dependencies>
  <build>
  
  <plugins>
			<!-- Update to latest version of JAVA -->
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>

			</plugin>

		</plugins>
    <finalName>apitest</finalName>
  </build>
</project>

    POM stands for “Project Object Model”, This is a file which contain all Maven Configuration for building a project.

    * <project> element is the root element of this POM file. There are following possible children of this element with short description.
    * <modelVersion > 4.0.0 is a child element of <project>. It is currently describing the support for Maven 2 and Maven 3 versions.
    * <groupId> is a child element of <project>. It is universally unique identifier for project, as a normal to use fully qualified package name to distinguish similar project names
    * <artifactId> is a child element of <project>. It is a unique identifier within group by the group Id. Artifact Id is produced by Maven for project include JARs, Wars etc.
    * <packaging> is a child element of <project>. If you are running a command “maven clean install” It’ll generate .war file with artifactId. There is in this project we have a name 
        of ArtifactId is SpringMVC so our generated file will be SpringMVC.war in target direct of project.
    * <version> is a child element of <project>. It is a version number of current project.
    * <name> is a child element of <proect>. It is a full name of Project.
    * <url> is a child element of <project>. It is a project’s home page URL.
    * <properties> is a child element of <project>. The various plugins use these project properties.
    * <java-version> is a child element of <properties>. The Java version for plugin use
    * <org.springframework-version> is a child element of <properties>. The Spring frame work version for plugin use.
    * <dependencies> is a child element of <project>. This element describes all dependencies associated with a project. They are automatically downloaded from repositories for this project.
    * <dependency> is a child element of <project>. It is a element for downloading and installing dependency.
    * <groupId> is a child element of <dependency>. It is a unique identifier for  project group, which is produced for dependency.
    * <artifactId> is a child element of <dependency>. It is a unique identifier for artifact.
    * <version> is a child element of <dependency>. It is a version of dependency.


2. Why we used applicationContext.xml file in Sprint mvc ?
=>
    Step 1 : applicationContext.xml file - 
            <beans xmlns = "http://www.springframework.org/schema/beans"
            xmlns:context = "http://www.springframework.org/schema/context"
            xmlns:mvc = "http://www.springframework.org/schema/mvc"
            xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation = " 
            http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd 
            http://www.springframework.org/schema/mvc
            http://www.springframework.org/schema/mvc/spring-mvc.xsd 
            
            ">
                
            <context:component-scan base-package="com.backend.apitest" />
                <context:component-scan base-package="com.backend.restbackend" />

                <import resource="dataSource.xml" />
            
                <!-- <import resource="hibernate.cfg.xml" /> -->
                
                
                
                <bean id="viewResolver"
                    class="org.springframework.web.servlet.view.InternalResourceViewResolver">
                    
                    <property name="prefix" value="/WEB-INF/views/" />
                    <property name="suffix" value=".jsp" />
                    
                        
                    </bean>
                    
            
                
            
                </beans>
    Step 2 :
        now we have to import dataSource.xml file like that -

                    <?xml version="1.0" encoding="UTF-8"?>
                    <beans xmlns="http://www.springframework.org/schema/beans"
                    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                    xmlns:context="http://www.springframework.org/schema/context"
                    xmlns:tx="http://www.springframework.org/schema/tx"
                    xmlns:mvc="http://www.springframework.org/schema/mvc"
                    xsi:schemaLocation="
                        http://www.springframework.org/schema/beans
                        http://www.springframework.org/schema/beans/spring-beans.xsd
                        http://www.springframework.org/schema/context
                        http://www.springframework.org/schema/context/spring-context.xsd
                        http://www.springframework.org/schema/mvc
                        http://www.springframework.org/schema/mvc/spring-mvc.xsd
                        http://www.springframework.org/schema/tx 
                        http://www.springframework.org/schema/tx/spring-tx.xsd">

                    <bean id="dataSource"
                        class="org.springframework.jdbc.datasource.DriverManagerDataSource">
                        <property name="url"
                            value="jdbc:mysql://localhost:3306/apitest" />
                        <property name="username" value="root" />
                        <property name="password" value="root" />
                        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
                        
                    </bean>
                    
                        <!-- Session Factory Declaration -->
                    <bean id="sessionFactory"
                        class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
                        <property name="dataSource" ref="dataSource" ></property>
                        <property name="packagesToScan" value="com.backend.restbackend" ></property>
                        <property name="hibernateProperties">
                            <props>
                                <!-- SQL Dialect -->
                                <prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
                                
                                <!-- SQL Server 2014 Dialect -->
                                <!-- <prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop> -->
                                
                                <!-- Your required Database Name -->
                                <!-- <prop key="hibernate.default_schema">tests</prop> -->
                                
                                <prop key="hibernate.show_sql">true</prop>
                                <!-- <prop key="hibernate.enable_lazy_load_no_trans">true</prop> -->
                                <prop key="format_sql">true</prop>
                                <!-- <prop key="use_sql_comments">true</prop> -->
                            </props>
                        </property>
                        
                    </bean>
                    
                    <!-- Step 3: Hibernate transaction manager -->
                    <bean id="transactionManager"
                            class="org.springframework.orm.hibernate5.HibernateTransactionManager">
                        <property name="sessionFactory" ref="sessionFactory"/>
                        
                    </bean>
                    
                    <!-- Step 4: Enable transactional behavior based on annotations -->
                    <tx:annotation-driven transaction-manager="transactionManager" />
                </beans>


        This fie is used when Spring configuration is provided to Application by application context file. It defines beans at root webapp context.

            By <context:annotation-config/> element, we tells application to activate beans already registered in application context. It gives general support for annotation Like @Required, @Autowired, @PostConstructor
            By <context:component-scan base-package=”com”/> element, we tells application to activate beans already registered in application context and scan package to find, register beans in application context.
            By < mvc:annotation-driven /> element, we gives application to support for annotation-driven MVC Controllers Like @RequestMapping, @Controller, @RequestBody, @ResponseBody
            By < mvc:resources mapping=”/resources/**” location=”/resources/” /> element,
            <mvc:annotation-driven /> is to tell that you can define spring beans dependencies without defining much elements in xml or implements interface or extends a class.
            @Repository is to tell that Class is a Dao without having to extend JpaDaoSupport or SubClass DaoSupport.
            @Controller is to tell that Class having all methods to handle HTTP request without implements Controller interface or extends Sub class of Controllers.
            <context:component-scan base-package=”com” /> is to tell that your spring application will search base package for scanning classes with @Controller, @Services, @Repository, or @Component
            <mvc:resources mapping=”/resources/**” location=”/resources/” /> is tell that spring application needs to define path location and mapping to static resources like CSS, Images or JavaScripts.
            <bean> is a java bean. Java Bean is a simple class with private fields and setter, getter methods. In XML we can defined it for usage. So here in this file three of beans tags are used with properties. Each property is like Class Private Field.
            DataSource Bean: There are two attribute defined in this bean.
            ID is defined for Unique Identifier for this bean as “dataSource”
            CLASS is defined for reference type of “org.apache.commons.dbcp.BasicDataSource”.
            BasicDataSource of Apache Commos is used for interaction with Relational Database. It helps for creating a new connection for an application.
            Properties of BasicDataSource class:
            driverClassName: The JDBC Driver Class Name to be used.
            url: The connection URL to be passed to JDBC driver to establish a connection.
            username: The connection username to be passed to JDBC driver to establish a connection.
            password: The connection password to be passed to JDBC driver to establish a connection.
            SessionFactory Bean: There are two attribute defined in this bean.
            ID Is defined for Unique Identifier for this bean as “sessionFactory”
            CLASS is defined for reference type of “org.springframework.orm.hibernate4.LocalSessionFactoryBean”.
            Properties of LocalSessionFactoryBean class:
            dataSource: SessionFactory uses dataSource properties. There is ref a attribute for referring bean by its ID.
            packagesToScan: To specify packages to search for autodetection of entity classes in the classpath.
            hibernateProperties : It sets hibernate properties.
            hibernate.dialect: To specify correct database Dialect. Each Database has different SQL code generator.
            hibernate.show_sql: Write all SQL statements to CONSOLE
            hibernate.default_schema: Qualifies unqualified Table names with Given TableName and Schema Name.
            format_sql: Pretty print the SQL in Console and LOG.
            use_sql_comments: Hibernate will generate Comments inside SQL.
            TransactionManager Bean: There are two attribute defined in this bean.
            ID Is defined for Unique Identifier for this bean as “transactionManager”
            CLASS is defined for reference type of “org.springframework.orm.hibernate4.HibernateTransactionManager”.
            Properties of HibernateTransactionManager Class: 
            This transaction manager is appropriate for applications that use a single Hibernate SessionFactory for transactional data access

            */
3. What is the used of Web.xml in spring mvc ?
                OR 
    How to define Web.xml file in sprint mvc project ?
=>

                    <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
                        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                        http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
                        version="3.1">

                <display-name>Archetype Created Web Application</display-name>
                
                    <!-- Configuring front-controller -->
                    <servlet>
                        <servlet-name>dispatcher</servlet-name>
                        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
                        <init-param>
                    <param-name>contextConfigLocation</param-name>
                    <param-value>classpath:applicationContext.xml</param-value>
                    </init-param>
                    <load-on-startup>2</load-on-startup>

                    </servlet>

                    <servlet-mapping>
                        <servlet-name>dispatcher</servlet-name>
                        <url-pattern>/</url-pattern>
                    </servlet-mapping>
                
                </web-app>

        WEB.xml : It is a configuration file for web application in java. It instructs the servlet container (Tomcat) which class to load.
                    Filters could be defined in it.
                    Welcome file list could be defined in it.
                    Error pages could be defined in it.

        Init-param: It is a static parameter, which is defined within servlet tag.It is a servlet level scope. At the servlet level you can get value of this.

        Context-param: It is a static parameter, which is defined in web.xml file. It is an application level scope parameter. If the data does not change frequently you can store in it.

        Servlet: The servlet element contains the declarative data of a servlet.

        Servlet-Mapping: The servlet-mapping element defines a mapping between a servlet and a URL pattern.
        
        Listener: The Listener element defines an event of the web application.
