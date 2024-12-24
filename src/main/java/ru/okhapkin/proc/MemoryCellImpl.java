package ru.okhapkin.proc;


import java.util.function.Consumer;
import java.util.function.Supplier;

public class MemoryCellImpl implements MemoryCell {
    private final Supplier<Character> reader;
    private final Consumer<Character> writer;

    @Override
    public char read() {
        return reader.get();
    }

    @Override
    public void write(char value) {
        writer.accept(value);
    }

    public MemoryCellImpl(Supplier<Character> reader, Consumer<Character> writer) {
        this.reader = reader;
        this.writer = writer;
    }
}
