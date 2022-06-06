package com.sparkle.web;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * ClassName : T<br>
 * Description : T<br>
 *
 * @author : sj
 * @date : 2022/3/9
 */
public class T {


    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(sdf.format(calendar.getTime()));
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
