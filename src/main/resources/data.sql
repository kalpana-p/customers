CREATE TABLE customer (
  party_id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(25) NOT NULL,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  middleName VARCHAR(250) NOT NULL,
  phone INT,
  dob DATE
);

CREATE TABLE address (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  party_id INT,
  line1 VARCHAR(250) NOT NULL,
  line2 VARCHAR(250),
  line3 VARCHAR(250),
  line4 VARCHAR(250),
  postcode VARCHAR(250) NOT NULL,
  isPreferredCommunication BOOLEAN,
  addressType VARCHAR(25),
  foreign key (party_id) references customer(party_id)
);

CREATE TABLE email (
  id VARCHAR(250) PRIMARY KEY,
  party_id INT,
  postcode VARCHAR(250) NOT NULL,
  isRegd BOOLEAN,
  foreign key (party_id) references customer(party_id)
);