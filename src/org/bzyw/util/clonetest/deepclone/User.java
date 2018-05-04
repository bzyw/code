package org.bzyw.util.clonetest.deepclone;

/**
 * Created by bzyw on 2018/5/4.
 */
public class User implements Cloneable {
    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public User clone() {
        User user = null;
        try {

            user = (User) super.clone();
            Address addressClone = address.clone();
            user.setAddress(addressClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
