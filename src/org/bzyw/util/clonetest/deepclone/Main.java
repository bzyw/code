package org.bzyw.util.clonetest.deepclone;

/**
 * Created by bzyw on 2018/5/4.
 */
public class Main {
    public static void main(String[] args) {
        Address address = new Address("China", "Chengdu");
        User user = new User("bzyw", address);

        User userClone = user.clone();
        userClone.setName("bzyw1");
        userClone.getAddress().setCountry("Germany");

        System.out.println("user name:" + user.getName());
        System.out.println("user(clone) name:" + userClone.getName());

        System.out.println("user country:" + user.getAddress().getCountry());
        System.out.println("user(clone) country:" + userClone.getAddress().getCountry());
    }
}
