package com.inzy.ds.amazon;

public class Problems {
    int replace0with5(int num) {
        int output = num;
        int temp = 1;
        if (num == 0) {
            num = num + (5 * temp);
        }

        while (output > 0) {
            if (output % 10 == 0) {
                num = num + (temp * 5);
            }
            output = output / 10;
            temp = temp * 10;
        }
        return num;
    }
}
