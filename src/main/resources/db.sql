create database graphql;

USE `graphql`;

CREATE TABLE `book` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `pageCount` int(11) NOT NULL,
  `authorId` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `author` (
  `id` varchar(50) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `graphql`.`author` (`id`, `firstName`, `lastName`) VALUES ('author-1', 'Joanne', 'Rowling');
INSERT INTO `graphql`.`author` (`id`, `firstName`, `lastName`) VALUES ('author-2', 'Herman', 'Melville');
INSERT INTO `graphql`.`author` (`id`, `firstName`, `lastName`) VALUES ('author-3', 'Anne', 'Rice');

INSERT INTO `graphql`.`book` (`id`, `name`, `pageCount`, `authorId`) VALUES ('book-1', 'Harry Potter and the Philosopher\'s Stone', '223', 'author-1');
INSERT INTO `graphql`.`book` (`id`, `name`, `pageCount`, `authorId`) VALUES ('book-2', 'Moby Dick', '635', 'author-2');
INSERT INTO `graphql`.`book` (`id`, `name`, `pageCount`, `authorId`) VALUES ('book-3', 'Interview with the vampire', '371', 'author-3');


CREATE TABLE `comment` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `text` varchar(100) NOT NULL,
  `createdAt` datetime,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

