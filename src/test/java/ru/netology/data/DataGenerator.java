package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("en"));

    public static String getFirsNumberCard() {
        return ("4444 4444 4444 4441");
    }

    public static String getSecondNumberCard() {
        return ("4444 4444 4444 4442");

    }

    public static String getInvalidNumberCard() {
        return faker.finance().creditCard();
    }

    public static String getShortNumberCard() {
        return faker.numerify("#### #### ####");
    }

    public static String getMonthCard(int plusMonth) {
        return LocalDate.now().plusMonths(plusMonth).format(DateTimeFormatter.ofPattern("MM"));

    }

    public static String getInvalidMonthCardWithOneDigit() {
        return faker.numerify("#");

    }

    public static String getMonthCardInvalidPeriod() {
        return "13";

    }

    public static String getYearCard(int plusYears) {
        return LocalDate.now().plusYears(plusYears).format(DateTimeFormatter.ofPattern("YY"));

    }

    public static String getInvalidYearCard() {
        return faker.numerify("#");
    }

    public static String getCardHolder() {
        return faker.name().name();
    }

    public static String getInvalidCardHolder() {
        return faker.name().firstName();

    }

    public static String getInvalidCardHolderCyrillic() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().name();
    }

    public static String getInvalidCardHolderWithDigit() {
        return faker.name().firstName() + faker.numerify("#");
    }

    public static String getInvalidCardHolderWithOneLetter() {
        return "I";
    }

    public static String getCvc() {
        return faker.numerify("###");
    }

    public static String getInvalidCvc() {
        return faker.numerify("#");
    }
}
