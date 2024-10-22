package chainofresponsibilityPattern;

public class TeamLead extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("TeamLead approved $" + request.getAmount() + " expense for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}