package com.avc.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;

public class HelloUserLambdaHandler {

    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello " + input + "!!";
    }
}
