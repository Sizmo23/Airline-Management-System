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
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservation` (
  `pnr_no` varchar(30) NOT NULL,
  `ticket_id` varchar(30) NOT NULL,
  `f_code` varchar(30) NOT NULL,
  `jny_date` varchar(30) NOT NULL,
  `jny_time` varchar(30) NOT NULL,
  `src` varchar(30) NOT NULL,
  `dst` varchar(30) NOT NULL,
  PRIMARY KEY (`pnr_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation`
--

LOCK TABLES `reservation` WRITE;
/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
INSERT INTO `reservation` VALUES ('100','400','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('101','401','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('102','402','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('103','403','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('104','404','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('105','405','f1011','2018-07-02','3:00 PM','Russia','Pakistan'),('11','111','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('12','112','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('120','500','f1010','2020-08-11','1:00 PM','Pakistan','China'),('121','501','f1010','2020-08-11','1:00 PM','Pakistan','China'),('122','502','f1010','2020-08-11','1:00 PM','Pakistan','China'),('123','503','f1010','2020-08-11','1:00 PM','Pakistan','China'),('124','504','f1010','2020-08-11','1:00 PM','Pakistan','China'),('125','505','f1010','2020-08-11','1:00 PM','Pakistan','China'),('13','113','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('14','114','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('15','115','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('16','116','f1005','2022-12-05','1:00 PM','Pakistan','United States'),('50','300','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('51','301','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('52','302','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('53','303','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('54','304','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('55','305','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('56','306','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('57','307','f1006','2023-01-12','5:00 AM','Pakistan','Germany'),('70','250','f1007','2018-05-08','4:00 AM','America','Niger'),('71','251','f1007','2018-05-08','4:00 AM','America','Niger'),('72','252','f1007','2018-05-08','4:00 AM','America','Niger'),('73','253','f1007','2018-05-08','4:00 AM','America','Niger'),('74','254','f1008','2019-08-11','5:00 PM','Chad','Pakistan'),('75','255','f1008','2019-08-11','5:00 PM','Chad','Pakistan'),('77','256','f1008','2019-08-11','5:00 PM','Chad','Pakistan'),('78','257','f1008','2019-08-11','5:00 PM','Chad','Pakistan'),('79','258','f1008','2019-08-11','5:00 PM','Chad','Pakistan'),('80','259','f1008','2019-08-11','5:00 PM','Chad','Pakistan');
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-06  2:16:45
