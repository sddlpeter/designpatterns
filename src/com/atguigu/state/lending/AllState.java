package com.atguigu.state.lending;

public class AllState {
}

class FeedbackState extends AbstractState {
    @Override
    public String getCurrentState() {
        // return StateEnum.FEED_BACKED.getValue();
        return "";
    }
}

class GenerateState extends AbstractState {
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }
    public void checkFailEvent(Context context) {
        context.setState(new FeedbackState());
    }

    public String getCurrentState() {
        return "";
    }
}

class NotPayState extends AbstractState {
    @Override
    public void payOrderEvent(Context context) {

    }

    @Override
    public void feedbackEvent(Context context) {
        super.feedbackEvent(context);
    }

    @Override
    public String getCurrentState() {
        return super.getCurrentState();
    }
}


class PaidState extends  AbstractState {
    @Override
    public void feedbackEvent(Context context) {
        super.feedbackEvent(context);
    }

    @Override
    public String getCurrentState() {
        return super.getCurrentState();
    }
}

class PublishState extends AbstractState {
    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        //return StateEnum.PUBLISHED.getValue();
        return "";
    }
}

class ReviewState extends AbstractState {
    @Override
    public void makePriceEvent(Context context) {
        super.makePriceEvent(context);
    }

    @Override
    public String getCurrentState() {
        return super.getCurrentState();
    }
}
