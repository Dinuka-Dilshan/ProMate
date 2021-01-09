-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 09, 2021 at 11:18 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `geelssuper`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Cus_NIC` varchar(15) NOT NULL,
  `CName` varchar(50) NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `No_Po_Box` varchar(5) NOT NULL,
  `Street` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  PRIMARY KEY (`Cus_NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Cus_NIC`, `CName`, `PhoneNumber`, `No_Po_Box`, `Street`, `City`) VALUES
('546561565V', 'Nimal Shantha', 770565455, '45D', 'Nugegoda ', 'Colombo'),
('686456456V', 'Lakisha Silva', 774856655, '87D', 'Pokunuwita', 'Horana'),
('892517745V', 'Nimali Peries', 776254645, '1/23', 'Ruwan Rd', 'Mathale'),
('982514815V', 'Ramesh Senanayake', 769134784, '23/3A', 'Main Rd', 'Galle');

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

DROP TABLE IF EXISTS `discount`;
CREATE TABLE IF NOT EXISTS `discount` (
  `Dis_ID` varchar(10) NOT NULL,
  `Dis_Amount` int(10) NOT NULL,
  `Price_range` varchar(20) NOT NULL,
  PRIMARY KEY (`Dis_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `discount`
--

INSERT INTO `discount` (`Dis_ID`, `Dis_Amount`, `Price_range`) VALUES
('34256789', 5, '15000-20000'),
('58209137', 10, '20000-30000'),
('89674523', 15, '30000-100000');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
  `Pay_ID` varchar(10) NOT NULL,
  `Cus_NIC` varchar(15) NOT NULL,
  `Pay_Date` date NOT NULL,
  `Pay_Time` time NOT NULL,
  `Amount` double NOT NULL,
  `Usr_NIC` varchar(15) NOT NULL,
  `Dis_ID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Pay_ID`),
  KEY `Usr_NIC` (`Usr_NIC`),
  KEY `payment_ibfk_2` (`Cus_NIC`),
  KEY `Dis_ID` (`Dis_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Pay_ID`, `Cus_NIC`, `Pay_Date`, `Pay_Time`, `Amount`, `Usr_NIC`, `Dis_ID`) VALUES
