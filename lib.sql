/*
Navicat MySQL Data Transfer

Source Server         : work
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : lib

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-06-07 15:12:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `bname` varchar(100) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  `isbn` varchar(50) NOT NULL,
  `suit_age` varchar(5) DEFAULT NULL,
  `suit_sex` varchar(5) DEFAULT NULL,
  `suit_hobby` varchar(255) DEFAULT NULL,
  `cover` varchar(100) DEFAULT NULL,
  `put_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `isOut` varchar(5) DEFAULT 'N',
  `disc` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bookcombo
-- ----------------------------
DROP TABLE IF EXISTS `bookcombo`;
CREATE TABLE `bookcombo` (
  `bcid` int(11) NOT NULL AUTO_INCREMENT,
  `bid` int(11) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL COMMENT '处理人',
  `handle_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for brroworder
-- ----------------------------
DROP TABLE IF EXISTS `brroworder`;
CREATE TABLE `brroworder` (
  `brid` int(11) NOT NULL AUTO_INCREMENT,
  `brOrderId` varchar(50) NOT NULL,
  `deposit` double(255,0) DEFAULT NULL,
  `out_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `return_time` timestamp NULL DEFAULT NULL,
  `isBuy` varchar(5) DEFAULT 'N',
  `isReturn` varchar(5) DEFAULT 'N',
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`brid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for buyorder
-- ----------------------------
DROP TABLE IF EXISTS `buyorder`;
CREATE TABLE `buyorder` (
  `boid` int(11) NOT NULL AUTO_INCREMENT,
  `buyorderid` varchar(50) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `bid` int(11) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`boid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for combo
-- ----------------------------
DROP TABLE IF EXISTS `combo`;
CREATE TABLE `combo` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `combo_name` varchar(50) NOT NULL,
  `combo_desc` varchar(255) DEFAULT NULL,
  `combo_price` double DEFAULT NULL,
  `combo_content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS `info`;
CREATE TABLE `info` (
  `iid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `info_name` varchar(50) DEFAULT NULL,
  `info_sex` varchar(5) DEFAULT NULL,
  `info_hobby` varchar(50) DEFAULT NULL,
  `info_age` int(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `cid` int(11) DEFAULT '0',
  `libm` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
