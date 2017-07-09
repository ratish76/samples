CREATE TABLE customer (id TimeUUID PRIMARY KEY, firstname text, lastname text);
CREATE INDEX customerfistnameindex ON customer (firstname);
CREATE INDEX customersecondnameindex ON customer (lastname);


CREATE TABLE customer (id TimeUUID,creatioMonth text, firstname text, lastname text,
PRIMARY KEY (id, creatioMonth));
