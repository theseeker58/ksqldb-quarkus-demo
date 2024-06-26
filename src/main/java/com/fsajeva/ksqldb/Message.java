package com.fsajeva.ksqldb;

import io.quarkus.runtime.annotations.RegisterForReflection;

public class Message {
    private String sender;
    private String sequence;
    private String text;

    public Message() {
    }

    public Message(String sender, String sequence, String text) {
        this.sender = sender;
        this.sequence = sequence;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
