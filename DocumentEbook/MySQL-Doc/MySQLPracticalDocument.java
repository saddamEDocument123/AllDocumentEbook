/**
    This Document basically containt  All Question and Answer for MySql Query and
    getting all question from real time project

    @Author Sk Saddam Hosan 

 */


 1. How to show element between two number or date usign between  keywor?
 =>
    SELECT * FROM apitest.eventmanagement where Block_Date between '2007-09-01' AND '2007-10-01' ;

 
2. How to create tabel for image or blob tabel 
     OR
    How to create columne or define blob data type ?
=>
      Create Database `apitest`;
      DROP TABLE IF EXISTS `apitest`.`testing`;
      CREATE TABLE `apitest`.`testing` (
     `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
     `User_ID` varchar(2000) DEFAULT NULL,
     `Image` longblob NOT NULL,  // We can used like this for image or blob databatype
     PRIMARY KEY (`ID`) USING BTREE
     ) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

3. What is the size of longblob , blob and MEDIUMBLOB?
=>
        BLOB can be 65535 bytes (64 KB) maximum.
        MEDIUMBLOB for 16777215 bytes (16 MB)
        LONGBLOB for 4294967295 bytes (4 GB)