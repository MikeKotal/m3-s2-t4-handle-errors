package ru.yandex.practicum.exceptions;

import lombok.Getter;

@Getter
public class HappinessOverflowException extends RuntimeException{
    private final Integer happinessLevel;

    public HappinessOverflowException(String message, int happinessLevel) {
        super(message);
        this.happinessLevel = happinessLevel;
    }
}
