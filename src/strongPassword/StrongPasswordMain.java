package strongPassword;

class Result {
    
    /* STRONG PASSWORD
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */
    
    public static int minimumNumber (int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;
        String specialCharacters = "!@#$%^&*()-+";
        
        if (password.chars()
                    .noneMatch(Character::isDigit))
            count++;
        if (password.chars()
                    .noneMatch(Character::isLowerCase))
            count++;
        if (password.chars()
                    .noneMatch(Character::isUpperCase))
            count++;
        if (password.chars()
                    .noneMatch(ch -> specialCharacters.indexOf(ch) >= 0))
            count++;
        
        if (n < 6) {
            count += 5 - n;
        }
        return count;
    }
}

public class StrongPasswordMain {
    
    public static void main (String[] args) {
        System.out.println(Result.minimumNumber(3, "Ab1")); // Should print 3
        System.out.println(Result.minimumNumber(11, "#HackerRank")); // Should print 1
    }
}