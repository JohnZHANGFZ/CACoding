package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataClearObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataClearObject, ClearOutputBoundary clearPresenter){
        this.userDataClearObject = userDataClearObject;
        this.clearPresenter = clearPresenter;
    }
    @Override
    public ArrayList<String> execute() {
        ArrayList<String> deletedUsers = userDataClearObject.getAllNames();
        boolean deleted = userDataClearObject.deleteAll();
        if (! deleted) {
            clearPresenter.prepareFailView("Fail to delete all user accounts");
        } else {
            ClearOutputData clearOutputData = new ClearOutputData(deleted, deletedUsers);
            clearPresenter.prepareSuccessView(clearOutputData);
        }
        return deletedUsers;
    }
}
