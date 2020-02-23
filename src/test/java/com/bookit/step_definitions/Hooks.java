package com.bookit.step_definitions;

import com.bookit.utilities.DBUtility;
import com.bookit.utilities.Environment;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    /**
     * This hook will work,
     * only if scenario or feature has @api annotation
     */
    @Before("@api")
    public void setupAPI(){
        baseURI = Environment.BASE_URI;
    }

    @Before("@db")
    public void setupDB(){
        DBUtility.createDBConnection(Environment.DB_HOST, Environment.DB_USERNAME, Environment.DB_PASSWORD);
    }

    @After("@db")
    public void teardownDB(){
        DBUtility.destroy();
    }
}