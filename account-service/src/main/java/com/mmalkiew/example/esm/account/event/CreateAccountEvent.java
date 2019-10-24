package com.mmalkiew.example.esm.account.event;

import com.google.common.base.MoreObjects;

import java.math.BigDecimal;

public class CreateAccountEvent {

    private String id;
    private String name;
    private BigDecimal balance;

    private CreateAccountEvent(Builder builder) {
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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("id", id)
                          .add("name", name)
                          .add("balance", balance)
                          .toString();
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

        public CreateAccountEvent build() {
            return new CreateAccountEvent(this);
        }
    }
}
