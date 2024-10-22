package chainofresponsibilityPattern;

public class ApprovalChain {
    public static Approver setupChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();


        teamLead.setNextApprover(manager);


        return teamLead;
    }
}

