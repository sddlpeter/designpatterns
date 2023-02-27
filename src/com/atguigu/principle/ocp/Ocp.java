package com.atguigu.principle.ocp;

import org.w3c.dom.css.Rect;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.draw(new Rectangle());
        ge.draw(new Triangle());
    }
}

class GraphicEditor{
    public void draw(Shape s) {
        if (s.type == 1) {
            drawRectangle(s);
        } else if (s.type == 2) {
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    public void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }
}

class Shape{
    int type;
}

class Rectangle extends Shape{
    public Rectangle() {
        this.type = 1;
    }
}

class Triangle extends Shape {
    public Triangle() {
        this.type = 2;
    }
}
