package com.dct.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

	

		@Bean
		public DataSource dataSource() {
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
			dataSource.setUrl("jdbc:jtds:sqlserver://172.30.30.17:1433/PRODUCERONE_SECURE_SAPRODUCT;instance=PRODUCT");
			dataSource.setUsername("dev");
			dataSource.setPassword("@dm!n124586");
			return dataSource;
		}
	 
		@Bean
		public LocalSessionFactoryBean sessionFactory() {
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource());
			sessionFactory.setPackagesToScan("com");
			Properties hibernateProperties = new Properties();
			hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
			hibernateProperties.put("hibernate.show_sql", "true");
			hibernateProperties.put("hibernate.hbm2ddl.auto", "none");
			sessionFactory.setHibernateProperties(hibernateProperties);
	 
			return sessionFactory;
		}
	 
		@Bean
		public HibernateTransactionManager transactionManager() {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(sessionFactory().getObject());
			return transactionManager;
		}	
		
}
