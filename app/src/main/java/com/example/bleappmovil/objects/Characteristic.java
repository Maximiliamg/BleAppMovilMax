package com.example.bleappmovil.objects;

public class Characteristic {
    private String title;
    private String subtitle;
    private String uuid;
    private String descriptor;
    private String props;

    public Characteristic(String title, String subtitle, String uuid, String descriptor, String props) {
        this.title = title;
        this.subtitle = subtitle;
        this.uuid = uuid;
        this.descriptor = descriptor;
        this.props = props;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }
}
