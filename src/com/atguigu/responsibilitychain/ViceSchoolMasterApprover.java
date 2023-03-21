package com.atguigu.responsibilitychain;

public class ViceSchoolMasterApprover extends Approver{
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000f && purchaseRequest.getPrice() <= 30000f) {
            System.out.println("请求编号id = " +purchaseRequest.getId() + " 被" + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
