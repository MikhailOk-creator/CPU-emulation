package ru.okhapkin.proc;

/**
 * Память для данных
 */
public class DataMemory implements Memory {
    public static final int SIZE = 1024;

    private final char[] memory = new char[SIZE];

    public char[] getMemory() {
        return memory;
    }

    @Override
    public char read(int address) {
        return this.memory[address];
    }

    @Override
    public void write(int address, char value) {
        this.memory[address] = value;
    }
}
