-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2022 at 04:35 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myshoesstoreoop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(11) NOT NULL COMMENT 'id unik dari setiap akun admin',
  `name` varchar(50) NOT NULL COMMENT 'nama admin',
  `pass` varchar(20) NOT NULL COMMENT 'password akun admin',
  `gender` varchar(10) NOT NULL COMMENT 'jenis kelamin admin'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `name`, `pass`, `gender`) VALUES
('001', 'admin', 'admin', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id_category` varchar(11) NOT NULL COMMENT 'id unik setiap category',
  `name` varchar(50) NOT NULL COMMENT 'nama kategori',
  `description` varchar(500) NOT NULL COMMENT 'deskripsi kategori'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id_category`, `name`, `description`) VALUES
('011', 'Sneakers', 'bla bla');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id_bill` int(11) NOT NULL COMMENT 'id unik setiap riwayat pembelian',
  `customer_name` varchar(50) NOT NULL COMMENT 'nama customer yang melakukan transaksi',
  `date` varchar(50) DEFAULT NULL COMMENT 'date/ tanggal dilakukannya transaksi',
  `total` varchar(20) NOT NULL COMMENT 'total jumlah pembelian'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id_bill`, `customer_name`, `date`, `total`) VALUES
(1, 'Mx', '07-05-2022', '$15.0');

-- --------------------------------------------------------

--
-- Table structure for table `seller`
--

CREATE TABLE `seller` (
  `id_seller` varchar(11) NOT NULL COMMENT 'id unik setiap akun seller',
  `name` varchar(50) NOT NULL COMMENT 'nama seller',
  `pass` varchar(20) NOT NULL COMMENT 'password akun seller',
  `gender` varchar(10) NOT NULL COMMENT 'jenis kelamin seller'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller`
--

INSERT INTO `seller` (`id_seller`, `name`, `pass`, `gender`) VALUES
('001', 'fahmi', 'cuk', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `shoes`
--

CREATE TABLE `shoes` (
  `id_shoes` varchar(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `category` varchar(20) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shoes`
--

INSERT INTO `shoes` (`id_shoes`, `name`, `category`, `type`, `quantity`, `price`) VALUES
('001', 'bust', 'Sneakers', 'Low', 69, 5),
('002', 'buster', 'Sneakers', 'High', 1, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id_category`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id_bill`);

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`id_seller`);

--
-- Indexes for table `shoes`
--
ALTER TABLE `shoes`
  ADD PRIMARY KEY (`id_shoes`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id_bill` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id unik setiap riwayat pembelian', AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
