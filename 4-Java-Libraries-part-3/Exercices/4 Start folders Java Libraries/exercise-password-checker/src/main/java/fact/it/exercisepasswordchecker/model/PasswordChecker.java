package fact.it.exercisepasswordchecker.model;

public class PasswordChecker {
    private String password;

    public PasswordChecker() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String encrypt(){
        this.password = this.password.replaceAll("[aA]", "@");
        this.password = this.password.replaceAll("[eE]", "3");
        this.password = this.password.replaceAll("[iI]", "1");
        this.password = this.password.replaceAll("[oO]", "0");
        int half = this.password.length() / 2;
        String firstHalf = this.password.substring(0,half);
        return this.password.substring(half) + firstHalf;
    }

    public int countUppercase(){
        int numberOfUppercase = 0;
        for (int i = 0; i < this.password.length(); i++){
            if (Character.isUpperCase(this.password.charAt(i))){
                numberOfUppercase++;
            }
        }
        return numberOfUppercase;
    }

    public String checkSafety(){
        int passwordLength = this.password.length();
        boolean hasSpecialChar = false;
        boolean hasNumber = false;
        int i = 0;
        if (passwordLength >= 8){
            while ((!hasSpecialChar || !hasNumber) && i < this.password.length()){
                if (Character.isDigit(this.password.charAt(i))){
                    hasNumber = true;
                }
                else if (!Character.isDigit(this.password.charAt(i)) && !Character.isAlphabetic(this.password.charAt(i))){
                    hasSpecialChar = true;
                }
                i++;
            }
            if (hasNumber && hasSpecialChar){
                return "Safe";
            }
        }
        return "Unsafe";
    }
}
