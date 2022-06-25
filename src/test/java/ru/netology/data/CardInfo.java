package ru.netology.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class CardInfo {
    private String numberCard;
    private String month;
    private String year;
    private String cardHolder;
    private String cvc;

}
