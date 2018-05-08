/*
    JSON REQUEST AND RESPONSE
 */

SK - Shopkeeper 
S - Shop

1. LOGIN REQUEST AND RESPONSE FOR SHOOPKEEPER

Json Request : 
            {
                "user_Name" : "",
                "password" : ""
            }

Json Response :
    {
        
        {
        "S_ID" : "",
        "SK_Name" : "",
        "SK_Phn" : "",
        "S_Name" : "",
        "S_Type" : "",
        "S_Image" : "",
        "S_phn" : "",
        "app_Token" : ""
        "S_Address ": 
                {
                    "S_Latitude" : "",
                    "S_Longitude" : "",
                    "S_Landmark" : "",

                },
        
            
    }
                }


 2. SIGN UP REQUEST AND RESPONSE FOR SHOOPKEEPER 


    Json Request  :

    {
        "S_ID" : "",
        "SK_Name" : "",
        "SK_Phn" : "",
        "S_Name" : "",
        "S_Type" : "",
        "S_Image" : "",
        "S_phn" : "",
        "S_Address" : 
                {
                    "S_Latitude" : "",
                    "S_Longitude" : "",
                    "S_Landmark" : "",

                },
        
            
    }


    RESPONSE :

    {
        "status_code" : "200",
        "status_message" " Sussfully authenticate "
        "Data" :
        {
        "S_ID" : "",
        "SK_Name" : "",
        "SK_Phn" : "",
        "S_Name" : "",
        "S_Type" : "",
        "S_Image" : "",
        "S_phn" : "",
        "app_Token" : ""
        "S_Address ": 
                {
                    "S_Latitude" : "",
                    "S_Longitude" : "",
                    "S_Landmark" : "",

                },
        
            
        }
    }


3. Update Shop 

Json Request :

    
    {
        "S_ID" : "",
        "SK_Name" : "",
        "SK_Phn" : "",
        "S_Name" : "",
        "S_Type" : "",
        "S_Image" : "",
        "S_phn" : "",
        "S_Address" : 
                {
                    "S_Latitude" : "",
                    "S_Longitude" : "",
                    "S_Landmark" : "",

                },
        "S_Ad" : 
            {
                "ad_ID" : "",
                "ad_Image1" : "",
                "ad_Image2" : "",
                "ad_Image3" : "",
                "ad_Image4" : ""
            }
        
            
    }


    Json Response :

    {
        "status_code" : "",
        "status_message" : ""
                "Data" : 
                {
                        "S_ID" : "",
                        "SK_Name" : "",
                        "SK_Phn" : "",
                        "S_Name" : "",
                        "S_Type" : "",
                        "S_Image" : "",
                        "S_phn" : "",
                        "S_Address" : 
                                {
                                    "S_ID" : "",
                                    "S_Latitude" : "",
                                    "S_Longitude" : "",
                                    "S_Landmark" : "",

                                },
                        "S_Ad" : 
                            {
                                "S_ID" : "",
                                "ad_ID" : "",
                                "ad_Image1" : "",
                                "ad_Image2" : "",
                                "ad_Image3" : "",
                                "ad_Image4" : ""
                            }
                 }
     }

  
4. Get all list of shop from your location 

Json Request :
            {
                
            }
