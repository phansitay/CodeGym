public class Customer {
    private int stt;
    private String name;
    private String birthday;
    private String address;
    private String img;

    public Customer() {
    }

    public Customer(int stt, String name, String birthday, String address, String img) {
        this.stt = stt;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.img = img;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
