create table if not exists UserConnection (userId varchar(255) not null,
    providerId varchar(255) not null,
    providerUserId varchar(255),
    rank int not null,
    displayName varchar(255),
    profileUrl varchar(512),
    imageUrl varchar(512),
    accessToken varchar(255) not null,
    secret varchar(255),
    refreshToken varchar(255),
    expireTime bigint,
    primary key (userId, providerId, providerUserId));

create unique index if not exists UserConnectionRank on UserConnection(userId, providerId, rank);

CREATE TABLE if not exists user_accounts (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  creation_time datetime NOT NULL,
  email varchar(100) NOT NULL,
  first_name varchar(100) NOT NULL,
  last_name varchar(100),
  modification_time datetime NOT NULL,
  password varchar(255),
  role varchar(20) NOT NULL,
  sign_in_provider varchar(20),
  version bigint(20) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (email)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS profile (
  id INT AUTO_INCREMENT,
  name VARCHAR(150) NOT NULL,
  birthday DATE NOT NULL,
  profession VARCHAR(150) NOT NULL,
  Job VARCHAR(150) NOT NULL,
  gender TINYINT NOT NULL,
  gender_of_interest tinyint,
  PRIMARY KEY (id));