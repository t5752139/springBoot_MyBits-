/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2020-06-08 15:18:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(11) DEFAULT '0' COMMENT '父id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `url` varchar(50) DEFAULT NULL COMMENT 'lujing',
  `typer_code` varchar(10) DEFAULT NULL COMMENT '菜单m,按钮b',
  `menu_code` varchar(20) DEFAULT NULL COMMENT '类型,部门dept,菜单menu',
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('2', '0', '个人工作', '1', 'ody', '1', '1');
INSERT INTO `menu` VALUES ('3', '2', '个人工作总览', '1', 'ody', '1', '1');
INSERT INTO `menu` VALUES ('4', '2', '个人财务明细', '1', 'sys', '1', '1');
INSERT INTO `menu` VALUES ('5', '0', '企业管理', null, 'sys', null, '1');
INSERT INTO `menu` VALUES ('6', '5', '总经理', null, 'ass', null, '1');
INSERT INTO `menu` VALUES ('7', '6', '部门设置', null, null, null, '1');
INSERT INTO `menu` VALUES ('8', '6', '岗位设置', null, null, null, '1');
INSERT INTO `menu` VALUES ('9', '6', '行政管理', null, 'pet', null, '1');
INSERT INTO `menu` VALUES ('10', '5', '市场部', null, 'ass', null, '1');
INSERT INTO `menu` VALUES ('11', '10', '营销一部', null, 'ass', null, '1');
INSERT INTO `menu` VALUES ('12', '11', '菜单项1', null, null, null, '1');
INSERT INTO `menu` VALUES ('13', '11', '菜单项2', null, null, null, '1');
INSERT INTO `menu` VALUES ('14', '10', '营销二部', null, 'ass', null, '1');
INSERT INTO `menu` VALUES ('15', '14', ' 菜单项3', null, null, null, '1');
INSERT INTO `menu` VALUES ('16', '14', ' 菜单项4', null, null, null, '1');
INSERT INTO `menu` VALUES ('17', '10', '营销管理', null, null, null, '1');
INSERT INTO `menu` VALUES ('18', '10', '产品管理', null, null, null, '1');
INSERT INTO `menu` VALUES ('19', '18', 'string', 'string', 'string', 'string', '0');
INSERT INTO `menu` VALUES ('20', '18', '鞋帽产品管理 ', null, null, null, '1');
INSERT INTO `menu` VALUES ('21', '10', '财务管理', null, 'pet', null, '1');
INSERT INTO `menu` VALUES ('22', '10', '行政管理', null, 'pet', null, '1');
INSERT INTO `menu` VALUES ('23', '5', '财务部', null, '', null, '1');
INSERT INTO `menu` VALUES ('24', '23', '财务管理', null, 'pet', null, '1');
INSERT INTO `menu` VALUES ('25', '23', '职员管理', null, null, null, '1');
INSERT INTO `menu` VALUES ('26', '23', '行政管理', null, 'pet', null, '1');
INSERT INTO `menu` VALUES ('30', '19', 'string', 'string', 'string', 'string', '1');

-- ----------------------------
-- Table structure for menu_function
-- ----------------------------
DROP TABLE IF EXISTS `menu_function`;
CREATE TABLE `menu_function` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单功能主键',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单ID',
  `name` varchar(64) DEFAULT NULL COMMENT '功能名称',
  `code` varchar(64) DEFAULT NULL COMMENT '编码',
  `type` varchar(8) DEFAULT NULL COMMENT '类型',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_function
