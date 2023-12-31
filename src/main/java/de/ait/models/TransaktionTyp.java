package de.ait.models;

/**
 * @author Andrej Reutow
 * created on 16.06.2023
 */
public enum TransaktionTyp {

    DEBIT(1),
    CREDIT(2);

    private int key;

    TransaktionTyp(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
