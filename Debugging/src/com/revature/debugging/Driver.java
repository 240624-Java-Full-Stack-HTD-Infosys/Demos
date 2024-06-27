package com.revature.debugging;

import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        BuggyClass bug = new BuggyClass();
        //bug.causeUncheckedException();

        //bug.causeCheckedException();

        //bug.causeUncheckedExceptionAndPassTheBuck();

        bug.causeOneOfManyExceptions();

        //bug.rng();
    }
}
