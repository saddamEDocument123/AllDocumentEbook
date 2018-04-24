
/**
    This Document basically containt  All Question and Answer for Hibernate Logical and
    pratical Query usign in real time project and
    getting all question from real time project

    @Author Sk Saddam Hosan 

 */

1. How to save the data usign SessionFactory in Hibernate ?
=>
    sessionFactory.getCurrentSession().persist(product);
       return true;

2. How to add list of element into DTO class for project using hibernate annotation?
=>
    * For that we have to add one annotation in Hibernate part Like this 

            @ElementCollection
	        List<String> Block_Date;

3. How to commit the query using Hibernate command / how to submit query in Hibernate  ?
=>
    sessionFactory.openSession().beginTransaction().commit();
    * Before call commit() u have to call flush() method
    Like : 

        sessionFactory.openSession().flush();
		sessionFactory.openSession().beginTransaction().commit();

3. How to create HQL query ?
=>
        String selectProductsByShopId = "FROM Product_Data WHERE Shop_ID = :Shop_ID AND Availability = :Availability";
		    

4. How to used Between in Hibernate HQL query ?
=>
        //This is SP_ID to get prticuler SP_ID date
        String SP_ID = blockDateRequest.getSP_ID();
        // Starting_Date given by user but this is not decleard in database column
		String Starting_Date = blockDateRequest.getStarting_Date();
        // Ending_Date given by user but this is not decleard in database column
		String Ending_Date = blockDateRequest.getEnding_Date();

        //HQL query for between 
         String showingAllBlockDate = "FROM DateManagement As d where d.Block_Date between :Starting_Date AND :Ending_Date AND SP_ID = :SP_ID";
         
         //Hibernate query to get list of block date
         List<DateManagement> list= sessionFactory
					.getCurrentSession()
					.createQuery(showingAllBlockDate, DateManagement.class)
						.setParameter("SP_ID", SP_ID)
						.setParameter("Starting_Date", Starting_Date)
						.setParameter("Ending_Date", Ending_Date)
							.getResultList();

5. How to find the distance within 3 or more km usign langitude and latitude in map ?
=> 
    * In this time we need string name and latitude and longitude that particuler 
     location wher user is used

     // that many data or variable we need 
     String name = distanceClass.getName();
			double lat = distanceClass.getLat();
			double lng = distanceClass.getLng();
			int range = distanceClass.getRange();

    // query that we all getting the distance from database ussing the math function 
    String sqlQuery = "FROM DistanceClass WHERE ((((ACOS( SIN(RADIANS("
					+ lat
					+ ")) * SIN(RADIANS(lat)) + COS(RADIANS("
					+ lat
					+ ")) * COS(RADIANS(lat)) * COS(RADIANS(lng) - RADIANS("
					+ lng
					+ ")) ) * 3963.1676) <= "
					+ range
					+ ")AND(name=:name )) OR (lat = "
					+ lat
                    + "AND lng ="
                     + lng
                     + ")) ";
 // we can used the value into that way also ....we need to exexute the query
    //into our imaple class 

    List<DistanceClass> list = sessionFactory.getCurrentSession().createQuery(sqlQuery,DistanceClass.class)
			    .setParameter("name", name)
			    .setMaxResults(15)  
			    .getResultList();   

6. how to Get the list of limited data usign Hibernate ?
=>
    * Using - setMaxResults(10) Like this  

        List<DistanceClass> list = sessionFactory.getCurrentSession().createQuery(sqlQuery,DistanceClass.class)
			    .setParameter("name", name)
			    .setMaxResults(15)  // 15 list we want thats why we are setting the number of list
			    .getResultList(); 
7. How 