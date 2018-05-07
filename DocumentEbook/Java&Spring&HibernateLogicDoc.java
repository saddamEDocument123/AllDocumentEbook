/****
All Logic which is used in procject

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


3. How to Used @JsonView annotation and why we used @JsonView and When we can used?
								OR 
	How to return particular Json field remaing Json field will be hidde and no need to create new Json class?
=>
 https://spring.io/blog/2014/12/02/latest-jackson-integration-improvements-in-spring
		* We used when we need specific field return from particular corntroller 
		* if we need diffrent json response using one dto class that time we can used

    It can sometimes be useful to filter contextually objects serialized (Json response) to the HTTP response body. In order to
	provide such capabilities.


JsonModelClass.java 

	//In this class contain one or many interface as a structure of Json response
	//that interface also can be used as inheritence 
	
	package com.backend.restbackend.common;

	public class JsonModelClass {
	
		public interface PublicView {}

	}


//Model classs 
ImageValue.java 
//
	@Entity
	@Table(name = "testing")
	public class ImageValue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	
	private String User_ID;


	@JsonView(JsonModelClass.PublicView.class) //only need this field as a json response
	@Lob
	private byte[] image;

//controller 


	@JsonView(JsonModelClass.PublicView.class)
	@RequestMapping(value = "/get/jsonview", method = RequestMethod.POST)
	public @ResponseBody ImageValue  getSavingImageUsingJSONView(@RequestBody ImageValue imageValue ) {
		
		
		
		logger.info("User_ID Entered getSavingImage() in ImageController ");

		try {
			
			
			String User_ID = imageValue.getUser_ID();
			
			//Searches the Image in DB based on the Parameter User_ID
			ImageValue allImageValue = imageDAO.getImageValueUsingJSONView(User_ID);
			
		//	JsonView.with(allImageValue).onClass(ImageValue.class, match().exclude("contains"));
			
			
			if(allImageValue != null) {

				return allImageValue;
			}
			else {

				return allImageValue;
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}			
	}


4. How to send push notification using firebase fcm ?
                
=>

	* 1st u have to create firebase account and genarete server key like this -
			server key - AIzaSyAuS9vJADBUEWM_pAQcgPDGR_GcNWP2knw
			web site - https://console.firebase.google.com/project/testapi-202905/settings/serviceaccounts/adminsdk
					https://console.developers.google.com/apis/dashboard?project=testapi-202905&folder&organizationId&duration=PT1H

	* and then we have to take that fcm url 
			String FMCurl = "https://fcm.googleapis.com/fcm/send"; 

	controller.java class -

	/*
 * Push notification using firebase  checking fcm is working or not using fcm project
 * */
	
	@RequestMapping(value = "/fcmNotification", method = RequestMethod.GET)
	public ResponseEntity<String> send() {
		
		final String TOPIC = "JavaSampleApproach";
		JSONObject body = new JSONObject();
		body.put("to", "/topics/" + TOPIC);
		body.put("priority", "high");

		JSONObject notification = new JSONObject();
		notification.put("title", "JSA Notification");
		notification.put("body", "Happy Message!");
		
		JSONObject data = new JSONObject();
		data.put("Key-1", "JSA Data 1");
		data.put("Key-2", "JSA Data 2");

		body.put("notification", notification);
		body.put("data", data);

		HttpEntity<String> request = new HttpEntity<>(body.toString());

		CompletableFuture<String> pushNotification = pageDAO.send(request);
		CompletableFuture.allOf(pushNotification).join();

		try {
			String firebaseResponse = pushNotification.get();
			
			return new ResponseEntity<>(firebaseResponse, HttpStatus.OK);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>("Push Notification ERROR!", HttpStatus.BAD_REQUEST);
	}


	then Dao class ---- 

		import java.util.concurrent.CompletableFuture;

		import org.springframework.http.HttpEntity;

		public interface PageDAO {	
			
			CompletableFuture<String> send (HttpEntity<String> entity);
		}

	then DAOImpl class ---

		@Repository("pageDAO")
		@Transactional
		public class PageDAOImpl implements PageDAO {

			@Override
			public CompletableFuture<String> send(HttpEntity<String> entity) {
				
				String FIREBASE_SERVER_KEY = "AIzaSyAuS9vJADBUEWM_pAQcgPDGR_GcNWP2knw"; // You FCM AUTH key
				String FIREBASE_API_URL = "https://fcm.googleapis.com/fcm/send"; 
				RestTemplate restTemplate = new RestTemplate();

				ArrayList<ClientHttpRequestInterceptor> interceptors = new ArrayList<>();
				interceptors.add(new HeaderRequestInterceptor("Authorization", "key=" + FIREBASE_SERVER_KEY));
				interceptors.add(new HeaderRequestInterceptor("Content-Type", "application/json"));
				restTemplate.setInterceptors(interceptors);

				String firebaseResponse = restTemplate.postForObject(FIREBASE_API_URL, entity, String.class);

				return CompletableFuture.completedFuture(firebaseResponse);
			}

		}

	then create dto class ----


		import java.io.IOException;

		import org.springframework.http.HttpRequest;
		import org.springframework.http.client.ClientHttpRequestExecution;
		import org.springframework.http.client.ClientHttpRequestInterceptor;
		import org.springframework.http.client.ClientHttpResponse;
		import org.springframework.http.client.support.HttpRequestWrapper;

		public class HeaderRequestInterceptor implements ClientHttpRequestInterceptor {

			
			private final String headerName;
			private final String headerValue;

			public HeaderRequestInterceptor(String headerName, String headerValue) {
				this.headerName = headerName;
				this.headerValue = headerValue;
			}

			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
					throws IOException {
				HttpRequest wrapper = new HttpRequestWrapper(request);
				wrapper.getHeaders().set(headerName, headerValue);
				return execution.execute(wrapper, body);
			}
		}

		// now call  that particuler url 
		// If it is ok then it will send firebase id like  this 

		{"message_id":5245072321129692466}

5. How to creae OTP using automaticly ?
=>
			//create OTP for texting mesg
				 String sendingOTP = String.valueOf(sendOTP(6));
			        System.out.println(sendingOTP);


			//Function 

				//Generate automatic  OTP
	static char[] sendOTP(int length){
		
		String  number= "0123456789";
		Random r = new Random();
		char[] otp = new char[length];

		 for(int i=0 ; i<length ;i++){

		    otp[i] = number.charAt(r.nextInt((number.length())));
		 } 
		 return otp;
		 }


6. How to generate automaticly token  ?
=>
	* Create new class in that new class u just genatre defalut constructor and write this code -

	public Product() {
		 this.code = UUID.randomUUID().toString().substring(26).toUpperCase();
	 }

	* It will be automaticly genarete the unique token 


7. How to get random number or value from database ?
=>
	String selectLogin = "FROM AppToken ORDER BY rand()";
	//	Query query = sessionFactory.getCurrentSession().createQuery(selectLogin).setMaxResults(1);
		
	List<AppToken> list = sessionFactory.getCurrentSession()
						.createQuery(selectLogin,AppToken.class)
							.setMaxResults(1)
								.getResultList();