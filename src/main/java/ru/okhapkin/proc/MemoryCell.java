package ru.okhapkin.proc;

/**
 * Ячейка памяти
 */
public interface MemoryCell {
    /**
     * Возвращает значение
     */
    char read();

    /**
     * Устанавливает значение
     */
    void write(char value);
}
