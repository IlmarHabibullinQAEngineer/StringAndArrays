package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void sumAllSales() { //Общая сумма продаж
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.allSumSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmount() { //Средняя сумма продаж в месяц
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / month.length;
        long actual = service.averageAmount(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonth() { //Пик продаж
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSalesMonth(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonth() { //Минимум продаж
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesMonth(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesBelowAverage(){ //Количество месяцев, продажи ниже срежнего
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesBelowAverage(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesAboveAverage(){ //Количество месяцев, выше среднего продаж
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.salesAboveAverage(month);
        Assertions.assertEquals(expected, actual);
    }
}
