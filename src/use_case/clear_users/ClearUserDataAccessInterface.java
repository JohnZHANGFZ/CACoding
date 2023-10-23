package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.List;

public interface ClearUserDataAccessInterface {
    ArrayList<String> getAllNames();

    boolean deleteAll();
}
