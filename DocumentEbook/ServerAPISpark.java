Spark  - EMC Document

// SPARK EMC DATABASE CONFIGARATION

Project Requirements :

 Technologies: Java 1.8,Spring4.0,Hibernate 5,MySql
 Tool : Eclipse IDE , Apache Tomacat Server 8.0, Maven

Project Developement Details :
 
  Database Details :
  
1. Signup / Login for SP table 
2. Address Table for SP
3. SignUp / Login / Address for User in User  Table
4. Events Management Table
5. Categories Table
6. Authentication Table 


  Table Row/Column Details 

  Signup / Login  SP Details Table :

=>	ID	SP_ID		SP_Name	  SP_UserName	SP_Password		SP_Email		Admin_ID	SP_Profile_Image	

	1	SP_001		Saddam	  Sadda1		12345			s@gmail.com		Admin_001	nice.jpg	


=>	SP_Contact	Request_Type	Subscription		Skype_ID		Web_link		SP_Video_Link	SP_Categore		

	720442		SP				free/pro/pos		saddam1712		www.log.com		https://www.	DJ / Brand


ID				: Auto Incremented Value
SP_ID			: SP_ID is a primary key 
SP_Name			: This is the Name field for SP 
SP_UserName		: SP User Name will be given unique Name
SP_Password		: Password for SP
Admin_ID		: Admin_ID fied can not be null 
SP_Profile_Image: SP image it can be null but it store image file only
SP_Contact		: SP uniquie validated Mobile number 
Request_Type	: Request type it is depend on the type like it can be SP/User/Admin 
Subscription	: It will store which type of SP like free / pro /pos 
Skype_ID		: SP Skype_ID 
Web_link		: SP Web link if any 
SP_Video_Link	: SP will be set his / her youtube video link 
SP_Categore		: SP Categorie like its DJ / Brand  / any type 

Address Details table for SP :

=> ID	SP_ID	House_No	Locality		Pin_Code	City		Latitude	Longitude	

   1	SP_001	#3			Marathahalli	560037		Bangalore	8.449887	6.8629617

ID 		: Auto Incremented Value
SP_ID 	: This is foregin Key from table signup table
House_No: This is House_No  
Locality: SP Locality
Pin_Code: SP Pin Pin_Code
City	: SP City 
Latitude: SP location Latitude
Longitude : SP location Longitude

SignUp / Login / Address for User in User  Table :

=> ID	User_ID		User_Name	User_UserName	User_Profile_Image	User_Password	User_Contact	User_Email	Request_Type

   1	User_001	synixia		synixia12		pic.jpg				12324			7204414827		s@gmail.com	 User

	
=> User_Address			Latitude	Longitude

	#324,Marathahalli,	12.988773	7.7164148723	
	713409		


ID					: Auto Incremented Value
User_ID				: Automated genarate unique User_ID primary key 
User_Name			: User Name
User_UserName		: Unique User name 
User_Profile_Image	: User Profile image 
User_Password		: User Password
User_Contact		: User validated phone number
User_Email			: User validated email ID
Request_Type		: Request type of User as User 
User_Address		: Full Address of User
Latitude			: User location latitude
Longitude			: User location Longitude

Events Management Table Using :

=>	ID	Start_Date	End_Date 	SP_ID	User_ID		Message	






Categories Table :

=>	ID	Categorie_ID	Categorie_Name		Categorie_Type		Admin_ID

	1	Categorie_01	DJ					Music				Admin_001


ID				: Auto Incremented Value
Categorie_ID	: Categorie ID automatic genarate , it is a primary key
Categorie_Name	: Categorie Name like DJ
Categorie_Type	: Which type of Categorie
Admin_ID		: Who add this Categorie


1. Login Admin / SP / Customer  
2. Sign Up  Admin / SP / Customer 
3. Categories 
4. 


API : 
1.  Login API for User 
Request:
       {
          “User_Name” : “saddam”,
          “Password” : “saddam123$”,
          "Request_Type" : "Admin / User"
}

                        
For User Request 
Response:
            	 {
			“Status_Code” : 200,
			“Status_Message” : “Successfully Login”,
			“Data” : {
						“User_ID” : “User_001”,
						"Name" : "Saddam",
						"User_Name": "saddam1",
						"User_Email" : "sksddmhosan@gmail.com" 
						“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}
		}


2. Login API For SP Request 

