package com.example.laundary3;

public class datastore {
    private int id;
    private String tshirt;
    private String shorts;
    private String npant;
    private String bedsheet;
    private String pillowsheet;
    private String banayan;
    private String date;
    private String duedate;

    public datastore(int id, String tshirt, String shorts, String npant, String bedsheet, String pillowsheet, String banayan, String date, String duedate) {
        this.id = id;
        this.tshirt = tshirt;
        this.shorts = shorts;
        this.npant = npant;
        this.bedsheet = bedsheet;
        this.pillowsheet = pillowsheet;
        this.banayan = banayan;
        this.date = date;
        this.duedate = duedate;
    }

    public datastore(int id, String tshirt, String shorts, String npant, String bedsheet, String pillowsheet, String banayan) {
        this.id = id;
        this.tshirt = tshirt;
        this.shorts = shorts;
        this.npant = npant;
        this.bedsheet = bedsheet;
        this.pillowsheet = pillowsheet;
        this.banayan = banayan;
    }

    public String getDate() {
        return date;
    }

    public String getDuedate() {
        return duedate;
    }

    public int getId() {
        return id;
    }

    public String getShorts() {
        return shorts;
    }

    public String getNpant() {
        return npant;
    }

    public String getBedsheet() {
        return bedsheet;
    }

    public String getPillowsheet() {
        return pillowsheet;
    }

    public String getBanayan() {
        return banayan;
    }

    public String getTshirt() {
        return tshirt;
    }

    public void setTshirt(String tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public String toString() {
        return "Date :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+date+"\n\n"+
                "T-Shirt :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + tshirt +"\n\n"+
                "Banyan :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + banayan+"\n\n"+
                "Shorts :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+ shorts + "\n\n"+
                "N-pant :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + npant + "\n\n"+
                "Bedsheet :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + bedsheet + "\n\n"+
                "PillowCover :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + pillowsheet + "\n\n"+
                "Due-Date :\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +duedate
                ;
    }

}
