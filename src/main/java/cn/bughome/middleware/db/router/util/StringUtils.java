package cn.bughome.middleware.db.router.util;

/**
 * Created by MaxWell on 2025/1/6 16:48
 */
public class StringUtils {
    /**
     * 中划线转驼峰
     *
     * @param input 输入
     * @return 驼峰
     */
    public static String middleScoreToCamelCase(String input){
        StringBuilder result = new StringBuilder();
        boolean nextUpperCase = false;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '-') {
                nextUpperCase = true;
            } else {
                if (nextUpperCase) {
                    result.append(Character.toUpperCase(currentChar));
                    nextUpperCase = false;
                } else {
                    result.append(currentChar);
                }
            }
        }
        return result.toString();
    }
}
