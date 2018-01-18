package com.example.listapp.db;

/**
 * Created by George on 16/01/2018.
 */
import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.example.listapp.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}