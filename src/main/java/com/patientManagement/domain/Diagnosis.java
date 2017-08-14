package com.patientManagement.domain;

import java.io.Serializable;

/**
 * Created by tmoshasha on 2017/08/08.
 */
public class Diagnosis implements Serializable {
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Diagnosis(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
    }


    public static class Builder{
        private String id;
        private String name;
        private String description;


        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public Diagnosis build(){
            return new Diagnosis(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diagnosis diagnosis = (Diagnosis) o;

        return !(id != null ? !id.equals(diagnosis.id) : diagnosis.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
