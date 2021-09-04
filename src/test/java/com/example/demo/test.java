package com.example.demo;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
public class test {

    @Test
    public void test01(){
        System.out.println("aaa");
    }

    @Test
    public void test02(){
        List<User> userList = new ArrayList<>();
        userList.add(new User().setName("z3").setAge("18").setPhone("199999"));
        userList.add(new User().setName("l4").setAge("19").setPhone("199999"));
        userList.add(new User().setName("w5").setAge("19").setPhone("199999"));

        Map<String, List<User>> collect = userList.stream().collect(
                Collectors.groupingBy(user -> user.getAge() + user.getName())
        );

        System.out.println(JSONUtil.toJsonPrettyStr(collect));
    }

    @Test
    public void test03() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }

        for (int i = 0; i < 9; i++) {
            list2.add(i);
        }

        List<Integer> collect = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
        System.out.println("交集：" + collect);
        collect.parallelStream().forEach(System.out::println);

        List<Integer> collect1 = list1.stream().filter(item -> !list2.contains(item)).collect(Collectors.toList());
        System.out.println("差集：" + collect1);
        collect1.parallelStream().forEach(System.out::print);


        System.out.println("git");
        System.out.println("master");

    }
}
