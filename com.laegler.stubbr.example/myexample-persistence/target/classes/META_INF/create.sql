# Generated with Stubbr
# SQL create-script
# {{{Version: 0.0.1-SNAPSHOT}}}
# {{{Date: 16.11.2016 - 15:09:38}}}
CREATE USER 'MyExample'@'%' IDENTIFIED BY '***';

GRANT USAGE ON * . * TO 'MyExample'@'%' IDENTIFIED BY '***' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;

CREATE DATABASE IF NOT EXISTS `MyExample` ;

GRANT ALL PRIVILEGES ON `MyExample` . * TO 'citysquire'@'%';

GRANT ALL PRIVILEGES ON `MyExample\_%` . * TO 'citysquire'@'%';

CREATE TABLE IF NOT EXISTS user (
	gaga varchar(255) not null,
	ref  not null,
	primary key (activity_id)
) ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS bar (
	Account varchar(255) not null,
	primary key (activity_id)
) ENGINE=InnoDB;

