class Solution {
    public String removeDigit(String number, char digit) {
        String best = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);

                if (best.equals("") || temp.compareTo(best) > 0) {
                    best = temp;
                }
            }
        }
        return best;
    }
}