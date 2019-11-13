package com.example.bleappmovil.objects;

public class LogMessage {
    private String body;
    private String timestamp;
    private String type;

    public LogMessage(String body, String timestamp, String type) {
        this.body = body;
        this.timestamp = timestamp;
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
