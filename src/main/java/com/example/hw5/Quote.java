package com.example.hw5;

import jakarta.validation.constraints.Size;

public class Quote {

    @Size(max=30, message = "Quote must be less 30 chars")
    private String quote;

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }
}
