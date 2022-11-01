package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    String model;
    int series;
    int yearOfIssue;

    public Car() {
    }

    public Car(String model, int series, int yearOfIssue) {
        this.model = model;
        this.series = series;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
