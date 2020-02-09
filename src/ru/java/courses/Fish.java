package ru.java.courses;

public class Fish {
    private String name;
    private double price;
    private double date;
    private int value;

   public Fish(){}

   public String getName() { return name;}
    public double getPrice(){
        return price;
    }


    public double getDate() {
        return date;
    }
    public void setDate(double date) {
        this.date = date;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    private Fish (Builder builder ){

        this.name = builder.name;
        this.price = builder.price;
        this.date = builder.date;
        this.value = builder.value;
    }
    static class Builder{
        private String name;
        private double price;
        private double date;
        private int value;

        public Builder(String name){
            this.name = name;
        }
        public Builder setPrice(double price){
            this.price = price;
            return this;
        }
        public Builder setDate(double date) {
            this.date = date;
            return this;
        }
        public Builder setValue(int value) {
            this.value = value;
            return this;
        }
        public Fish build(){
          return new Fish(this);
        }
    }

    @Override
    public String toString() {
        return this.name + " - " + this.value + " - " + this.date +" - " + this.price;
    }
}
