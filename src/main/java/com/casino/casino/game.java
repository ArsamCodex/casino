package com.casino.casino;

import java.util.Arrays;
import java.util.Random;

public class game {

    int total = 500;
    int number ;
    int rouletteNum;
    int resultArr[] = new int[36];
    int betAmount;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRouletteNum() {
        return rouletteNum;
    }

    public void setRouletteNum(int rouletteNum) {
        this.rouletteNum = rouletteNum;
    }

    public int[] getResultArr() {
        return resultArr;
    }

    public void setResultArr(int[] resultArr) {
        this.resultArr = resultArr;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void setBetAmount(int betAmount) {
        this.betAmount = betAmount;
    }

    @Override
    public String toString() {
        return "game{" +
                "total=" + total +
                ", number=" + number +
                ", rouletteNum=" + rouletteNum +
                ", resultArr=" + Arrays.toString(resultArr) +
                ", betAmount=" + betAmount +
                '}';
    }

    public void startGame(){
        Random generator = new Random();
        rouletteNum = generator.nextInt(36);
    }

    boolean oddOrEven(int incomingNumber){
        boolean even  = false;
        if (incomingNumber == 0){
            even = true;
        }
        if (incomingNumber %2 == 0){
            even = true;
        }
        if (incomingNumber%2 ==1){
            even = false;
        }
        return even;
    }
}
