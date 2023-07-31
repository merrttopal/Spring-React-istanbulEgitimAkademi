package com.configs;

import org.aspectj.bridge.IMessage;

import javax.transaction.xa.XAException;

public class ResourceNotFoundException extends XAException {
    public ResourceNotFoundException(String message) {
    }
}
