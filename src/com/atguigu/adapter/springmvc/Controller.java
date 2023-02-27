package com.atguigu.adapter.springmvc;

public interface Controller {

}
class HttpController implements Controller {
    public void doHttpController() {
        System.out.println("http ...");
    }
}

class SimpleController implements Controller {
    public void doSimpleController() {
        System.out.println("simple ...");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationController() {
        System.out.println("annotation ...");
    }
}
