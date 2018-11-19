-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2018 at 06:01 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlybaixe`
--

-- --------------------------------------------------------

--
-- Table structure for table `baixe`
--

CREATE TABLE `baixe` (
  `id` int(10) NOT NULL,
  `tenbai` varchar(10) NOT NULL,
  `socho` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `baixe`
--

INSERT INTO `baixe` (`id`, `tenbai`, `socho`) VALUES
(1, 'Bai A', 150);

-- --------------------------------------------------------

--
-- Table structure for table `luotgui`
--

CREATE TABLE `luotgui` (
  `id` int(10) NOT NULL,
  `giovao` datetime NOT NULL,
  `loaixe` varchar(20) NOT NULL,
  `bienso` varchar(10) NOT NULL,
  `vexe_id` int(10) NOT NULL,
  `baixe_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `luotgui`
--

INSERT INTO `luotgui` (`id`, `giovao`, `loaixe`, `bienso`, `vexe_id`, `baixe_id`, `user_id`) VALUES
(1, '2018-11-19 08:00:00', 'Wave', '55-K3 1564', 15, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` text NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `numberphone` text NOT NULL,
  `address` varchar(100) NOT NULL,
  `quyen` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `fullname`, `numberphone`, `address`, `quyen`) VALUES
(1, 'vuluat', '123456', 'Vu Quang Luat', '0373718295', 'ha noi', 'admin'),
(2, 'caohieu', '123456', 'Cao Tho Hieu', '0373718299', 'ha noi', 'admin'),
(3, 'sontung', '123456', 'Nguyen Son Tung', '0373718288', 'ha noi', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `vexe`
--

CREATE TABLE `vexe` (
  `id` int(10) NOT NULL,
  `loai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vexe`
--

INSERT INTO `vexe` (`id`, `loai`) VALUES
(1, 'Thang'),
(15, 'Ngay');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `baixe`
--
ALTER TABLE `baixe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `luotgui`
--
ALTER TABLE `luotgui`
  ADD PRIMARY KEY (`id`),
  ADD KEY `vexe_id` (`vexe_id`),
  ADD KEY `baixe_id` (`baixe_id`,`user_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `vexe_id_2` (`vexe_id`,`baixe_id`,`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vexe`
--
ALTER TABLE `vexe`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `luotgui`
--
ALTER TABLE `luotgui`
  ADD CONSTRAINT `luotgui_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `luotgui_ibfk_2` FOREIGN KEY (`vexe_id`) REFERENCES `vexe` (`id`),
  ADD CONSTRAINT `luotgui_ibfk_3` FOREIGN KEY (`baixe_id`) REFERENCES `baixe` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
