package com.headFirst_OOAD.chapter1;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private Integer numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Integer numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }


    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood sbackWood) {
        backWood = sbackWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood sTopWood) {
        topWood = sTopWood;
    }

    public Integer getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(Integer numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return builder == that.builder && Objects.equals(model, that.model) && type == that.type && backWood == that.backWood && topWood == that.getTopWood() && Objects.equals(numStrings, that.numStrings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, type, backWood, topWood, numStrings);
    }
}
