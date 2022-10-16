# springandhibernate

## Setup Docker
```shell
docker run --rm \
--name=mysql-pzn-db \
-e MYSQL_DATABASE=mysqlpzn-db \
-e MYSQL_USER=yukbelajar \
-e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e MYSQL_ROOT_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
-e TZ=Asia/Jakarta \
-p 6603:3306 \
-v "$PWD/mydata/mysql/log":/var/log/mysql \
-v "$PWD/mydata/mysql/data":/var/lib/mysql \
-v "$PWD/mydata/mysql/conf":/etc/mysql/conf.d \
mysql:8
```
## Setup Table
```mysql
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `customer` VALUES
	(1,'Ayam','Petok','ayam@yeahbutstill.com'),
	(2,'Kambing','Jantan','kambing@yeahbutstill.com'),
	(3,'Jerapa','Jojo','jerapa@yeahbutstill.com'),
	(4,'Embe','Beeeee','embe@yeahbutstill.com'),
	(5,'Burung','Kecil','burung@yeahbutstill.com');

```