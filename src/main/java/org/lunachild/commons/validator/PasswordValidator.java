package org.lunachild.commons.validator;

public interface PasswordValidator {

    default boolean alphaCheck(String password, boolean caseIncentive) {


        return false;
    }

}
