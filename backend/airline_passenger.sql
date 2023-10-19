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
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `pnr_no` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `ph_no` varchar(30) NOT NULL,
  `passport_no` varchar(30) NOT NULL,
  `fl_code` varchar(30) NOT NULL,
  PRIMARY KEY (`pnr_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES ('1',' Atlanta, Georgia(GA), 30303','Hispanic','Harry G Burgess','Male','404-251-2333','11111111','f1005'),('2',' Fort Myers, Florida(FL), 33901','Hispanic','Sandra J Freese','Female','863-227-6940','11111112','f1005'),('3','Lafayette, Indiana(IN), 47906','American','Russell O Cormack','Male','765-414-6437','11111113','f1005'),('4','Cambridge, Massachusetts(MA), 02141','American','Susan L Smith','female','781-519-4558','11111114','f1005'),('5','Jackson, Mississippi(MS), 39211','indian','Chris K Williams','male','662-644-4749','1111115','f1006'),('6','Jackson, Mississippi(MS), 39211','Spanish','Tyrone B Bruce','male',' 662-830-993','11111116','f1006'),('7','Boston, Massachusetts(MA), 02110','Egyptian','Stephen M Seaman','male','508-215-2090','11111169','f1006'),('8','Oakland, California(CA), 94612','Pakistani','Robert T Williams','male',' 707-760-1157','111111153','f1007'),('9','Los Angeles, California(CA), 90017','Danish','Eileen C Gipson','male','213-918-1515','11111143','f1008');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
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
