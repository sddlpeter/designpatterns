package com.atguigu.responsibilitychain;

public class SchoolMasterApprover extends Approver{


    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000f) {
            System.out.println("请求编号id = " +purchaseRequest.getId() + " 被" + this.name + " 处理");
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
