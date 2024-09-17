package com.nageoffer.shortlink.admin.toolkit;

import java.util.Random;

/**
 * title:
 * author:Lv Haoyuan
 * date:2024-09-17
 * description:分组ID随机生成树
 */
public final class RandomGenerator {
    // 定义字符池，包含大写字母、小写字母和数字
    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // 定义随机字符串的长度
    private static final int STRING_LENGTH = 6;

    // 随机数生成器
    private static final Random random = new Random();

    /**
     * 生成一个6位包含字母和数字的随机字符串
     * @return 随机字符串
     */
    public static String generateRandomString() {
        StringBuilder result = new StringBuilder(STRING_LENGTH);
        for (int i = 0; i < STRING_LENGTH; i++) {
            // 从字符池中随机选择一个字符，并追加到结果字符串
            result.append(CHAR_POOL.charAt(random.nextInt(CHAR_POOL.length())));
        }
        return result.toString();
    }

}
