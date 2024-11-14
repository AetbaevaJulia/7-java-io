package com.example.task02;

import java.io.IOException;
import java.util.ArrayList;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prevNum = System.in.read();
        int nextNum;
        while (prevNum != -1){
            nextNum = System.in.read();
            if (prevNum != 13 || nextNum != 10){
                System.out.write(prevNum);
            }
            prevNum = nextNum;
        }
        System.out.flush();
    }
}
