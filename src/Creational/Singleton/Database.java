package Creational.Singleton;

public final class Database {
    private static Database database;

    private Database() {
        System.out.println("make connection database...");
    }

    public static Database getDatabase() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }
}
