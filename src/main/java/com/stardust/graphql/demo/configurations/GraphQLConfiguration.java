package com.stardust.graphql.demo.configurations;

import com.coxautodev.graphql.tools.SchemaParserDictionary;
import com.stardust.graphql.demo.entities.Bird;
import com.stardust.graphql.demo.entities.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {

    @Bean
    public SchemaParserDictionary dictionary() {
        return new SchemaParserDictionary()
                .add(Dog.class)
                .add(Bird.class);
    }
}
