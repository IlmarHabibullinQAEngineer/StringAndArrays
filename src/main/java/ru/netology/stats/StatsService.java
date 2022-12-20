package ru.netology.stats;


import java.util.Arrays;

public class StatsService {

    public long allSumSales(long[] sales) { //Рассчет всей суммы продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmount(long[] sales) { //Средняя сумма продаж в месяц
        return allSumSales(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {  //Пик продаж
        int maxMonth = 0;
        long maxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {  //Минимум продаж
        int minMonth = 0;
        long minSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {  //Количество месяцев, продажи ниже срежнего
        long averageSales = averageAmount(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int salesAboveAverage(long[] sales) {  //Количество месяцев, выше среднего продаж
        long averageSales = averageAmount(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}
