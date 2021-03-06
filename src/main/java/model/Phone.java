package model;

import java.util.Objects;

//@Builder
//@Getter
public class Phone {
    private int age;
    private String carrier;
    private Integer id;
    private String imageUrl;
    private String name;
    private String snippet;
    private Integer phonedetail_id;

    public Phone() {
    }

    public Phone(int age, String carrier, Integer id, String imageUrl, String name, String snippet) {
        this.age = age;
        this.carrier = carrier;
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.snippet = snippet;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public void setPhonedetail_id(Integer phonedetail_id) {
        this.phonedetail_id = phonedetail_id;
    }


    public int getAge() {
        return age;
    }

    public String getCarrier() {
        return carrier;
    }

    public Integer getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getSnippet() {
        return snippet;
    }

    public Integer getPhonedetail_id() {
        return phonedetail_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return age == phone.age &&
                Objects.equals(carrier, phone.carrier) &&
                Objects.equals(id, phone.id) &&
                Objects.equals(imageUrl, phone.imageUrl) &&
                Objects.equals(name, phone.name) &&
                Objects.equals(snippet, phone.snippet) &&
                Objects.equals(phonedetail_id, phone.phonedetail_id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, carrier, id, imageUrl, name, snippet, phonedetail_id);
    }
}
