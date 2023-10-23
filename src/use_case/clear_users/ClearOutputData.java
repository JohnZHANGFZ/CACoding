package use_case.clear_users;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// TODO Complete me

public class ClearOutputData {
    private boolean clearCaseFailed;
    private final ArrayList<String> deleted_users;
    public ClearOutputData(boolean clearCaseFailed, ArrayList<String> deletedUsers){
        this.clearCaseFailed = clearCaseFailed;
        deleted_users = deletedUsers;
    }
    public ArrayList<String> getDeleted_users(){return deleted_users;}
}
