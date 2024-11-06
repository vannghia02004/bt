package com.mycompany.baitap1;
import java.util.Random;
import java.util.Scanner;

public class Baitap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        
        do {
            System.out.println("");
            System.out.println("Chon bai tap (1-4, 0 de thoat):");
            System.out.println("BT 1. Tro choi doan so");
            System.out.println("BT 2. Day so Fibonacci");
            System.out.println("BT 3. Bang cuu chuong");
            System.out.println("BT 4. Tam giac so");
            luaChon = scanner.nextInt();
            
            switch (luaChon) {
                case 1: troChoiDoanSo(); break;
                case 2: daySoFibonacci(); break;
                case 3: bangCuuChuong(); break;
                case 4: tamGiacSo(); break;
            }
        } while (luaChon != 0);
        
        scanner.close();
    }

    public static void troChoiDoanSo() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int so = random.nextInt(50) + 1;
        int doan;
        int soLanDoan = 0;

        System.out.println("Hay doan mot so tu 1 den 50:");
        
        do {
            doan = scanner.nextInt();
            soLanDoan++;
            
            if (doan < so) {
                System.out.println("So cua ban nho hon");
            } else if (doan > so) {
                System.out.println("So cua ban lon hon");
            }
        } while (doan != so);
        
        System.out.println("Chinh xac! Ban da doan dung sau " + soLanDoan + " lan!");
    }

    public static void daySoFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu Fibonacci can in:");
        int n = scanner.nextInt();
        
        int dauTien = 0, thuHai = 1;
        
        System.out.print(dauTien);
        if (n > 1) {
            System.out.print(", " + thuHai);
        }
        
        for (int i = 3; i <= n; i++) {
            int tiepTheo = dauTien + thuHai;
            System.out.print(", " + tiepTheo);
            dauTien = thuHai;
            thuHai = tiepTheo;
        }
        System.out.println();
    }

    public static void bangCuuChuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can in bang cuu chuong:");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }

    public static void tamGiacSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong cho tam giac so:");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
} 
