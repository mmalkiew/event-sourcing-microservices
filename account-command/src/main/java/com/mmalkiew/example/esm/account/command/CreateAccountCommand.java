package com.mmalkiew.example.esm.account.command;

import java.math.BigDecimal;

public class CreateAccountCommand {

    private String id;
    private String name;
    private BigDecimal balance;

    private CreateAccountCommand(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.balance = builder.balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String id;
        private String name;
        private BigDecimal balance;

        private Builder() {
        }

        public Builder withId(String val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withBalance(BigDecimal val) {
            balance = val;
            return this;
        }

        public CreateAccountCommand build() {
            return new CreateAccountCommand(this);
        }
    }
}
