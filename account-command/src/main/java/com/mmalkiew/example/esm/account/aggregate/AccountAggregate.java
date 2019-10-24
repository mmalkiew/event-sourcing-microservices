package com.mmalkiew.example.esm.account.aggregate;

import com.mmalkiew.example.esm.account.command.CreateAccountCommand;
import com.mmalkiew.example.esm.account.event.CreateAccountEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
public class AccountAggregate {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountAggregate.class);

    @AggregateIdentifier
    private String id;

    public AccountAggregate() {
    }

    @CommandHandler
    public AccountAggregate(CreateAccountCommand command) {
        LOGGER.info("Command Handle: {}", command);

        apply(CreateAccountEvent.builder()
                                .withId(command.getId())
                                .withName(command.getName())
                                .withBalance(command.getBalance())
                                .build());
    }

    @EventSourcingHandler
    public void handle(CreateAccountEvent event) {
        LOGGER.info("Event Handle: {}", event);
        this.id = event.getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
