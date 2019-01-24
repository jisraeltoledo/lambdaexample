package com.klar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimplestLambda implements RequestHandler {

    @Override
    public Object handleRequest(Object o, Context context) {
        System.out.println("Hello, " + o.toString());
        return "Hello from Lambda: "+o.toString();
    }
}