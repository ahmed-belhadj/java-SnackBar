package com.company;

public class Snack
{
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(int id, String name, int quantity, double cost, int vendingMachineId)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int givenQuantity)
    {
        this.quantity = quantity + givenQuantity;
    }

    public double getCost(int givenQuantity)
    {
        return cost * givenQuantity;
    }

    @Override
    public String toString()
    {
        return "Snack{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                ", vendingMachineId=" + vendingMachineId +
                '}';
    }
}
