package com.bootcamp.springromannumbers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class convertNumberController {

    @GetMapping("/{num}")
    public String getRomanNumber(@PathVariable int num ) {
        int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "X", "IX", "V", "IV", "I"};
        int backupNum = num;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            if (num >= decimalValues[i]) {

                while(num >= decimalValues[i]) {
                    result.append(romanLetters[i]);
                    num -= decimalValues[i];
                }

            }
        }

        return ("Decimal: " + backupNum + " | Romano: " + result.toString());
    }
}
