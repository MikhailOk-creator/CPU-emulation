package ru.okhapkin.proc;

public class Operation {
    /**
     * Код команды
     */
    private final Command commandCode;

    /**
     * Тип адресации
     */
    private final AddressingMode addressingMode;

    public Command getCommandCode() {
        return commandCode;
    }

    public AddressingMode getAddressingMode() {
        return addressingMode;
    }

    public Operation(Command commandCode, AddressingMode addressingMode) {
        this.commandCode = commandCode;
        this.addressingMode = addressingMode;
    }
}
