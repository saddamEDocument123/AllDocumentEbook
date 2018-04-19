/**

 */

1. Mobile Sms integration using Twilio  in java ?
=>	
    step 1  we have to create twilio account using this website https://www.twilio.com/ 
    step 2  Then we have to get 3 information String 

            ACCOUNT_SID = "ACb984ebe5fa98b08b29f21139b7edd152";
	        String AUTH_TOKEN = "50420a58d72b94576f8a9d854d07ff55";
	 	    String TWILIO_NUMBER = "+19295002280";

	step 3 then u have to add twilio dependency into pom file 
		
		<!-- Twilio api for sms integration file -->

		<dependency>
			<groupId>com.twilio.sdk</groupId>
			<artifactId>twilio-java-sdk</artifactId>
			<version>3.4.5</version>
		</dependency>

	step 4 Then u have to add this part of code :
	
		{
				
			String phonenumber = loginUser.getContact();
			String username = loginUser.getUserName();
			String password = loginUser.getUser_password();
		

			
		        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		 
		        // Build a filter for the MessageList
		        List<NameValuePair> params = new ArrayList<NameValuePair>();
		        params.add(new BasicNameValuePair("Body", "User Name: "+username+"\nPassword: "+password));
		        params.add(new BasicNameValuePair("To",phonenumber )); //Add real number here
		       // params.add(new BasicNameValuePair("To", "+919740092365"));
		        params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

		        MessageFactory messageFactory = client.getAccount().getMessageFactory();
		        Message message = messageFactory.create(params);
		        System.out.println(message.getSid());
		        
		        loginUseRes.setStatus_code(JsonResponse.CODE__EMPTY);
				loginUseRes.setStatus_message("User Name And Phone Number Successufully Send");
				//logger.error(ApiErrors.ERROR__NO_USERS_EXIST);
				loginUseRes.setLoginUser(loginUser);
		        return loginUseRes; 
			}
		    
		}   catch (TwilioRestException e) {
	        System.out.println(e.getErrorMessage());
	        return null;
	    }


2. Email Integration using email id 
=> 
    // 1st we have to add follwing dependency into our pom file 
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

        <!-- email api intragation -->

		<dependency>
			<groupId>javax.mail</groupId>
			<artifactId>mail</artifactId>
			<version>1.4.7</version>
		</dependency>

    // 2nd Then you have to add some configaration file into your applicationContext.xml file or dispatcher-servlet.xml file

        <!-- email configuration  -->
    
        <bean id="mailSender" class="org.springframework.mail.javamail.JavaMailSenderImpl">
            <property name="host" value="smtp.gmail.com" />
            <property name="port" value="587" />
            <property name="username" value="sksddmhosan@gmail.com" />
            <property name="password" value="9800536118Sa" />
            <property name="javaMailProperties">
                <props>
                    <prop key="mail.transport.protocol">smtp</prop>
                    <prop key="mail.smtp.auth">true</prop>
                    <prop key="mail.smtp.starttls.enable">true</prop>
                </props>
            </property>
       </bean>   

    // 3rd Then write the pice of code into your controller 

        //Set all input 
		    	String  recipientAddress = user.getEmail(); //Geting email from user 
				 String subject = "One Time Password";      // Subject what ever you want to send
				 String message = sendingOTP;               //this is message of the email
				  
				 
				// prints debug info
		           System.out.println("To: " + recipientAddress+" Subject: " + subject +" Message: " + message);
		    	
				// creates a simple e-mail object
             SimpleMailMessage email = new SimpleMailMessage();
                email.setTo(recipientAddress);
                   email.setSubject(subject);
                   email.setText(message);
                   
                   
                   
                // sends the e-mail
                   mailSender.send(email); 