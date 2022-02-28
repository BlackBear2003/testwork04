/*
 Navicat Premium Data Transfer

 Source Server         : web
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : novelweb

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 28/02/2022 21:07:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `click_time` int(11) NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (1, 'test1', '1', '1', '1', 4);
INSERT INTO `t_book` VALUES (2, 'test2', '2', '2', '2', 3);
INSERT INTO `t_book` VALUES (3, 'test3', '3', '3', '3', 2);
INSERT INTO `t_book` VALUES (4, 'wzlbook', '1', '1', '1', 1);
INSERT INTO `t_book` VALUES (5, 'aaa', 'wzl', '1', '1', 1);

-- ----------------------------
-- Table structure for t_book_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_book_resource`;
CREATE TABLE `t_book_resource`  (
  `book_id` int(11) NOT NULL,
  `filename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_book_statu
-- ----------------------------
DROP TABLE IF EXISTS `t_book_statu`;
CREATE TABLE `t_book_statu`  (
  `book_id` int(11) NOT NULL,
  `statu_id` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book_statu
-- ----------------------------
INSERT INTO `t_book_statu` VALUES (1, 2);
INSERT INTO `t_book_statu` VALUES (2, 1);
INSERT INTO `t_book_statu` VALUES (3, 2);
INSERT INTO `t_book_statu` VALUES (4, 2);

-- ----------------------------
-- Table structure for t_book_type
-- ----------------------------
DROP TABLE IF EXISTS `t_book_type`;
CREATE TABLE `t_book_type`  (
  `book_id` int(11) NOT NULL,
  `type_id` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book_type
-- ----------------------------
INSERT INTO `t_book_type` VALUES (1, 1);
INSERT INTO `t_book_type` VALUES (2, 1);
INSERT INTO `t_book_type` VALUES (3, 1);
INSERT INTO `t_book_type` VALUES (4, 1);

-- ----------------------------
-- Table structure for t_history
-- ----------------------------
DROP TABLE IF EXISTS `t_history`;
CREATE TABLE `t_history`  (
  `uid` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_history
-- ----------------------------
INSERT INTO `t_history` VALUES (1, 1);
INSERT INTO `t_history` VALUES (1, 2);
INSERT INTO `t_history` VALUES (1, 3);

-- ----------------------------
-- Table structure for t_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission`  (
  `pid` int(11) NOT NULL,
  `description` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `permission` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES (1, '新建对象', 'create');
INSERT INTO `t_permission` VALUES (2, '查询对象', 'request');
INSERT INTO `t_permission` VALUES (3, '更新对象', 'update');
INSERT INTO `t_permission` VALUES (4, '删除对象', 'delete');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `role_id` int(11) NOT NULL,
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, 'admin');
INSERT INTO `t_role` VALUES (2, 'user');

-- ----------------------------
-- Table structure for t_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_role_permission`;
CREATE TABLE `t_role_permission`  (
  `role_id` int(11) NOT NULL,
  `pid` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_permission
-- ----------------------------
INSERT INTO `t_role_permission` VALUES (1, 1);
INSERT INTO `t_role_permission` VALUES (1, 2);
INSERT INTO `t_role_permission` VALUES (1, 3);
INSERT INTO `t_role_permission` VALUES (1, 4);
INSERT INTO `t_role_permission` VALUES (2, 1);
INSERT INTO `t_role_permission` VALUES (2, 2);

-- ----------------------------
-- Table structure for t_shelf
-- ----------------------------
DROP TABLE IF EXISTS `t_shelf`;
CREATE TABLE `t_shelf`  (
  `uid` int(11) NOT NULL,
  `book_id` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_shelf
-- ----------------------------
INSERT INTO `t_shelf` VALUES (1, 1);
INSERT INTO `t_shelf` VALUES (1, 3);

-- ----------------------------
-- Table structure for t_statu
-- ----------------------------
DROP TABLE IF EXISTS `t_statu`;
CREATE TABLE `t_statu`  (
  `type_id` int(11) NOT NULL,
  `statuname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_statu
-- ----------------------------
INSERT INTO `t_statu` VALUES (1, 'banned');
INSERT INTO `t_statu` VALUES (2, 'passed');

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type`  (
  `type_id` int(11) NOT NULL,
  `typename` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES (1, 'test1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'wzl', '123456');
INSERT INTO `t_user` VALUES (2, 'hkf', '123456');
INSERT INTO `t_user` VALUES (3, 'wzl', '123456');
INSERT INTO `t_user` VALUES (4, 'wcj', '123456');
INSERT INTO `t_user` VALUES (5, 'wuyy', 'cy');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `role_id` int(11) NOT NULL,
  `uid` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 1);
INSERT INTO `t_user_role` VALUES (1, 2);

SET FOREIGN_KEY_CHECKS = 1;
