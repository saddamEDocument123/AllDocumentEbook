

1. How to set up the spring Boot prject ?
=>
    1. create maven project using eclips

    2. add some pom dependecy


      <
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.14.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

        
		<dependency> // this is also optional
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
		</dependency>


		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>

        
		<dependency> // this is optional
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>



    3. create App.java class u can change this file name
        

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        /**
        * Hello world!
        *
        */
        @SpringBootApplication
        public class App 
        {
            public static void main( String[] args )
            {
                    SpringApplication.run(App.class, args);
                
            }
        }

    4. change port number for the application 

       create application.properties  file into resources package -
        
        server.port = 9090

    5. create controller 

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        @RestController
        public class PageController {
            
            @RequestMapping(value="/")
            public String HelloWorld() {
                return "Hello World";
            }

        }

    6. Add database like this  :

    create application.properties file -

    jdbc.driverClassName = com.mysql.jdbc.Driver
    jdbc.url = jdbc:mysql://localhost:3306/springboot
    jdbc.username = root
    jdbc.password = root
    hibernate.dialect = org.hibernate.dialect.MySQLDialect

    server.port=8001


    7. then create database loaded file like this :

       DBConfig.java   --- 


        package com.spring.boot.orm.api.config;

        import java.util.Properties;

        import javax.sql.DataSource;

        import org.hibernate.SessionFactory;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.PropertySource;
        import org.springframework.jdbc.datasource.DriverManagerDataSource;
        import org.springframework.orm.hibernate5.HibernateTransactionManager;
        import org.springframework.orm.hibernate5.LocalSessionFactoryBean;



        @PropertySource(value= {"classpath:application.properties"})
        @Configuration
        public class DBConfig {

            @Value("${jdbc.driverClassName}")
            private String driverClass;
            @Value("${jdbc.url}")
            private String url;
            @Value("${jdbc.username}")
            private String username;
            @Value("${jdbc.password}")
            private String password;
            @Value("${hibernate.dialect}")
            private String dialect;
            
            
            @Bean
            public DataSource getDataSource() {
                
                DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
                dataSource.setDriverClassName(driverClass);
                return dataSource;
                
            }
            
            @Bean
            public LocalSessionFactoryBean sessionFactory() {
                
                LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
                factory.setDataSource(getDataSource());
                factory.setHibernateProperties(hibernateProperties());
                factory.setPackagesToScan(new String[] {"com.spring.boot.orm.api"});
                return factory;
                
                
            }
            
            private Properties hibernateProperties() {
                Properties properties = new Properties();
                properties.put("hibernate.dialect", dialect);
                properties.put("hibernate.hbm2ddl.auto", "update");
                properties.put("hibernate.show_sql", "true");
                properties.put("hibernte.format_sql", "true");
                return properties;
            }
            
            @Bean
            public HibernateTransactionManager transactionManager(SessionFactory factory) {
                HibernateTransactionManager transactionManager = new HibernateTransactionManager();
                transactionManager.setSessionFactory(factory);
                return transactionManager;
                
            }
            
            
        }





    6. how to run the application jar file 

        goto that apllication jaar file and write -
        java -jar apllicationName

    7.
