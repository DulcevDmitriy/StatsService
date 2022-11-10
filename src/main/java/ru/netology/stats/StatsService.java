package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
   public long sum(long[] sales){
       long sum =0;
       for (long sale : sales) {
           sum += sale;
           
       }
       return sum;
   }

   public long average(long [] sales) {
       return sum(sales) /12;
   }

   public int belowAverege(long[] sales){
       long avg = average(sales);
       int count=0;
       for (long sale : sales) {
           if (sale <avg){
               count++;
           }
       }
       return count;
   }
}