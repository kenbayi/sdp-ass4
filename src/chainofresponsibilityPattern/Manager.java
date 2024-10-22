package chainofresponsibilityPattern;

public class Manager extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved $" + request.getAmount() + " expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
