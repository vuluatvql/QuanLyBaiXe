-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2018 at 10:55 AM
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
(1, 'Bai A', 150),
(2, 'Bai B', 100),
(3, 'Bai C', 150);

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
(17, '2018-11-21 22:18:14', 'Xe May', '12345', 7, 3, 1),
(19, '2018-11-21 22:59:49', 'Xe May', '4468456', 23, 3, 1),
(20, '2018-11-21 23:00:00', 'Xe May', '4878', 6, 3, 1),
(21, '2018-11-22 16:32:44', 'O To', '4578', 5, 1, 1),
(22, '2018-11-22 16:32:57', 'Xe Dap', '', 1, 2, 1),
(23, '2018-11-22 16:40:26', 'Xe May', '12458', 2, 1, 2),
(24, '2018-11-22 16:40:41', 'O To', '88569', 3, 2, 2),
(25, '2018-11-22 16:40:54', 'O To', '48789', 4, 2, 2),
(26, '2018-11-22 16:41:24', 'Xe May', '5987', 8, 1, 2),
(27, '2018-11-22 16:41:51', 'Xe May', '55555', 9, 1, 3),
(28, '2018-11-22 16:42:00', 'Xe May', '66666', 10, 2, 3),
(29, '2018-11-22 16:42:11', 'O To', '8888', 11, 2, 3),
(30, '2018-11-22 16:42:27', 'Xe Dap', '7777', 12, 3, 3),
(31, '2018-11-22 16:42:44', 'Xe May', '9999', 13, 3, 3),
(32, '2018-11-22 16:43:00', 'Xe May', '88888', 14, 2, 3),
(33, '2018-11-22 16:43:13', 'Xe Dap', '', 20, 2, 3),
(34, '2018-11-22 16:43:24', 'Xe Dap', '', 24, 1, 3),
(35, '2018-11-22 16:43:35', 'Xe Dap', '', 22, 2, 3),
(36, '2018-11-22 16:44:06', 'Xe May', '77778', 15, 2, 3),
(37, '2018-11-22 16:44:22', 'Xe May', '1948', 19, 2, 3),
(38, '2018-11-22 16:44:39', 'Xe May', '6698', 18, 3, 3),
(39, '2018-11-22 16:44:51', 'Xe May', '8954', 17, 3, 3),
(40, '2018-11-22 16:45:20', 'Xe May', '7845', 36, 3, 3);

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
(0, 'Ngay'),
(1, 'Ngay'),
(2, 'Ngay'),
(3, 'Ngay'),
(4, 'Ngay'),
(5, 'Ngay'),
(6, 'Ngay'),
(7, 'Ngay'),
(8, 'Ngay'),
(9, 'Ngay'),
(10, 'Ngay'),
(11, 'Ngay'),
(12, 'Ngay'),
(13, 'Ngay'),
(14, 'Ngay'),
(15, 'Ngay'),
(16, 'Ngay'),
(17, 'Ngay'),
(18, 'Ngay'),
(19, 'Ngay'),
(20, 'Ngay'),
(21, 'Ngay'),
(22, 'Ngay'),
(23, 'Ngay'),
(24, 'Ngay'),
(25, 'Ngay'),
(26, 'Ngay'),
(27, 'Ngay'),
(28, 'Ngay'),
(29, 'Ngay'),
(30, 'Ngay'),
(31, 'Ngay'),
(32, 'Ngay'),
(33, 'Ngay'),
(34, 'Ngay'),
(35, 'Ngay'),
(36, 'Ngay'),
(37, 'Ngay'),
(38, 'Ngay'),
(39, 'Ngay'),
(40, 'Ngay'),
(41, 'Ngay'),
(42, 'Ngay'),
(43, 'Ngay'),
(44, 'Ngay'),
(45, 'Ngay'),
(46, 'Ngay'),
(47, 'Ngay'),
(48, 'Ngay'),
(49, 'Ngay'),
(50, 'Ngay'),
(51, 'Ngay'),
(200, 'Thang'),
(201, 'Thang'),
(202, 'Thang'),
(203, 'Thang'),
(204, 'Thang'),
(205, 'Thang'),
(206, 'Thang'),
(207, 'Thang'),
(208, 'Thang'),
(209, 'Thang'),
(210, 'Thang'),
(211, 'Thang'),
(212, 'Thang'),
(213, 'Thang'),
(214, 'Thang'),
(215, 'Thang'),
(216, 'Thang'),
(217, 'Thang'),
(218, 'Thang'),
(219, 'Thang'),
(220, 'Thang');

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
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `luotgui`
--
ALTER TABLE `luotgui`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

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
