package com.example.demoweather;

public class Weather {

    private String area;
    private String forcast;

    public Weather(String area, String forcast) {
        this.area = area;
        this.forcast = forcast;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getForcast() {
        return forcast;
    }

    public void setForcast(String forcast) {
        this.forcast = forcast;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "area='" + area + '\'' +
                ", forcast='" + forcast + '\'' +
                '}';
    }
}
