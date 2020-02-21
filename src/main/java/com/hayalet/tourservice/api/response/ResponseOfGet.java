package com.hayalet.tourservice.api.response;

public class ResponseOfGet<T> {
    private final T result;

    public ResponseOfGet(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }
}
