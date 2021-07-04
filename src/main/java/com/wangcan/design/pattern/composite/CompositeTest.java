package com.wangcan.design.pattern.composite;

/**
 * @author: wangcan
 * @date: 2021/7/4 20:08
 */
public class CompositeTest {

    public static void main(String[] args) {
        Folder root = new Folder("笔记");
        File note1 = new File("2019.md", " 吃饭");
        File note2 = new File("2020.md", "干饭");
        root.add(note1);
        root.add(note2);

        Folder child1 = new Folder("照片");
        File file1 = new File("美女.jpg", "# 美女");
        Folder child2 = new Folder("src");
        File file2 = new File("帅哥.jpg", "帅哥");

        child1.add(file1);
        child2.add(file2);
        root.add(child1);
        root.add(child2);

        root.print();

    }
}
