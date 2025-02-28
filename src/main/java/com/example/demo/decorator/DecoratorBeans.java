package com.example.demo.decorator;

import com.example.demo.adapter.FindTaskByIdMappingSqlQuery;
import com.example.demo.adapter.FindTaskByIdSpi;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.print.attribute.standard.Fidelity;
import javax.sql.DataSource;

@Configuration
public class DecoratorBeans {
    @Bean
    public Cache cache(CacheManager cacheManager) {
        return cacheManager.getCache("taskCache");
    }
    @Bean
    public FindTaskByIdSpi findTaskByIdSpi(DataSource dataSource, Cache cache){
        return new SpringCachingFindTaskByIdDecorator(new FindTaskByIdMappingSqlQuery(dataSource), cache);
    }

}
