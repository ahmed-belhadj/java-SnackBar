package com.company;

public class Customer
{
    private int id;
    private String name;
    private double cash;

    public Customer(int id, String name, double cash)
    {
        this.id = id;
        this.name = name;
        this.cash = cash;
    }

    public void addCash(double addedCash)
    {
        this.cash = cash + addedCash;
    }

    public void buy(double givenCash)
    {
        this.cash = cash - givenCash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCash()
    {
        return cash;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cash=" + cash +
                '}';
    }
}
