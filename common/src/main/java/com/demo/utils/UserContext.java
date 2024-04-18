package com.demo.utils;

/**
 * @author dings
 * @since 2024/3/9 23:22
 */
public class UserContext {
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static String getUserInfo() {
        return THREAD_LOCAL.get();
    }

    public static void setUserInfo(String userInfo) {
        System.out.println("setUserInfo, userInfo: " + userInfo);
        THREAD_LOCAL.set(userInfo);
    }

    public static void removeUser() {
        THREAD_LOCAL.remove();
    }
}
