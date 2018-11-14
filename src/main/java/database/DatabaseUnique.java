package database;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import config.Config;
import flowers.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DatabaseUnique {
    private static DatabaseUnique ourInstance;
    private static BufferedWriter file;

    public static DatabaseUnique getInstance() throws IOException {
        if (ourInstance == null) {
            ourInstance = new DatabaseUnique();
        }
        return ourInstance;
    }

    private DatabaseUnique() throws IOException{
        file = new BufferedWriter(new FileWriter("database.txt", true));
    }

    public void add(Order order) throws IOException {
        String user = Config.USER;
        if (file == null) {
            file = new BufferedWriter(new FileWriter("database.txt", true));
        }
        file.append(order.toString());
        file.newLine();
    }

    public void commit() throws IOException{
        file.close();
        file = null;
    }
}
