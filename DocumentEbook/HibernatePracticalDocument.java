
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


5. 