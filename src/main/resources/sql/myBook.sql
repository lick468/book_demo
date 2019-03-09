/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.56 : Database - mybook
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybook` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybook`;

/*Table structure for table `tb_book` */

DROP TABLE IF EXISTS `tb_book`;

CREATE TABLE `tb_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '书ID',
  `b_name` varchar(32) NOT NULL COMMENT '书名(唯一)',
  `b_author` varchar(32) NOT NULL COMMENT '作者',
  `b_info` varchar(255) NOT NULL COMMENT '简介',
  `b_image` varchar(255) NOT NULL COMMENT '封皮',
  `b_wordcount` int(11) DEFAULT '0' COMMENT '总字数',
  `b_click` int(11) DEFAULT '0' COMMENT '点击数',
  `b_recommend` int(11) DEFAULT '0' COMMENT '推荐数',
  `b_downlaod` varchar(64) DEFAULT NULL COMMENT '下载链接',
  `b_state` int(11) NOT NULL COMMENT '状态 0:审核中 1:连载  2:完本  3:删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `b_name` (`b_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_book` */

/*Table structure for table `tb_book_catalogue` */

DROP TABLE IF EXISTS `tb_book_catalogue`;

CREATE TABLE `tb_book_catalogue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '书分类汇总ID',
  `bc_book_id` int(11) DEFAULT NULL COMMENT '书编号',
  `bc_c_id` int(11) DEFAULT NULL COMMENT '类别编号',
  PRIMARY KEY (`id`),
  KEY `bc_book_id` (`bc_book_id`),
  KEY `bc_c_id` (`bc_c_id`),
  CONSTRAINT `tb_book_catalogue_ibfk_1` FOREIGN KEY (`bc_book_id`) REFERENCES `tb_book` (`id`),
  CONSTRAINT `tb_book_catalogue_ibfk_2` FOREIGN KEY (`bc_c_id`) REFERENCES `tb_catalogue` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_book_catalogue` */

/*Table structure for table `tb_book_comment` */

DROP TABLE IF EXISTS `tb_book_comment`;

CREATE TABLE `tb_book_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `bc_user_id` int(11) NOT NULL COMMENT '用户ID',
  `bc_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `bc_date` date NOT NULL COMMENT '评论时间',
  `bc_parentID` int(11) DEFAULT NULL COMMENT '上级评论',
  `bc_agree` int(11) DEFAULT '0' COMMENT '赞同数',
  PRIMARY KEY (`id`),
  KEY `bc_parentID` (`bc_parentID`),
  KEY `bc_user_id` (`bc_user_id`),
  CONSTRAINT `tb_book_comment_ibfk_1` FOREIGN KEY (`bc_parentID`) REFERENCES `tb_book_comment` (`id`),
  CONSTRAINT `tb_book_comment_ibfk_2` FOREIGN KEY (`bc_user_id`) REFERENCES `tb_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_book_comment` */

/*Table structure for table `tb_book_directory` */

DROP TABLE IF EXISTS `tb_book_directory`;

CREATE TABLE `tb_book_directory` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '目录',
  `bd_book_id` int(11) NOT NULL COMMENT '书ID',
  `b_num` varchar(64) NOT NULL COMMENT '章节名',
  `b_content` longtext NOT NULL COMMENT '章节内容',
  `b_date` date NOT NULL COMMENT '章节发布时间',
  `b_wordcount` int(11) NOT NULL COMMENT '字数',
  PRIMARY KEY (`id`),
  KEY `bd_book_id` (`bd_book_id`),
  CONSTRAINT `tb_book_directory_ibfk_1` FOREIGN KEY (`bd_book_id`) REFERENCES `tb_book` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_book_directory` */

/*Table structure for table `tb_catalogue` */

DROP TABLE IF EXISTS `tb_catalogue`;

CREATE TABLE `tb_catalogue` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '书分类ID',
  `c_name` varchar(32) DEFAULT NULL COMMENT '书分类类型名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_catalogue` */

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `r_name` varchar(32) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_role` */

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `u_name` varchar(32) NOT NULL COMMENT '用户名',
  `u_password` varchar(255) NOT NULL COMMENT '用户密码',
  `u_phone` varchar(13) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

/*Table structure for table `tb_user_role` */

DROP TABLE IF EXISTS `tb_user_role`;

CREATE TABLE `tb_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `tb_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`),
  CONSTRAINT `tb_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `tb_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tb_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
