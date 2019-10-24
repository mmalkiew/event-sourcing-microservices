package com.mmalkiew.example.esm.account.configuration;

import com.mmalkiew.example.esm.account.aggregate.AccountAggregate;
import com.mongodb.MongoClient;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.extensions.mongo.DefaultMongoTemplate;
import org.axonframework.extensions.mongo.MongoTemplate;
import org.axonframework.extensions.mongo.eventsourcing.eventstore.MongoEventStorageEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountCommandConfiguration {

    @Bean
    public EventStorageEngine storageEngine(MongoClient client) {
        return MongoEventStorageEngine.builder()
                                      .mongoTemplate(createMongoTemplate(client))
                                      .build();
    }

    @Bean
    public EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore){
        return EventSourcingRepository.builder(AccountAggregate.class)
                                      .eventStore(eventStore)
                                      .build();
    }

    private MongoTemplate createMongoTemplate(MongoClient client) {
        return DefaultMongoTemplate.builder()
                                   .mongoDatabase(client)
                                   .build();
    }
}
