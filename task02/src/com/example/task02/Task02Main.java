package com.example.task02;

import java.io.IOException;


public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test

        int inpOne =   System.in.read();
        while (inpOne != -1) {
            int inpTwo = System.in.read();
            if (inpTwo != 10 || inpOne != 13) {
                System.out.write(inpOne);
            }
            inpOne = inpTwo;
        }
        System.out.flush();
    }
}
