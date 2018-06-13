

1. How to set up the spring Boot prject ?
=>
    1. create maven project using eclips

    2. add some pom dependecy


      <properties>
         <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
         <java.version>1.8</java.version>
        </properties>


     <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
         <version>2.0.2.RELEASE</version>
    </parent>


        <dependencies>
        <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <scope>test</scope>
        </dependency>
        
        <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
    </dependencies>

    // for create war file or jar file u have to add maven plugin like this --

     <build>
  
     <plugins>
			<!-- Update to latest version of JAVA -->
			<plugin>
			<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>

		</plugins>
        <finalName>SpringBootTest</finalName>
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

    6. how to run the application jar file 

        goto that apllication jaar file and write -
        java -jar apllicationName

    7.
