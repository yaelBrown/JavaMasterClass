public class PasswordsLecture {

    public static void main(String[] args) {

            // hashing a password
            String password = "password";
            String hash = BCrypt.hashpw(password, BCrypt.gensalt());
    //        String hash1 = BCrypt.hashpw(password, BCrypt.gensalt());
    //        System.out.println(hash);
    //        System.out.println(hash1);

            // salt and log_rounds
    //        String salt1 = BCrypt.gensalt(10);
    //        String salt2 = BCrypt.gensalt(10);
    //        System.out.println(salt1);
    //        System.out.println(salt1);
    //        System.out.println(salt2);
    //        System.out.println(BCrypt.hashpw("password", salt1));
    //        System.out.println(BCrypt.hashpw("password", salt1));
    //        System.out.println(BCrypt.hashpw("password", salt2));

            // $2a$10$e.9EKJlYg9utnxB6Ao6s3e
    //        String fixedSalt = "$2a$10$e.9EKJlYg9utnxB6Ao6s3e";
    //        String hash2 = BCrypt.hashpw("password", fixedSalt);
    //        System.out.println("$2a$10$e.9EKJlYg9utnxB6Ao6s3edsBJUF6HMZML1rGsT3PELqYZGKkyb26");
    //        System.out.println(hash2);

            // Verifying Password
    //        boolean match = BCrypt.checkpw("password123", hash);
    //        System.out.println(hash);
    //        System.out.println(match);

    //        boolean match2 = BCrypt.checkpw(password, hash2);
    //        System.out.println(hash2);
    //        System.out.println(match);

            // must store hashed passwords before saving to database
            // do not hash passwords more than once
            // may do the hashing in the Model or Dao or Servlet (but only once)

    }

}