package com.example.recycleview;

public class Android {
    private String Name;
    private String Number;
    private int Photo;

    public Android() {
    }

    public Android(String name, String number, int photo) {
        Name = name;
        Number = number;
        Photo = photo;
    }

    //Now use the Getter

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public int getPhoto() {
        return Photo;
    }

    //Now use Setter

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
