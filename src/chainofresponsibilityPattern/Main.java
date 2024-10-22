package chainofresponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        Approver approverChain = ApprovalChain.setupChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Team Building");
        ExpenseRequest request2 = new ExpenseRequest(3000, "Project Materials");

        approverChain.approveRequest(request1); // Approved by TeamLead
        approverChain.approveRequest(request2); // Approved by Manager
    }
}

