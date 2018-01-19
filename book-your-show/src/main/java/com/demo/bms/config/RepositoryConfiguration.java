package com.demo.bms.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;
import org.springframework.transaction.jta.JtaTransactionManager;

@Configuration
@EnableJpaRepositories
public class RepositoryConfiguration extends JpaBaseConfiguration {

	final static Logger LOGGER = LoggerFactory.getLogger(RepositoryConfiguration.class);

	protected RepositoryConfiguration(DataSource dataSource, JpaProperties properties,
			ObjectProvider<JtaTransactionManager> jtaTransactionManagerProvider) {
		super(dataSource, properties, jtaTransactionManagerProvider);
	}

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
		AbstractJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
		adapter.setShowSql(true);
		return adapter;
	}

	@Override
	protected Map<String, Object> getVendorProperties() {
		HashMap<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("eclipselink.weaving", "false");
		hMap.put("eclipselink.logging.level", "FINE");
		hMap.put("eclipselink.logging.level.sql", "FINE");
		hMap.put("eclipselink.logging.parameters", "true");
		hMap.put("eclipselink.cache.shared.default", "false");
		hMap.put("persistence-unit", "bookmyshowpersistence");
		hMap.put("javax.persistence.schema-generation.database.action", "drop-and-create");
		hMap.put("javax.persistence.schema-generation.create-source", "metadata");
		hMap.put("javax.persistence.schema-generation.drop-source", "metadata");
		return hMap;
	}
	

}