Request:
       {
          “SP_UserName” : “saddam”,
          “Password” : “saddam123$”,
          "Request_Type" : "Admin / User"
}
Response:
		{
			“Status_Code” : 200,
			“Status_Message” : “Successfully Login”,
			“Data” : {
					“Admin_ID” : “Admin_001”,
					"SP_ID" : "Sp_001",
					"SP_Name" : "Saddam",
					"SP_UserName": "saddam1",
					"SP_Email" : "sksddmhosan@gmail.com" 
					“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}
		}

If Request is wrong or the credentials are wrong or the time-out.
		{
			“Status_Code” : 400/404/500/504,
			“Status_Message” : “Invalid_Credentials”,
			“Data” : {
						}
		}	 
3. SignUp User and Admin API Request and Response : 

 //this api used both User and Admin 
 // For User  sign up 
       Request : 
		{
          "UserName" : "Saddam",
		  "User_Name" : "sadda1",
		  "User_Password" : "12345",
		  "User_Contact" : "7204414827",
		  "User_Email" : "sksddmhosan@gmail.com",
          "Request_Type" : "Admin/SP/User"
        }
		
	Response :	
		{
			“Status_Code” : 200,
			“Status_Message” : “Successfully Login”,
			“User_Data” : {
					"User_ID" : "User_001",
					"Name" : "Saddam",
					"User_Name": "saddam1",
					"Password": "12345678",
					"Email_ID" : "sksddmhosan@gmail.com" 
					“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}
		}
		
		
	//For Admin SignUp	:
	
   	Request : 
		{
          "Name" : "Saddam",
		  "User_Name" : "sadda1",
		  "User_Password" : "12345",
		  "User_Contact" : "7204414827",
		  "User_Email" : "sksddmhosan@gmail.com",
          "Request_Type" : "Admin/SP/Customer"
        }
	Response :	
		{
			“Status_Code” : 200,
			“Status_Message” : “Successfully Login”,
			“User_Data” : {
					“Admin_ID” : “Admin_001”,					
					"Name" : "Saddam",
					"User_Name": "saddam1",
					"Password": "12345678",
					"phn" : "7204414827"
					"Email_ID" : "sksddmhosan@gmail.com" 
					“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}
		}


4. Add or Sign up  Service Provider API Request and Response 

 Request :
          {
          "SP_Name" : "Saddam",
		  "SP_UserName" : "sadda1",
		  "Admin_ID" : "Admin_001”",
          "SP_Profile_Image": "image.jpg"
		  "SP_Password" : "12345",
		  "SP_Contact" : "7204414827",
		  "SP_Categore" : "DJ/Music/Band/"
		  "SP_Email" : "sksddmhosan@gmail.com",
          "Request_Type" : "SP",                                                                
		  "Subscription" : "free/pro/pos"
        }
		
		Response :

         {
			“Status_Code” : 200,
			“Status_Message” : “Successfully Login”,
			“SP_Data” : {
					“Admin_ID” : “Admin_001”,
					"SP_ID": "SP_001",
					"Name" : "Saddam",
					"User_Name": "saddam1",
					"phn" : "7204414827"
					"Email_ID" : "sksddmhosan@gmail.com" 
					“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}
		}

5. Update or Edit Service Provider API request and response 

Note :
       SP_Video_Link will must be youtube link 
  Request :
    UserDetails: {
          "SP_Name" : "Saddam",
		  "SP_UserName" : "sadda1",
		  "Admin_ID" : "Admin_001”,
		  "SP_Profile_Image": "image.jpg"
		  "SP_Password" : "12345",
		  "SP_Contact" : "7204414827", (validation)
		  "SP_Email" : "sksddmhosan@gmail.com", (validation )
          "Request_Type" : "SP",                                                                
		  "Subscription" : "free/pro/pos",
		  "SP_Categore" : "DJ/Music/Band/"
		  "Skype_ID" : "saddam1712",
		  "Web_link" : "www.saddamLogo.com"
		  "SP_Video_Link": "https://www.youtube.com/watch?v=QUYfdTvXRgg" 
		  
        }
		Address :{
		
		       "House_No": "#324",
			   "Locality" : "Marathahalli",
			   "Pin_Code": "713409",
			   "City" : "Bangalore",
			   "latitude" : "876534",
			   "longitude" : "6862"
		}
             
			 
	Response :
	
	      {
				“Status_Code” : 200,
				“Status_Message” : “Successfully Update ",
				UserDetails: {
								"SP_Name" : "Saddam",
								"SP_UserName" : "sadda1",
								"Admin_ID" : "Admin_001”,
								"SP_ID" : "SP_001",
								"SP_Password" : "12345",
								"SP_Contact" : "7204414827", (validation)
								"SP_Email" : "sksddmhosan@gmail.com", (validation )
								"Request_Type" : "SP",  
								"SP_Categore" : "DJ/Music/Band/",                                                              
								"Subscription" : "free/pro/pos",
								"Skype_ID" : "saddam1712",
								"Web_link" : "www.saddamLogo.com",
								"SP_Video_Link": "https://www.youtube.com/watch?v=QUYfdTvXRgg" 
		  
							}
							Address :{
		
										"House_No": "#324",
										"Locality" : "Marathahalli",
										"Pin_Code": "713409",
										"City" : "Bangalore",
										"latitude" : "876534",
										"longitude" : "6862"
									}
             
				
		}
 

 6. Update or Edit User API request and response 

