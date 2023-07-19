package com.auto.germany;




    public class Box {
        private int width;
        private int height;
        private int length;
        private int volume;

        public Box(int width, int height, int length) {
            this.width = width;
            this.height = height;
            this.length = length;
            this.volume = width * height * length;
            System.out.println("Объем коробки " + this.volume);
        }
    }

