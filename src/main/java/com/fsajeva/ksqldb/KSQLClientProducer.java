package com.fsajeva.ksqldb;

import io.confluent.ksql.api.client.Client;
import io.confluent.ksql.api.client.ClientOptions;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class KSQLClientProducer {
    @Produces
    Client ksqlClient() {
        ClientOptions options = ClientOptions.create()
                .setHost("localhost")
                .setPort(8088);
        return Client.create(options);
    }
}
