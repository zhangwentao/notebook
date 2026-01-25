import java.util.*; // 导入工具库，类似 JS 的 import
import java.util.stream.Collectors;

/**
 * 这是一个包含 Java 常用特性的 HelloWorld 程序
 */
public class JavaTour {

    // 1. 定义一个静态内部类（类似前端的对象定义或类）
    static class User {
        private String name;
        private int age;

        // 构造函数
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter 方法 (Java 传统的封装)
        public String getName() { return name; }
        public int getAge() { return age; }
    }

    // 2. 主程序入口 (类似 C 语言或 Node 的入口文件)
    public static void main(String[] args) {
        System.out.println("🚀 开始 Java 特性之旅...");

        // 3. 集合与泛型 (类似 JS 的 Array，但必须指定元素类型)
        List<User> users = Arrays.asList(
            new User("Alice", 25),
            new User("Bob", 17),
            new User("Charlie", 30),
            new User("David", 15)
        );

        // 4. Stream API 与 Lambda 表达式 (前端同学最熟悉的 map/filter)
        System.out.println("\n--- 过滤出成年人并提取名字 ---");
        List<String> adultNames = users.stream()
            .filter(u -> u.getAge() >= 18)        // 过滤逻辑
            .map(User::getName)                  // 转换逻辑 (方法引用)
            .collect(Collectors.toList());        // 终结操作：转回列表

        adultNames.forEach(name -> System.out.println("成年人: " + name));

        // 5. 异常处理 (Try-Catch)
        System.out.println("\n--- 测试异常处理 ---");
        try {
            int result = divide(10, 0);
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.err.println("错误捕获: " + e.getMessage());
        } finally {
            System.out.println("无论是否出错，我都会执行 (类似清理操作)");
        }

        // 6. 简单的条件判断与循环
        if (adultNames.size() > 0) {
            System.out.println("\n🎉 演示结束，Java 欢迎你！");
        }
    }

    // 一个简单的静态工具方法
    public static int divide(int a, int b) {
        return a / b;
    }
}