Note :
      
  Request :
    UserDetails: {
          "User_Name" : "Saddam",
		  "User_UserName" : "sadda1",
		  "User_Profile_Image": "image.jpg"
		  "User_Password" : "12345",
		  "User_Contact" : "7204414827", (validation)
		  "User_Email" : "sksddmhosan@gmail.com", (validation )
          "Request_Type" : "User",                                                                
		  
        }
		Address :{
		
		       "House_No": "#324",
			   "Locality" : "Marathahalli",
			   "Pin_Code": "713409",
			   "City" : "Bangalore",
			   "latitude" : "876534",
			   "longitude" : "6862"
		}
             
			 
	Response :
	
	      {
				“Status_Code” : 200,
				“Status_Message” : “Successfully Update ",
				UserDetails: {
								"User_Name" : "Saddam",
								"User_UserName" : "sadda1",
								"User_ID" : "SP_001",
								"User_Password" : "12345",
								"User_Contact" : "7204414827", (validation)
								"User_Email" : "sksddmhosan@gmail.com", (validation )
								"Request_Type" : "User",                                                                
							}
							Address :{
		
										"House_No": "#324",
										"Locality" : "Marathahalli",
										"Pin_Code": "713409",
										"City" : "Bangalore",
										"latitude" : "876534",
										"longitude" : "6862"
									}
             
				
		}

7. List Of Category API Request and Response (This is GET method used ):
Response ;
			{
				“Status_Code” : 200,
				“Status_Message” : “Successfully Login”,
				"Category_List":[{
								"Category_Name": "DJ",
								"Category_ID": "Category_001" 
								},
								{
								"Category_Name": "Music",
								"Category_ID": "Category_002"
								}
									.......
									.......
									.......
								]
			}
8.List of SP(Service Provider)   API request and Response API using category_Name :
Request :
			{
				"Category_ID" : "Category_1",
				"Category_Name" : "DJ"
				“Auth_Token” : “24-36 sized string which is sent to use for further API request” 
			}
	Response :
          {
          “Status_Code” : 200,
          “Status_Message” : “Successfully ”,
            “SP_List” :[ 
                       {
                        “SP_ID” : “SP_001”,
                        "SP_Name":"Saddam",
                         "SP_Phn": "7204414827",
                         "rating": 5,
                         "No_Event_Perform" : "4"
                        },
                        {
                        “SP_ID” : “SP_001”,
                        "SP_Name":"Saddam",
                        "SP_Phn": "7204414827",
                        "rating": 5,
                       "No_Event_Perform" : "4"
                       
}
.....................
.........
.........
]

}                         

9. SP Details API Request and Response for User

	Request :
			{
			"SP_ID" : "SP_1",
			"SP_Type": "Free / Pro / Pos"
			“Auth_Token” : “24-36 sized string which is sent to use for further API request” 
			}
	Response: 
           {
             “Status_Code” : 200,
             “Status_Message” : “Successfully ”,
             “SP_Details” :
                       {
                       “SP_ID” : “SP_001”,
                       "SP_Name":"Saddam",
                       "SP_Phn": "7204414827",
                       "rating": 5,
                       "No_Event_Perform" : "4",
					   "SP_Type" : "Pro/Pos/Free",
					   "Profile_Pic" : "",
					   "Skype_ID": "saddam1712",
					   "mobile": "7204414827",
					   "Video_URL" "http://youtube.com",
					   "Albums_Details" : "",
					   "Sub_Start_date" : "12.23.2017",
					   "Sub_End_date" : "12.23.2018",
		             }           
					   
                “Auth_Token” : “24-36 sized string which is sent to use for further API request”

            }     


10. Search list of service provider within particular range(3 km) by User 
 
Request :
     {
   	"User_ID" : "User_1",
    "latitude": 12.916472,
    "longitude": 77.651926,
    "distance": 3,(Km)
    "SP_Type": "DJ"
     }