-- ----------------------------
INSERT INTO `menu_function` VALUES ('1', '2', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('2', '2', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('3', '2', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('4', '2', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('5', '3', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('6', '3', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('7', '3', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('8', '3', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('9', '4', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('10', '4', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('11', '4', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('12', '4', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('13', '5', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('14', '5', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('15', '5', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('16', '5', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('17', '6', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('18', '6', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('19', '6', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('20', '6', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('21', '7', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('22', '7', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('23', '7', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('24', '7', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('25', '8', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('26', '8', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('27', '8', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('28', '8', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('29', '9', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('30', '9', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('31', '9', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('32', '9', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('33', '10', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('34', '10', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('35', '10', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('36', '10', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('37', '11', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('38', '11', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('39', '11', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('40', '11', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('41', '12', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('42', '12', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('43', '12', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('44', '12', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('45', '13', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('46', '13', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('47', '13', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('48', '13', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('49', '14', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('50', '14', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('51', '14', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('52', '14', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('53', '15', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('54', '15', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('55', '15', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('56', '15', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('57', '16', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('58', '16', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('59', '16', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('60', '16', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('61', '17', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('62', '17', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('63', '17', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('64', '17', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('65', '18', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('66', '18', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('67', '18', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('68', '18', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('69', '19', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('70', '19', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('71', '19', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('72', '19', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('73', '20', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('74', '20', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('75', '20', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('76', '20', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('77', '21', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('78', '21', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('79', '21', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('80', '21', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('81', '22', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('82', '22', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('83', '22', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('84', '22', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('85', '23', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('86', '23', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('87', '23', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('88', '23', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('89', '24', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('90', '24', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('91', '24', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('92', '24', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('93', '25', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('94', '25', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('95', '25', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('96', '25', 'updata', null, null, null);
INSERT INTO `menu_function` VALUES ('97', '26', 'edit', null, null, null);
INSERT INTO `menu_function` VALUES ('98', '26', 'list', null, null, null);
INSERT INTO `menu_function` VALUES ('99', '26', 'delete', null, null, null);
INSERT INTO `menu_function` VALUES ('100', '26', 'updata', null, null, null);

-- ----------------------------
-- Table structure for menu_role
-- ----------------------------
DROP TABLE IF EXISTS `menu_role`;
CREATE TABLE `menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=394 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_role
-- ----------------------------
INSERT INTO `menu_role` VALUES ('70', '3', '9');
INSERT INTO `menu_role` VALUES ('71', '4', '9');
INSERT INTO `menu_role` VALUES ('72', '2', '9');
INSERT INTO `menu_role` VALUES ('73', '7', '9');
INSERT INTO `menu_role` VALUES ('74', '8', '9');
INSERT INTO `menu_role` VALUES ('75', '9', '9');
INSERT INTO `menu_role` VALUES ('76', '6', '9');
INSERT INTO `menu_role` VALUES ('77', '12', '9');
INSERT INTO `menu_role` VALUES ('78', '13', '9');
INSERT INTO `menu_role` VALUES ('79', '11', '9');
INSERT INTO `menu_role` VALUES ('80', '15', '9');
INSERT INTO `menu_role` VALUES ('81', '16', '9');
INSERT INTO `menu_role` VALUES ('82', '14', '9');
INSERT INTO `menu_role` VALUES ('83', '17', '9');
INSERT INTO `menu_role` VALUES ('84', '19', '9');
INSERT INTO `menu_role` VALUES ('85', '20', '9');
INSERT INTO `menu_role` VALUES ('86', '18', '9');
INSERT INTO `menu_role` VALUES ('87', '21', '9');
INSERT INTO `menu_role` VALUES ('88', '22', '9');
INSERT INTO `menu_role` VALUES ('89', '10', '9');
INSERT INTO `menu_role` VALUES ('90', '24', '9');
INSERT INTO `menu_role` VALUES ('91', '25', '9');
INSERT INTO `menu_role` VALUES ('92', '26', '9');
INSERT INTO `menu_role` VALUES ('93', '23', '9');
INSERT INTO `menu_role` VALUES ('94', '5', '9');
INSERT INTO `menu_role` VALUES ('380', '11', '2');
INSERT INTO `menu_role` VALUES ('382', '5', '2');
INSERT INTO `menu_role` VALUES ('383', '12', '2');
INSERT INTO `menu_role` VALUES ('384', '13', '2');
INSERT INTO `menu_role` VALUES ('385', '2', '2');
INSERT INTO `menu_role` VALUES ('386', '3', '2');
INSERT INTO `menu_role` VALUES ('387', '6', '2');
INSERT INTO `menu_role` VALUES ('389', '11', '2');
INSERT INTO `menu_role` VALUES ('390', '14', '2');
INSERT INTO `menu_role` VALUES ('391', '10', '2');
INSERT INTO `menu_role` VALUES ('392', '30', '9');
INSERT INTO `menu_role` VALUES ('393', '30', '9');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `role_code` varchar(20) DEFAULT NULL COMMENT '角色编码',
  `system_name` varchar(50) DEFAULT NULL COMMENT '平台名称',
  `company_id` int(11) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '角色1', 'ass', '1', '1');
INSERT INTO `role` VALUES ('2', '角色2', 'ass', null, '1');
INSERT INTO `role` VALUES ('3', '角色3', 'oss', null, '1');
INSERT INTO `role` VALUES ('4', '角色4', 'sys', null, '1');
INSERT INTO `role` VALUES ('9', '最高权限人', 'sys', '最高权限人', '1');

-- ----------------------------
-- Table structure for role_function
-- ----------------------------
DROP TABLE IF EXISTS `role_function`;
CREATE TABLE `role_function` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `function_id` int(11) DEFAULT NULL COMMENT '功能id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_function
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(50) DEFAULT NULL COMMENT '姓名',
  `name` varchar(20) DEFAULT NULL COMMENT '账号',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', null, null);
INSERT INTO `user` VALUES ('2', '李四', null, null);
INSERT INTO `user` VALUES ('3', 'tom', null, null);
INSERT INTO `user` VALUES ('4', 'Lucy', null, null);
INSERT INTO `user` VALUES ('5', 'admin', 'admin', null);

-- ----------------------------
-- Table structure for user_menu
-- ----------------------------
DROP TABLE IF EXISTS `user_menu`;
CREATE TABLE `user_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_menu
-- ----------------------------

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('4', '1', '9');
INSERT INTO `user_role` VALUES ('5', '1', '9');
INSERT INTO `user_role` VALUES ('7', '3', '2');
