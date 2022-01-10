package com.example.observertp.handler;

import com.example.observertp.observable.Demande;
import lombok.Data;

@Data
public abstract class Handler {
    protected Demande demande;
    protected Handler nextHandler;
    public abstract void handle();
}
