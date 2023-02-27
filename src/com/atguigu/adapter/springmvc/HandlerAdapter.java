package com.atguigu.adapter.springmvc;

public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handle(Object handler);
}


class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleController();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }
}


class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationController();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }
}

class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpController();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }
}