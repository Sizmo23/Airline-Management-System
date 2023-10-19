-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: airline
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Experience` int NOT NULL,
  `address` varchar(45) NOT NULL,
  `reference_number` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `Occupation` varchar(45) NOT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`reference_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (6,'Linton, North Dakota(ND), 58552','1','William M Herr','Male','Insulation Worker',50000),(20,'Sugar Notch, Pennsylvania(PA), 18706','10','Charlene T Peppers','Female','Hostess',80000),(18,'San Antonio, Texas(TX), 78227','11','Helen M Moses\n\n','Female','Hostess',70000),(18,'Omaha, Nebraska(NE), 68114','12','Martha C Shanahan','male','Cook',24331),(19,'Boynton Beach, Florida(FL), 33435','13','Aaron M Bates','male','pilot',600000),(30,'Lawrence, Massachusetts(MA), 01840','14','Eric T Williams','male','Security',50000),(22,' Norcross, Georgia(GA), 30091','15','Ann R Patterson','female','assisstant engineer',600000),(4,'Sugar Land, Texas(TX), 77478','2','Nathaniel D Rivera','Male','Ski Patrol',86430),(9,'Chesapeake, Virginia(VA), 23323','3','Crystal J Carreon','Female','Industrial-Organizational Psychologist',26000),(11,'Indianapolis, Indiana(IN), 46225','4','Priscilla C Behnke','Female','Technical Occupations',0),(3,' Garden City, New York(NY), 11530','7','Robert V Smith','male','Automotive Body and Related Repairer',90000),(14,'Corydon, Indiana(IN), 47112','8','Ann M Mitchell','female','Co pilot',100000),(31,'Topeka, Kansas(KS), 66608','9','Debbie M White','female','Plane Engineer',200000);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-06  2:16:44