('133', '546561565V', '2020-12-09', '00:00:00', 0, '984120220v', '34256789'),
('154', '686456456V', '2020-12-14', '00:00:00', 0, '984534620v', '58209137'),
('155', '546561565V', '2020-12-14', '00:00:00', 360, '984120220v', NULL),
('156', '546561565V', '2020-12-14', '00:00:00', 360, '984120220v', NULL),
('157', '546561565V', '2020-12-14', '00:00:00', 720, '984120220v', NULL),
('158', '546561565V', '2020-12-14', '00:00:00', 360, '984120220v', NULL),
('159', '546561565V', '2020-12-15', '02:13:50', 200, '984120220v', NULL),
('160', '546561565V', '2020-12-15', '02:13:50', 2200, '984120220v', NULL),
('161', '546561565V', '2020-12-15', '02:13:50', 1300, '984120220v', NULL),
('162', '546561565V', '2020-12-15', '02:13:50', 200, '984120220v', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `payment_details`
--

DROP TABLE IF EXISTS `payment_details`;
CREATE TABLE IF NOT EXISTS `payment_details` (
  `quantity` int(11) NOT NULL,
  `Pay_ID` varchar(10) NOT NULL,
  `Pro_Code` varchar(10) NOT NULL,
  KEY `Pay_ID` (`Pay_ID`),
  KEY `Pro_Code` (`Pro_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_details`
--

INSERT INTO `payment_details` (`quantity`, `Pay_ID`, `Pro_Code`) VALUES
(10, '133', '23156457'),
(5, '154', '54565645'),
(1, '157', '87845545'),
(1, '157', '87845545'),
(1, '158', '87845545'),
(1, '159', '23156457'),
(1, '160', '54565645'),
(1, '160', '54565645'),
(1, '161', '54565645'),
(10, '161', '23156457'),
(1, '162', '23156457');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `Pro_Code` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unit_price` double NOT NULL,
  `type` varchar(25) NOT NULL,
  PRIMARY KEY (`Pro_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Pro_Code`, `name`, `quantity`, `unit_price`, `type`) VALUES
('23156457', 'Highland Milk', 454, 200, 'Beverage'),
('54565645', 'Nipuna Rice 10KG', 150, 1100, 'Food'),
('65564556', 'Munchee Super Cream Cracker 100g', 500, 90, 'Food'),
('87845545', 'Elephant House Ice Cream 1L', 100, 360, 'Food');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `Sup_Id` varchar(10) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `phone_num` int(11) NOT NULL,
  PRIMARY KEY (`Sup_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`Sup_Id`, `Name`, `phone_num`) VALUES
('sp001', 'saman kumara', 716547923),
('sp002', 'nilusha withana', 771239867),
('sp003', 'dilshan kuruppu', 774518871),
('sp004', 'lakshan perera', 713421897);

-- --------------------------------------------------------

--
-- Table structure for table `supply`
--

DROP TABLE IF EXISTS `supply`;
CREATE TABLE IF NOT EXISTS `supply` (
  `S_id` varchar(15) NOT NULL,
  `Date` date NOT NULL,
  `quantity` int(11) NOT NULL,
  `Sup_Id` varchar(10) NOT NULL,
  `Pro_Code` varchar(10) NOT NULL,
  PRIMARY KEY (`S_id`),
  KEY `Pro_Code` (`Pro_Code`),
  KEY `Sup_Id` (`Sup_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supply`
--

INSERT INTO `supply` (`S_id`, `Date`, `quantity`, `Sup_Id`, `Pro_Code`) VALUES
('1020', '2020-11-06', 60, 'sp003', '65564556'),
('1030', '2020-12-01', 100, 'sp001', '23156457'),
('2040', '2020-11-16', 70, 'sp002', '54565645'),
('2313', '2020-11-19', 50, 'sp004', '87845545');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(50) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `Usr_NIC` varchar(15) NOT NULL,
  `phone_num` int(10) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `Type` varchar(10) NOT NULL,
  PRIMARY KEY (`Usr_NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `userName`, `Usr_NIC`, `phone_num`, `Password`, `Type`) VALUES
('Supun Nisala', 'Supun', '981011660v', 772688805, '123', 'Admin'),
('Lasith Eranga', 'Lasith', '981120870v', 773443211, '456', 'Admin'),
('Dinuka Dilshan', 'Dinuka', '984120220v', 773221321, '897', 'User'),
('Shermy hemsman', 'Shermy', '984534620v', 775363324, '453', 'User');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Usr_NIC`) REFERENCES `user` (`Usr_NIC`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`Cus_NIC`) REFERENCES `customer` (`Cus_NIC`),
  ADD CONSTRAINT `payment_ibfk_3` FOREIGN KEY (`Dis_ID`) REFERENCES `discount` (`Dis_ID`);

--
-- Constraints for table `payment_details`
--
ALTER TABLE `payment_details`
  ADD CONSTRAINT `payment_details_ibfk_1` FOREIGN KEY (`Pay_ID`) REFERENCES `payment` (`Pay_ID`),
  ADD CONSTRAINT `payment_details_ibfk_2` FOREIGN KEY (`Pro_Code`) REFERENCES `product` (`Pro_Code`);

--
-- Constraints for table `supply`
--
ALTER TABLE `supply`
  ADD CONSTRAINT `supply_ibfk_1` FOREIGN KEY (`Pro_Code`) REFERENCES `product` (`Pro_Code`),
  ADD CONSTRAINT `supply_ibfk_2` FOREIGN KEY (`Sup_Id`) REFERENCES `supplier` (`Sup_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
