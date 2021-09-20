package com.company;



class Zd1 {


    public static void main(String[] args) {
        var o = new Zd2(0, 0);
        int x, y;
        for (x = 1; x <= 8; x++) {
            for (y = 1; y <= 8; y++) {
                o.setX(x);
                o.setY(y);
                System.out.print(o.Sub());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}