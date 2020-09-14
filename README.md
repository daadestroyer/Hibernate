hibernate.cfg.xml
===================
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
	"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
	<session-factory>
		<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:3306/hibernate</property>
		<property name="connection.username">shubham</property>
		<property name="connection.password">shubham</property>
		<property name="dialect">org.hibernate.dialect.MySQLDialect</property>
		<property name="hbm2ddl.auto">update</property> <!-- to create table automatically -->
		<property name="show_sql">true</property> <!-- to show the query fired by hibernate -->
		
	</session-factory>
</hibernate-configuration>
======================