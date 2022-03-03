package medrano.marino.hprpg_test.db;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase appDatabase;

    public static final String DB_NAME = "HPRPG";

    public static AppDatabase getInstance(Context context) {
        if (appDatabase == null) {
            synchronized (AppDatabase.class) {
                if (appDatabase == null) {
                    appDatabase = buildDatabase(context.getApplicationContext(), Executors.newSingleThreadExecutor());
                }
            }
        }
        return appDatabase;
    }

    private static AppDatabase buildDatabase(Context context, Executor thread) {
        return Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, AppDatabase.DB_NAME).build();
    }
}