Response :
   {
    "status_code": "200",
    "status_message": "Successfully",
    "listOfSP": [
        {
            "Type": "DJ",
            "Name": "DJ Ltd",
            "lat": 12.898106,
            "lng": 77.630926,
	        "SP_ID" : "SP_DJ1"
        },
        {
            "Type": "DJ",
            "Name": "DJ2 Ltd",
            "lat": 12.934025,
            "lng": 77.636,
            "SP_ID" : "SP_DJ2"
        },
        {
            "Type": "DJ",
            "Name": "DJ3 Ltd",
            "lat": 12.904872,
            "lng": 77.692381,
            "SP_ID" : "SP_DJ1"
        }
    ],
}

11. Forgot password for user and send OTP to user mobile number 
    Auto genarate password will be send your register mobile number or given mobile number 
    Request For User :
          {
        	“User_Names" : "User_1",
            "User_Phone_number": "7204414827" (register mobile number)

         }


  Response for the User :
        {
        "status_code": "200",
        "status_message": "Successfully",
           “Data” : {
						“User_ID” : “User_001”,
						"Name" : "Saddam",
						"User_Name": "saddam1",
						"User_Email" : "sksddmhosan@gmail.com" 
						“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}

        }

12. Forgot password for SP and send OTP to SP mobile number 


    Request For SP :
    {
        "SP_ID": "SP_001",
        "SP_Phone_number": "7204414827"
    }

   Response For SP :
      {
        "status_code": "200",
        "status_message": "Successfully",
           “Data” : {
						“SP_ID” : “User_001”,
						"SP_Name" : "Saddam",
						"SP_UserName": "saddam1",
						"SP_Email" : "sksddmhosan@gmail.com" 
						“Auth_Token” : “24-36 sized string which is sent to use for further API request”
					}

        }

13. Reset  Password for User 
   Request :
       {

       }

Evente Handler using calender 
14. Book Slots for an event using User_ID , Date and Time and Block the SP date
   Note : when ever user want to block any SP date that time user will be given one notification to SP ,
     If SP acceptd that notification then we will block that particular date
   Request :
   {
	   "User_ID": "User_001"
	   "Time_Stamp" ""
   }
  	Response :
	{
             “Status_Code” : 200,
             “Status_Message” : “Successfully ”,
             “SP_Details” :
                       {
                       
		               }           
					   
                “Auth_Token” : “24-36 sized string which is sent to use for further API request”

     } 

 15.List of the bolck date in this month for SP
     {
	   "SP_ID": "User_001
   }
  	Response :
	{
             “Status_Code” : 200,
             “Status_Message” : “Successfully ”,
             “SP_Details” :
                       {
                       
		               }           
					   
                “Auth_Token” : “24-36 sized string which is sent to use for further API request”

     } 
16.Get List of the SP which is using prime member
17. Get all the SP List as free member

18. Get particuler SP details
    Note :Response will Depend on the subscription type like if we will take free subscription
	then some field will not coming like video upload 
   Request :
     {
		 "SP_ID": "SP_001",
		 "Subscription" : "free/pro/pos",
	 }
	Response :
	{
             “Status_Code” : 200,
             “Status_Message” : “Successfully ”,
             “SP_Details” :
                       {
                       “SP_ID” : “SP_001”,
                       "SP_Name":"Saddam",
                       "SP_Phn": "7204414827",
                       "rating": 5,
                       "No_Event_Perform" : "4",
					   "SP_Type" : "Pro/Pos/Free",
					   "Profile_Pic" : "",
					   "Skype_ID": "saddam1712",
					   "SP_Contact": "7204414827",
					   "SP_Video_URL" "http://youtube.com",
					   "Albums_Details" : "",
					   "Sub_Start_date" : "12.23.2017",
					   "Sub_End_date" : "12.23.2018",
		             }           
					   
                “Auth_Token” : “24-36 sized string which is sent to use for further API request”

     } 
19.Get particuler User details

    Request :
     {
		 "User_ID": "User_001"
	 }
	Response :
	{
             “Status_Code” : 200,
             “Status_Message” : “Successfully ”,
			UserDetails: {
						"User_Name" : "Saddam",
						"User_UserName" : "sadda1",
						"User_Profile_Image": "image.jpg"
						"User_Contact" : "7204414827", (validation)
						"User_Email" : "sksddmhosan@gmail.com", (validation )
						"Request_Type" : "User",                                                                
						
					    }
		Address :{
		
		       "House_No": "#324",
			   "Locality" : "Marathahalli",
			   "Pin_Code": "713409",
			   "City" : "Bangalore",
			   "latitude" : "876534",
			   "longitude" : "6862"
		}
                  
					   
                “Auth_Token” : “24-36 sized string which is sent to use for further API request”

     }
20.

    








