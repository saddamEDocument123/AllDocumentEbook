/*
   Spark-EMC ER-Model requirement 
 */
1. Entity : SP_Details
    Attribute : SP_ID(Primary key), SP_Name, SP_UserName, SP_Password, SP_Email, SP_PImage,
                SP_Contact, Request_Type, SP_Type, SP_SkypeId, SP_WebLink,
                SP_Category, Ratings, Admin_ID, 


2. Entity : SP_Address
    Attribute : SP_ID(foreign key), House_No, Locality, PinCode,
                City, Latitude, Longitude, 

3. Entity : User_Details
    Attribute : User_ID, User_Name, User_name, Password, User_Contact,
                User_Email, Request_Type, 

4. Entity : User_Address
    Attribute : User_ID(foreign key), Latitude, Longitude.


5. Entity : Categories
    Attribute : Categories_ID, Categories_Type, Categories_Name, Admin_ID,

6. Entity : Event_Managment_Calendar
    Attribute : Event_ID, Start_Date, End_Date, SP_ID, User_ID, Message.

    