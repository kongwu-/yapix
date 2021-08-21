package io.yapix.parse.util;

public class PathUtils {

    /**
     * 路径处理, 会增加前缀
     */
    public static String path(String path) {
        if (path == null || path.equals("")) {
            return null;
        }
        if (path.startsWith("/")) {
            return path.trim();
        }
        return "/" + path.trim();
    }

    /**
     * 路径拼接
     */
    public static String path(String path, String subPath) {
        path = path(path);
        subPath = path(subPath);
        if (path == null) {
            return path(subPath);
        }
        if (subPath == null) {
            return path;
        }
        return path(path) + path(subPath);
    }

}
