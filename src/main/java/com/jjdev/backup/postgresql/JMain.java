package com.jjdev.backup.postgresql;

/**
 *
 * @author jgilson
 */
public class JMain {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("\n==== Backup PostgreSql ====\n");
            System.out.println("Run with arguments: java -jar backup-postgresql-1.0.jar databaseName databasePassword type");
            System.out.println("type = backup or restore\n\n");
        }

        if (!args[0].isEmpty() && !args[1].isEmpty() && !args[2].isEmpty()) {
            JBackupController backup = new JBackupController();
            backup.executeCommand(args[0], args[1], args[2]);
        }
    }

}
